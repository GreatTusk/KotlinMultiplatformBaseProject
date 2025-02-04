plugins {
    alias(libs.plugins.f776.kotlinMultiplatform)
    alias(libs.plugins.f776.androidLibrary)
    alias(libs.plugins.f776.roomMultiplatform)
}

kotlin {
    sourceSets {
        androidMain.dependencies {
            implementation(libs.koin.android)
        }
        commonMain.dependencies {
            api(libs.koin.core)
        }
    }
}