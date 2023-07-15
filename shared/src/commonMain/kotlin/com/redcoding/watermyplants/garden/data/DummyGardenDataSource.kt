package com.redcoding.watermyplants.garden.data

import com.redcoding.watermyplants.garden.domain.GardenDataSource
import com.redcoding.watermyplants.garden.domain.Plant
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class DummyGardenDataSource : GardenDataSource {

    private val plants = mutableListOf(
        Plant(id = 1, name = "Fist plant"),
        Plant(id = 2, name = "Second plant"),
        Plant(id = 3, name = "Third plant"),
        Plant(id = 4, name = "Fourth plant"),
    )

    override fun getPlants(): Flow<List<Plant>> = flow {
        delay(3000)
        emit(plants)
    }

    override fun getPlant(id: Long): Flow<Plant> = flow {
        // TODO: Handle no plant found
        emit(
            plants.first { plant -> plant.id == id }
        )
    }

    override suspend fun addPlant(plant: Plant) {
        plants.add(plant)
    }

    override suspend fun deletePlan(id: Long) {
        plants.removeAll { plant -> plant.id == id }
    }
}
