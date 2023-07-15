package com.redcoding.watermyplants.android.uilibrary.foundations

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.tooling.preview.Preview
import com.redcoding.watermyplants.android.uilibrary.theme.Theme

@Composable
internal fun CheckBox(
    state: CheckBoxState,
    listener: CheckBoxCheckedListener
) {
    Checkbox(checked = state.isChecked, onCheckedChange = listener)
}

@Immutable
data class CheckBoxState(
    val isChecked: Boolean
)

typealias CheckBoxCheckedListener = (Boolean) -> Unit

// region CheckBox Previews
@Preview
@Composable
internal fun CheckBoxUncheckedPreview() {
    Theme {
        CheckBox(
            state = CheckBoxState(isChecked = true),
            listener = {},
        )
    }
}

@Preview
@Composable
internal fun CheckBoxCheckedPreview() {
    Theme {
        CheckBox(
            state = CheckBoxState(isChecked = false),
            listener = {},
        )
    }
}
// endregion
