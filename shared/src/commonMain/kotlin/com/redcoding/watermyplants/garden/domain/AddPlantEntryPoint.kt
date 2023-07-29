package com.redcoding.watermyplants.garden.domain

class AddPlantEntryPoint(
    private val dataSource: GardenDataSource,
) {
    suspend operator fun invoke() {
        val plant = Plant(id = (0..100).random().toLong(), name = "New Plant")
        dataSource.addPlant(plant)
    }
}
