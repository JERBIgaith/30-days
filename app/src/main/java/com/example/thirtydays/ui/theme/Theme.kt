package com.example.thirtydays.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = Green40,
    onPrimary = OnGreen40,
    primaryContainer = GreenContainer,
    onPrimaryContainer = OnGreenContainer,
    tertiary = Terracotta40,
    tertiaryContainer = TerracottaContainer,
    onTertiaryContainer = OnTerracottaContainer,
    background = LightBackground,
    onBackground = OnLightBackground,
    surface = LightBackground,
    onSurface = OnLightBackground
)

private val DarkColors = darkColorScheme(
    primary = Green80,
    onPrimary = OnGreen80,
    primaryContainer = GreenContainerDark,
    onPrimaryContainer = OnGreenContainerDark,
    tertiary = Terracotta80,
    tertiaryContainer = TerracottaContainerDark,
    onTertiaryContainer = OnTerracottaContainerDark,
    background = DarkBackground,
    onBackground = OnDarkBackground,
    surface = DarkBackground,
    onSurface = OnDarkBackground
)

@Composable
fun ThirtyDaysTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
