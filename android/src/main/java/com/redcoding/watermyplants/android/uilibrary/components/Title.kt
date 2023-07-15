package com.redcoding.watermyplants.android.uilibrary.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.tooling.preview.Preview
import com.redcoding.watermyplants.android.uilibrary.theme.Theme
import com.redcoding.watermyplants.android.uilibrary.foundations.TitleText

@Composable
fun Title(state: TitleState) {
    TitleText(text = state.text)
}

@Immutable
data class TitleState(
    val text: String,
)

// region Title Previews
@Preview
@Composable
internal fun TitlePreview() {
    Theme {
        Title(state = TitleState("Water my plants"))
    }
}
// endregion
