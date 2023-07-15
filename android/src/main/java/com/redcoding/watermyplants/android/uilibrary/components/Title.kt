package com.redcoding.watermyplants.android.uilibrary.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.redcoding.watermyplants.android.uilibrary.theme.Theme
import com.redcoding.watermyplants.android.uilibrary.foundations.TitleText
import com.redcoding.watermyplants.uilibrary.components.TitleState

@Composable
fun Title(state: TitleState) {
    TitleText(text = state.text)
}

// region Title Previews
@Preview
@Composable
internal fun TitlePreview() {
    Theme {
        Title(state = TitleState("Water my plants"))
    }
}
// endregion
