package com.redcoding.watermyplants.garden.data.sqldelight

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import app.cash.sqldelight.coroutines.mapToOne

import com.redcoding.watermyplants.GardenDatabase
import com.redcoding.watermyplants.GardenDatabaseQueries
import com.redcoding.watermyplants.PlantEntity
import com.redcoding.watermyplants.garden.domain.GardenDataSource
import com.redcoding.watermyplants.garden.domain.Plant

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SqlGardenDataSource(database: GardenDatabase) : GardenDataSource {

    private val queries: GardenDatabaseQueries = database.gardenDatabaseQueries

    override fun getPlants(): Flow<List<Plant>> =
        queries.selectAll()
            .asFlow()
            .mapToList(Dispatchers.IO)
            .map(List<PlantEntity>::toDomain)

    override fun getPlant(id: Long): Flow<Plant> =
        queries.selectById(id)
            .asFlow()
            .mapToOne(Dispatchers.IO)
            .map(PlantEntity::toDomain)

    override suspend fun addPlant(plant: Plant) {
        queries.insertItem(id = plant.id, name = plant.name)
    }

    override suspend fun deletePlan(id: Long) {
        queries.deleteById(id)
    }
}
