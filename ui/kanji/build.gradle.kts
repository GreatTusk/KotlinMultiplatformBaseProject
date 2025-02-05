plugins {
    alias(libs.plugins.f776.kotlinMultiplatform)
    alias(libs.plugins.f776.androidLibrary)
    alias(libs.plugins.f776.composeMultiplatform)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            api(libs.koin.compose)
        }
    }
}

compose.resources {
    generateResClass = always
}