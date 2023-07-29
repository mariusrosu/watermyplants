package com.redcoding.watermyplants.util.viewmodel

import com.redcoding.watermyplants.util.flow.CommonStateFlow
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

abstract class KmmViewModel<UiState : Any, UiEvent : Any, UiAction : Any>(
    coroutineScope: CoroutineScope? = null,
) {
    protected val viewModelScope = coroutineScope ?: CoroutineScope(Dispatchers.Main)

    abstract val uiState: CommonStateFlow<UiState>

    abstract fun onUiAction(uiAction: UiAction)
}
