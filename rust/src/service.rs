use axum::{
    Json,
    response::IntoResponse,
    extract::Path,
    Extension,
    http::StatusCode
};
use serde::Serialize;
use sea_orm::DatabaseConnection;
use crate::database::events::Entity as Events;
use sea_orm::EntityTrait;

#[derive(Serialize)]
pub struct ResponseEvent {
    id: i32,
    name: String
}

pub async fn get_all(Extension(database): Extension<DatabaseConnection>) -> Result<Json<Vec<ResponseEvent>>, StatusCode> {
    let events  = Events::find()
        .all(&database)
        .await
        .map_err(|_error|StatusCode::INTERNAL_SERVER_ERROR)?
        .into_iter()
        .map(|db_task|ResponseEvent{id: db_task.event_id, name: db_task.name})
        .collect();
    
    Ok(Json(events))
}

pub async fn delete_list(Path(_id): Path<String>) -> impl IntoResponse {
}

pub async fn done(Path(_id): Path<String>) -> impl IntoResponse {
}

pub async fn create() -> impl IntoResponse {
}