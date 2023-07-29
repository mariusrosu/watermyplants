package com.redcoding.watermyplants.garden.data.sqldelight

import android.content.Context

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver

import com.redcoding.watermyplants.GardenDatabase

actual class DriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(GardenDatabase.Schema, context, "garden.db")
    }
}
