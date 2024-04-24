package com.example.jetpackcomposetraining.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetraining.R

val Livvic: FontFamily = FontFamily(
    Font(resId = R.font.livvic_bold, weight = FontWeight.Bold),
    Font(resId = R.font.livvic_semibold, weight = FontWeight.SemiBold),
    Font(resId = R.font.livvic_medium, weight = FontWeight.Medium),
    Font(resId = R.font.livvic_regular, weight = FontWeight.Normal)
)

data class MuviTypography(
    val heading: MuviHeadingStyles = MuviHeadingStyles(),
    val body: MuviBodyStyles = MuviBodyStyles()
)

data class MuviHeadingStyles(
    val heading1: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 48.sp,
        lineHeight = 57.6.sp,
        fontWeight = FontWeight.Bold
    ),
    val heading2: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 40.sp,
        lineHeight = 48.sp,
        fontWeight = FontWeight.Bold
    ),
    val heading3: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 32.sp,
        lineHeight = 38.4.sp,
        fontWeight = FontWeight.Bold
    ),
    val heading4: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 24.sp,
        lineHeight = 28.8.sp,
        fontWeight = FontWeight.Bold
    ),
    val heading5: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Bold
    ),
    val heading6: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 18.sp,
        lineHeight = 21.6.sp,
        fontWeight = FontWeight.Bold
    )
)

data class MuviBodyStyles(
    val xLargeBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 18.sp,
        lineHeight = 25.2.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp
    ),
    val xLargeSemiBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 18.sp,
        lineHeight = 25.2.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.2.sp
    ),
    val xLargeMedium: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 18.sp,
        lineHeight = 25.2.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.2.sp
    ),
    val xLargeRegular: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 18.sp,
        lineHeight = 25.2.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp
    ),
    val largeBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 16.sp,
        lineHeight = 22.4.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp
    ),
    val largeSemiBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 16.sp,
        lineHeight = 22.4.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.2.sp
    ),
    val largeMedium: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 16.sp,
        lineHeight = 22.4.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.2.sp
    ),
    val largeRegular: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 16.sp,
        lineHeight = 22.4.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp
    ),
    val mediumBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 14.sp,
        lineHeight = 19.6.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp
    ),
    val mediumSemiBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 14.sp,
        lineHeight = 19.6.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.2.sp
    ),
    val mediumMedium: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 14.sp,
        lineHeight = 19.6.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.2.sp
    ),
    val mediumRegular: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 14.sp,
        lineHeight = 19.6.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp
    ),
    val smallBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp
    ),
    val smallSemiBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 12.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.2.sp
    ),
    val smallMedium: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.2.sp
    ),
    val smallRegular: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp
    ),
    val xSmallBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.2.sp
    ),
    val xSmallSemiBold: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 10.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.2.sp
    ),
    val xSmallMedium: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 10.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.2.sp
    ),
    val xSmallRegular: TextStyle = TextStyle(
        fontFamily = Livvic,
        fontSize = 10.sp,
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.2.sp
    )
)

val LocalMuviTypography = staticCompositionLocalOf {
    MuviTypography()
}