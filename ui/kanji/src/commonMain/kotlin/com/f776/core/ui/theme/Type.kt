package com.f776.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import kotlinproject.ui.kanji.generated.resources.Inter_24pt_Bold
import kotlinproject.ui.kanji.generated.resources.Inter_24pt_BoldItalic
import kotlinproject.ui.kanji.generated.resources.Inter_24pt_Italic
import kotlinproject.ui.kanji.generated.resources.Inter_24pt_Regular
import kotlinproject.ui.kanji.generated.resources.Inter_24pt_SemiBold
import kotlinproject.ui.kanji.generated.resources.Inter_24pt_SemiBoldItalic
import kotlinproject.ui.kanji.generated.resources.MPLUS1_Bold
import kotlinproject.ui.kanji.generated.resources.MPLUS1_Regular
import kotlinproject.ui.kanji.generated.resources.MPLUS1_SemiBold
import kotlinproject.ui.kanji.generated.resources.Res
import org.jetbrains.compose.resources.Font


@Composable
internal fun InterFontFamily() = FontFamily(
    Font(Res.font.Inter_24pt_Regular, weight = FontWeight.Normal),
    Font(Res.font.Inter_24pt_Italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(Res.font.Inter_24pt_SemiBold, weight = FontWeight.SemiBold),
    Font(
        Res.font.Inter_24pt_SemiBoldItalic,
        weight = FontWeight.SemiBold,
        style = FontStyle.Italic
    ),
    Font(Res.font.Inter_24pt_Bold, weight = FontWeight.Bold),
    Font(Res.font.Inter_24pt_BoldItalic, weight = FontWeight.Bold, style = FontStyle.Italic)
)

@Composable
internal fun MPLUS1FontFamily() = FontFamily(
    Font(Res.font.MPLUS1_Regular, weight = FontWeight.Normal),
    Font(Res.font.MPLUS1_SemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.MPLUS1_Bold, weight = FontWeight.Bold)
)

@Composable
internal fun AppTypography() = Typography().run {
    val displayFontFamily = MPLUS1FontFamily()
    val bodyFontFamily = InterFontFamily()

    copy(
        displayLarge = displayLarge.copy(fontFamily = displayFontFamily),
        displayMedium = displayMedium.copy(fontFamily = displayFontFamily),
        displaySmall = displaySmall.copy(fontFamily = displayFontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = displayFontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = displayFontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = displayFontFamily),
        titleLarge = titleLarge.copy(fontFamily = displayFontFamily),
        titleMedium = titleMedium.copy(fontFamily = displayFontFamily),
        titleSmall = titleSmall.copy(fontFamily = displayFontFamily),
        bodyLarge = bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = bodyFontFamily),
        bodySmall = bodySmall.copy(fontFamily = bodyFontFamily),
        labelLarge = labelLarge.copy(fontFamily = bodyFontFamily),
        labelMedium = labelMedium.copy(fontFamily = bodyFontFamily),
        labelSmall = labelSmall.copy(fontFamily = bodyFontFamily)
    )
}


