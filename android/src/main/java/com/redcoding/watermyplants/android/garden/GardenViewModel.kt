package com.redcoding.watermyplants.android.garden

import androidx.lifecycle.viewModelScope
import com.redcoding.watermyplants.android.util.AndroidViewModel
import com.redcoding.watermyplants.garden.domain.AddPlantEntryPoint
import com.redcoding.watermyplants.garden.domain.GetGardenStateEntryPoint
import com.redcoding.watermyplants.garden.ui.GardenUiAction
import com.redcoding.watermyplants.garden.ui.GardenUiEvent
import com.redcoding.watermyplants.garden.ui.GardenUiState
import com.redcoding.watermyplants.garden.ui.SharedGardenViewModel

internal class GardenViewModel(
    getGardenStateEntryPoint: GetGardenStateEntryPoint,
    addPlantEntryPoint: AddPlantEntryPoint,
) : AndroidViewModel<GardenUiState, GardenUiEvent, GardenUiAction>() {

    override val sharedViewModel by lazy {
        SharedGardenViewModel(
            getGardenStateEntryPoint = getGardenStateEntryPoint,
            addPlantEntryPoint = addPlantEntryPoint,
            coroutineScope = viewModelScope,
        )
    }
}
