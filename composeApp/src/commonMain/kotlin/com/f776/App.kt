package com.f776

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.f776.core.ui.theme.AppTheme
import com.f776.data.UserDatasource
import com.f776.data.di.DataModule
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import org.koin.compose.koinInject
import org.koin.core.module.Module


@Composable
@Preview
fun App(darkTheme: Boolean, dynamicColor: Boolean, platformModule: Module = Module()) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        KoinApplication(
            application = {
                modules(DataModule, platformModule)
            }
        ) {
            val datasource: UserDatasource = koinInject()
            var userName by remember { mutableStateOf("") }
            LaunchedEffect(true) {
                datasource.insertUser()
                userName = datasource.getUser().name
            }
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

                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
                    Text(
                        modifier = Modifier.padding(16.dp),
                        text = userName
                    )
                }

            }
        }
    }
}