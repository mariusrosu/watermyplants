package com.redcoding.watermyplants.android.garden

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.redcoding.watermyplants.garden.domain.GetGardenStateEntryPoint
import com.redcoding.watermyplants.garden.ui.SharedGardenViewModel

class GardenViewModel(
    getGardenStateEntryPoint: GetGardenStateEntryPoint
) : ViewModel() {

    private val viewModel by lazy {
        SharedGardenViewModel(
            getGardenStateEntryPoint = getGardenStateEntryPoint,
            coroutineScope = viewModelScope,
        )
    }

    val uiState = viewModel.state
}
