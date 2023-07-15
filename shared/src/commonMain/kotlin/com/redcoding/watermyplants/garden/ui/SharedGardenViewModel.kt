package com.redcoding.watermyplants.garden.ui

import com.redcoding.watermyplants.garden.data.DummyGardenDataSource
import com.redcoding.watermyplants.garden.domain.GardenDataSource
import com.redcoding.watermyplants.garden.domain.Plant

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.stateIn

import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map

class SharedGardenViewModel : KMMViewModel() {

    private val dataSource: GardenDataSource = DummyGardenDataSource()

    val uiState = dataSource.getPlants().map { plants ->
        UiState(plants)
    }.stateIn(
        viewModelScope = viewModelScope,
        // TODO: Check state in started
        started = SharingStarted.Eagerly,
        initialValue = UiState(plants = emptyList()),
    )
}

data class UiState(
    // TODO: Make this stable
    val plants: List<Plant>
)