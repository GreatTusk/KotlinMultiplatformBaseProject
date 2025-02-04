package com.f776

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.f776.core.ui.theme.AppTheme

import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(darkTheme: Boolean, dynamicColor: Boolean) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        var selectedItem by remember { mutableIntStateOf(0) }
        val navItems = listOf("Songs", "Artists", "Playlists")
        val navSuiteType = NavigationSuiteScaffoldDefaults.calculateFromAdaptiveInfo(
            currentWindowAdaptiveInfo()
        )
        NavigationSuiteScaffold(
            navigationSuiteItems = {
                navItems.forEachIndexed { index, navItem ->
                    item(
                        icon = {
                            Icon(
                                Icons.Filled.Favorite,
                                contentDescription = navItem
                            )
                        },
                        label = { Text(navItem) },
                        selected = selectedItem == index,
                        onClick = { selectedItem = index })
                }
            }
        ) {
            // Screen content.
            Text(
                modifier = Modifier.padding(16.dp),
                text = "Current NavigationSuiteType $navSuiteType"
            )
        }
    }
}