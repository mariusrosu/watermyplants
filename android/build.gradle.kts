plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.redcoding.watermyplants.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.redcoding.watermyplants.android"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":shared"))

    // Jetpack compose UI
    val composeUiVersion = "1.4.3"
    implementation("androidx.compose.ui:ui:$composeUiVersion")
    implementation("androidx.compose.ui:ui-tooling:$composeUiVersion")
    implementation("androidx.compose.ui:ui-tooling-preview:$composeUiVersion")
    implementation("androidx.compose.foundation:foundation:$composeUiVersion")

    // Jetpack compose activity
    val composeActivityVersion = "1.7.2"
    implementation("androidx.activity:activity-compose:$composeActivityVersion")

    // Jetpack compose view model
    val composeViewModelVersion = "2.6.1"
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$composeViewModelVersion")

    // Jetpack compose navigation
    val composeNavigationVersion = "2.6.0"
    implementation("androidx.navigation:navigation-compose:$composeNavigationVersion")

    // Jetpack compose Material3
    val composeMaterialVersion = "1.1.1"
    implementation("androidx.compose.material3:material3:$composeMaterialVersion")

    // Koin
    val koinAndroidVersion = "3.4.1"
    implementation("io.insert-koin:koin-android:$koinAndroidVersion")
    implementation("io.insert-koin:koin-androidx-compose:$koinAndroidVersion")
}
