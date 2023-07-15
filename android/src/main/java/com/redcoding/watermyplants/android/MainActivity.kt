package com.redcoding.watermyplants.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.redcoding.watermyplants.android.garden.GardenScreen
import com.redcoding.watermyplants.android.uilibrary.components.Page

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Page {
                GardenScreen()
            }
        }
    }
}

