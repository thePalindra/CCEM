//! `SeaORM` Entity. Generated by sea-orm-codegen 0.11.3

use sea_orm::entity::prelude::*;

#[derive(Clone, Debug, PartialEq, DeriveEntityModel, Eq)]
#[sea_orm(table_name = "events")]
pub struct Model {
    #[sea_orm(primary_key)]
    pub event_id: i32,
    pub space_id: Option<i32>,
    pub time_scope_id: Option<i32>,
    pub name: String,
    pub description: Option<String>,
}

#[derive(Copy, Clone, Debug, EnumIter, DeriveRelation)]
pub enum Relation {
    #[sea_orm(
        belongs_to = "super::spaces::Entity",
        from = "Column::SpaceId",
        to = "super::spaces::Column::SpaceId",
        on_update = "NoAction",
        on_delete = "NoAction"
    )]
    Spaces,
    #[sea_orm(
        belongs_to = "super::time_scopes::Entity",
        from = "Column::TimeScopeId",
        to = "super::time_scopes::Column::TimeScopeId",
        on_update = "NoAction",
        on_delete = "NoAction"
    )]
    TimeScopes,
}

impl Related<super::spaces::Entity> for Entity {
    fn to() -> RelationDef {
        Relation::Spaces.def()
    }
}

impl Related<super::time_scopes::Entity> for Entity {
    fn to() -> RelationDef {
        Relation::TimeScopes.def()
    }
}

impl ActiveModelBehavior for ActiveModel {}
