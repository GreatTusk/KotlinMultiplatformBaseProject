plugins {
    alias(libs.plugins.f776.kotlinMultiplatform)
    alias(libs.plugins.f776.androidLibrary)
    alias(libs.plugins.ksp)
    alias(libs.plugins.room)
}

kotlin {
    room {
        schemaDirectory("$projectDir/schemas")
    }

    sourceSets {

        androidMain.dependencies {
            implementation(libs.koin.android)
        }
        commonMain.dependencies {
            implementation(libs.androidx.room.runtime)
            implementation(libs.sqlite.bundled)
            api(libs.koin.core)
        }

        dependencies {
            ksp(libs.androidx.room.compiler)
        }
    }
}

dependencies {
    kspCommonMainMetadata(projects.core.database)
}