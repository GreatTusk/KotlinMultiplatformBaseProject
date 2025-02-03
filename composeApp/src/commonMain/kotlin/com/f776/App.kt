package com.f776

import androidx.compose.runtime.Composable
import com.f776.ui.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(darkTheme: Boolean, dynamicColor: Boolean) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {

    }
}