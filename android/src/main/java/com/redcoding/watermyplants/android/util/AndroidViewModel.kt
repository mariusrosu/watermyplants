package com.redcoding.watermyplants.android.util

import androidx.lifecycle.ViewModel

import com.redcoding.watermyplants.util.flow.CommonStateFlow
import com.redcoding.watermyplants.util.viewmodel.KmmViewModel

internal abstract class
AndroidViewModel<UiState : Any, UiEvent : Any, UiAction : Any> : ViewModel() {

    protected abstract val sharedViewModel: KmmViewModel<UiState, UiEvent, UiAction>

    fun uiState(): CommonStateFlow<UiState> = sharedViewModel.uiState

    fun onUiAction(uiAction: UiAction) {
        sharedViewModel.onUiAction(uiAction)
    }
}
