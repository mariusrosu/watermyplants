package com.redcoding.watermyplants.android.uilibrary.foundations

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.redcoding.watermyplants.android.uilibrary.theme.body
import com.redcoding.watermyplants.android.uilibrary.theme.bodyBold
import com.redcoding.watermyplants.android.uilibrary.theme.extraLarge
import com.redcoding.watermyplants.android.uilibrary.theme.h1
import com.redcoding.watermyplants.android.uilibrary.theme.h1Bold
import com.redcoding.watermyplants.android.uilibrary.theme.h2
import com.redcoding.watermyplants.android.uilibrary.theme.h2Bold
import com.redcoding.watermyplants.android.uilibrary.theme.h3
import com.redcoding.watermyplants.android.uilibrary.theme.h3Bold
import com.redcoding.watermyplants.android.uilibrary.theme.h4
import com.redcoding.watermyplants.android.uilibrary.theme.h4Bold
import com.redcoding.watermyplants.android.uilibrary.theme.largeBold

@Composable
internal fun TitleText(text: String, modifier: Modifier = Modifier, maxLines: Int = Int.MAX_VALUE) {
    Text(
        text = text,
        modifier = modifier,
        style = extraLarge,
        textAlign = TextAlign.Center,
        maxLines = maxLines,
    )
}

@Composable
internal fun BodyText(text: String, modifier: Modifier = Modifier, maxLines: Int = Int.MAX_VALUE) {
    Text(
        text = text,
        modifier = modifier,
        style = body,
        textAlign = TextAlign.Start,
        maxLines = maxLines,
    )
}
