package com.redcoding.watermyplants.android.uilibrary.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.redcoding.watermyplants.android.uilibrary.theme.Theme
import com.redcoding.watermyplants.android.uilibrary.foundations.BodyText
import com.redcoding.watermyplants.uilibrary.components.CheckBoxTextState

@Composable
fun CheckBoxText(state: CheckBoxTextState) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Checkbox(
            checked = state.isChecked,
            onCheckedChange = null,
        )
        BodyText(
            text = state.text,
            modifier = Modifier.padding(end = 12.dp),
        )
    }
}

// region CheckBoxText Previews
@Preview
@Composable
fun CheckBoxTextCheckedPreview() {
    val state = CheckBoxTextState(
        isChecked = true,
        text = "Checked Check Box Text"
    )
    Theme {
        CheckBoxText(state)
    }
}

@Preview
@Composable
fun CheckBoxTextUncheckedPreview() {
    val state = CheckBoxTextState(
        isChecked = false,
        text = "Unchecked Check Box Text"
    )
    Theme {
        CheckBoxText(state)
    }
}
// endregion
