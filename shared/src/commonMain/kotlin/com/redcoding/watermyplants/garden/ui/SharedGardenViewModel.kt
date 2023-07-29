package com.redcoding.watermyplants.garden.ui

import com.redcoding.watermyplants.garden.domain.AddPlantEntryPoint
import com.redcoding.watermyplants.garden.domain.GetGardenStateEntryPoint
import com.redcoding.watermyplants.util.flow.CommonStateFlow
import com.redcoding.watermyplants.util.flow.toCommonStateFlow
import com.redcoding.watermyplants.util.viewmodel.KmmViewModel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SharedGardenViewModel(
    private val addPlantEntryPoint: AddPlantEntryPoint,
    getGardenStateEntryPoint: GetGardenStateEntryPoint,
    coroutineScope: CoroutineScope? = null,
) : KmmViewModel<GardenUiState, GardenUiEvent, GardenUiAction>(coroutineScope) {

    override val uiState = getGardenStateEntryPoint()
        .stateIn(
            scope = viewModelScope,
            // TODO: Check state in started
            started = SharingStarted.Eagerly,
            initialValue = GardenUiState.Loading,
        )
        .toCommonStateFlow()

    override fun onUiAction(uiAction: GardenUiAction) {
        when (uiAction) {
            is GardenUiAction.AddPlantClicked -> viewModelScope.launch { addPlantEntryPoint() }
        }
    }
}
