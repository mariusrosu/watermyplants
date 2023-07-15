package com.redcoding.watermyplants.android.garden

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.redcoding.watermyplants.garden.ui.SharedGardenViewModel

internal class GardenViewModel : ViewModel() {

    private val viewModel by lazy {
        SharedGardenViewModel(
            coroutineScope = viewModelScope
        )
    }

    val uiState = viewModel.state
}
