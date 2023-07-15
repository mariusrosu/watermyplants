package com.redcoding.watermyplants

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform