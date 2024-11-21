package com.medisage.smart_mr.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.platform.LocalContext

private val DarkColorSchemee = darkColorScheme(
    background = Black,
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    surface = Black
)

private val LightColorSchemee = lightColorScheme(
    background = Color.White,
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    surface = Color.White
)
private val DarkColorScheme = darkColorScheme(
    background = Black,
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    surface = Black,
    onSurface = Color.White,
    onBackground = Color.White
)

private val LightColorScheme = lightColorScheme(
    background = Color.White,
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    surface = Color.White,
    onSurface = Color.Black, // Text and icons on surfaces will be black in light theme
    onBackground = Color.Black // Text and icons on the background will be black in light theme
)



@Composable
fun SmartMRTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false   ,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}