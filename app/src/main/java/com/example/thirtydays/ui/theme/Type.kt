package com.example.thirtydays.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Swap FontFamily.Serif / FontFamily.SansSerif for custom fonts if you add them to res/font.
val Typography = Typography(
    displayLarge = TextStyle(fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold, fontSize = 36.sp),
    displayMedium = TextStyle(fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold, fontSize = 24.sp),
    headlineMedium = TextStyle(fontFamily = FontFamily.Serif, fontWeight = FontWeight.SemiBold, fontSize = 22.sp),
    labelSmall = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, fontSize = 14.sp, letterSpacing = 1.sp),
    bodyLarge = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Normal, fontSize = 16.sp, lineHeight = 24.sp)
)
