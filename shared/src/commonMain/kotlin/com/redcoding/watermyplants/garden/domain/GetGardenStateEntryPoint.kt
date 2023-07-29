package com.redcoding.watermyplants.garden.domain

import com.redcoding.watermyplants.garden.ui.GardenUiState
import com.redcoding.watermyplants.uilibrary.components.CheckBoxTextState

import kotlinx.coroutines.flow.map

class GetGardenStateEntryPoint(
    private val dataSource: GardenDataSource,
) {

    operator fun invoke() = dataSource.getPlants().map { it.toUiState() }
}

private fun List<Plant>.toUiState() = GardenUiState.Content(
    plantStates = map(Plant::toUiState)
)

private fun Plant.toUiState() = CheckBoxTextState(isChecked = true, text = name)
