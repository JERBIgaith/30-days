package com.example.thirtydays.ui.theme

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(50.dp),
    medium = RoundedCornerShape(bottomStart = CornerSize(16.dp), topEnd = CornerSize(16.dp)),
    large = RoundedCornerShape(24.dp)
)
