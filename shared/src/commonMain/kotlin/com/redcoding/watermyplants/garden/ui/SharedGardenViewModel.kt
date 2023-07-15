package com.redcoding.watermyplants.garden.ui

import com.redcoding.watermyplants.garden.domain.GetGardenStateEntryPoint
import com.redcoding.watermyplants.util.toCommonStateFlow

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class SharedGardenViewModel(
    coroutineScope: CoroutineScope? = null
) {
    private val viewModelScope = coroutineScope ?: CoroutineScope(Dispatchers.Main)

    private val getGardenStateEntryPoint: GetGardenStateEntryPoint = GetGardenStateEntryPoint()

    val state = getGardenStateEntryPoint()
        .stateIn(
            scope = viewModelScope,
            // TODO: Check state in started
            started = SharingStarted.Eagerly,
            initialValue = GardenUiState.Loading,
        )
        .toCommonStateFlow()
}
