plugins {
    alias(libs.plugins.f776.kotlinMultiplatform)
    alias(libs.plugins.f776.androidLibrary)
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.database)
        }
    }
}