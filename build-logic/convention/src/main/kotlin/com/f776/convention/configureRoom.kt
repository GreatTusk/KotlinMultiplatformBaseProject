package com.f776.convention

import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

internal fun Project.configureRoom(extension: KotlinMultiplatformExtension) = extension.apply {
    sourceSets.apply {
        val desktopMain = getByName("desktopMain")
        commonMain.dependencies {
            implementation(libs.findLibrary("androidx-room-runtime"))
            implementation(libs.findLibrary("sqlite-bundled"))
        }
    }
}