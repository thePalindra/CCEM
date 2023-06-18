use axum::{
    http::Method,
    Extension,
    routing::{
        get,
        patch,
        delete
    },
    Router
};
use tower_http::cors::{Any, CorsLayer};
use sea_orm::Database;
use dotenvy::dotenv;
use std::env;

mod service;
mod database;

#[tokio::main]
async fn main() {
    dotenv().ok();
    let db_uri = env::var("DATABASE_URL").expect("DATABASE_URL must be set.");
    let database = Database::connect(db_uri).await.unwrap();
    
    let cors: CorsLayer = CorsLayer::new()
        .allow_methods([Method::GET, Method::POST, Method::PUT, Method::PATCH, Method::DELETE])
        .allow_origin(Any)
        .allow_headers(Any);
    
    let routes = Router::new()
        .route("/events", get(service::get_all).post(service::create))
        .route("/:id", delete(service::delete_list))
        .route("/:id/done", patch(service::done))
        .layer(cors).layer(Extension(database));
    
    axum::Server::bind(&"0.0.0.0:8000".parse().unwrap())
        .serve(routes.into_make_service())
        .await
        .unwrap();
}