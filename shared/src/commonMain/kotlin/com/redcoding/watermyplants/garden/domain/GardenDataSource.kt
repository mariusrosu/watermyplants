package com.redcoding.watermyplants.garden.domain

import kotlinx.coroutines.flow.Flow

interface GardenDataSource {

    fun getPlants(): Flow<List<Plant>>

    fun getPlant(id: Long): Flow<Plant>

    suspend fun addPlant(plant: Plant)

    suspend fun deletePlan(id: Long)
}
