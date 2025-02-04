plugins {
    alias(libs.plugins.f776.kotlinMultiplatform)
    alias(libs.plugins.f776.androidApplication)
    alias(libs.plugins.f776.desktopApplication)
    alias(libs.plugins.f776.composeMultiplatform)
}

kotlin {
    sourceSets {
        val desktopMain by getting
        
        androidMain.dependencies {
            implementation(libs.koin.android)
        }
        commonMain.dependencies {
            implementation(projects.ui.kanji)
            implementation(projects.data.kanji)

            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)
        }
        desktopMain.dependencies {

        }
    }
}