plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("app.cash.sqldelight") version "2.0.0"
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                // Kotlin coroutines
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

                // SQL Delight
                implementation("app.cash.sqldelight:coroutines-extensions:2.0.0")
            }
        }
        val androidMain by getting {
            dependencies {
                // SQL Delight
                implementation("app.cash.sqldelight:android-driver:2.0.0")
            }
        }
        val iosMain by getting {
            dependencies {
                // SQL Delight
                implementation("app.cash.sqldelight:native-driver:2.0.0")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "com.redcoding.watermyplants"
    compileSdk = 33
    defaultConfig {
        minSdk = 23
    }
}

sqldelight {
    databases {
        create("GardenDatabase") {
            packageName.set("com.redcoding.watermyplants")
        }
    }
}


