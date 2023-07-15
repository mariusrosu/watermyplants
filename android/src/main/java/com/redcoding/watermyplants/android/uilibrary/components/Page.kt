package com.redcoding.watermyplants.android.uilibrary.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.redcoding.watermyplants.android.uilibrary.theme.Theme

@Composable
fun Page(
    content: @Composable () -> Unit,
) {
    Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
            content = content,
        )
    }
}

// region Page Previews
@Preview
@Composable
internal fun PagePreview() {
    Page {}
}
// endregion