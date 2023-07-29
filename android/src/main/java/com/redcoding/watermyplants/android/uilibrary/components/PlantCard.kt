package com.redcoding.watermyplants.android.uilibrary.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PlantCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Image(
            painter = painterResource(id = androidx.core.R.drawable.notification_action_background),
            contentDescription = ""
        )
    }
}

// region PlantCard preview
@Preview
@Composable
internal fun PlantCardPreview() {
    PlantCard()
}
// endregion
