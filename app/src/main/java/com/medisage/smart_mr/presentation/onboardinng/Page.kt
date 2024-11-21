package com.medisage.smart_mr.presentation.onboardinng

import androidx.annotation.DrawableRes
import com.medisage.smart_mr.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)

val pages = listOf(
    Page(
        title = "Supports many formats to exporttt",
        description = "For a stress-free user experience, you'll need a graphics card and good RAM.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Supports many formats to export/import files.",
        description = "For a stress-free user experience, you'll need a graphics card and good RAM. You can export SVG, PNG, and JPEG files or as CSS code. To master the software, remember you need time, patience, and resources to learn it.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Supports many formats to export/import files.",
        description = "For a stress-free user experience, you'll need a graphics card and good RAM. You can export SVG, PNG, and JPEG files or as CSS code. To master the software, remember you need time, patience, and resources to learn it.",
        image = R.drawable.onboarding3
    ),
)