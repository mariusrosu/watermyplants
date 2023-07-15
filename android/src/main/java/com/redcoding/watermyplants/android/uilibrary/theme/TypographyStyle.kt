package com.redcoding.watermyplants.android.uilibrary.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

internal val extraLarge = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 48.sp,
    lineHeight = 56.sp
)

internal val largeBold = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 40.sp,
    lineHeight = 48.sp
)

internal val h1 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 32.sp,
    lineHeight = 40.sp
)

internal val h1Bold = h1.bold()

internal val h2 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 24.sp,
    lineHeight = 32.sp
)

internal val h2Bold = h2.bold()

internal val h3 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 20.sp,
    lineHeight = 26.sp
)

internal val h3Bold = h3.bold()

internal val h4 = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 18.sp,
    lineHeight = 24.sp
)

internal val h4Bold = h4.bold()

internal val body = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    lineHeight = 24.sp
)

internal val bodyBold = body.bold()

private fun TextStyle.bold() = copy(fontWeight = FontWeight.Bold)
