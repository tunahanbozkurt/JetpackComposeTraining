package com.example.jetpackcomposetraining.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Primary500: Color = Color(0xFF8612E2)
val Primary400: Color = Color(0xFFA941E8)
val Primary300: Color = Color(0xFFB771EE)
val Primary200: Color = Color(0xFFCEA0F3)
val Primary100: Color = Color(0xFFF3E7FC)

val Secondary500: Color = Color(0xFF8FFF00)
val Secondary400: Color = Color(0xFFA5FF33)
val Secondary300: Color = Color(0xFFBCFF66)
val Secondary200: Color = Color(0xFFD2FF99)
val Secondary100: Color = Color(0xFFF4FFE6)

val StatusSuccess: Color = Color(0xFF4ADE80)
val StatusInfo: Color = Color(0xFF246BFD)
val StatusWarning: Color = Color(0xFFFACC15)
val StatusError: Color = Color(0xFFF75555)
val StatusDisabled: Color = Color(0xFFD8D8D8)
val StatusDisabledButton: Color = Color(0xFF4F4853)

val GreyScale900: Color = Color(0xFF212121)
val GreyScale800: Color = Color(0xFF424242)
val GreyScale700: Color = Color(0xFF616161)
val GreyScale600: Color = Color(0xFF757575)
val GreyScale500: Color = Color(0xFF9E9E9E)
val GreyScale400: Color = Color(0xFFBDBDBD)
val GreyScale300: Color = Color(0xFFE0E0E0)
val GreyScale200: Color = Color(0xFFEEEEEE)
val GreyScale100: Color = Color(0xFFF5F5F5)
val GreyScale50: Color = Color(0xFFFAFAFA)

val GradientRed: Brush = Brush.linearGradient(listOf(Color(0xFFFF4451), Color(0xFFE21221)))
val GradientYellow: Brush = Brush.linearGradient(listOf(Color(0xFFFFE580), Color(0xFFFACC15)))
val GradientPurple: Brush = Brush.linearGradient(listOf(Color(0xFF9D59FF), Color(0xFF7210FF)))
val GradientBlue: Brush = Brush.linearGradient(listOf(Color(0xFF5F82FF), Color(0xFF335EF7)))
val GradientGreen: Brush = Brush.linearGradient(listOf(Color(0xFF35DEBC), Color(0xFF22BB9C)))
val GradientOrange: Brush = Brush.linearGradient(listOf(Color(0xFFFFAB38), Color(0xFFFB9400)))

val Dark1: Color = Color(0xFF181A20)
val Dark2: Color = Color(0xFF1F222A)
val Dark3: Color = Color(0xFF35383F)

val OthersWhite: Color = Color(0xFFFFFFFF)
val OthersBlack: Color = Color(0xFF000000)
val OthersRed: Color = Color(0xFFF54336)
val OthersPink: Color = Color(0xFFEA1E61)
val OthersPurple: Color = Color(0xFF9D28AC)
val OthersDeepPurple: Color = Color(0xFF673AB3)
val OthersIndigo: Color = Color(0xFF3F51B2)
val OthersBlue: Color = Color(0xFF1A96F0)
val OthersLightBlue: Color = Color(0xFF00A9F1)
val OthersCyan: Color = Color(0xFF00BCD3)
val OthersTeal: Color = Color(0xFF009689)
val OthersGreen: Color = Color(0xFF4AAF57)
val OthersLightGreen: Color = Color(0xFF8BC255)
val OthersLime: Color = Color(0xFFCDDC4C)
val OthersYellow: Color = Color(0xFFFFEB4F)
val OthersAmber: Color = Color(0xFFFFC02D)
val OthersOrange: Color = Color(0xFFFF981F)
val OthersDeepOrange: Color = Color(0xFFFF5726)
val OthersBrown: Color = Color(0xFF7A5548)
val OthersBlueGrey: Color = Color(0xFF607D8A)

val BackgroundRed: Color = Color(0xFFFFF5F6)
val BackgroundPurple: Color = Color(0xFFF4ECFF)
val BackgroundGreen: Color = Color(0xFFF2FFFC)
val BackgroundOrange: Color = Color(0xFFFFF8ED)
val BackgroundPink: Color = Color(0xFFFFF5F5)
val BackgroundYellow: Color = Color(0xFFFFFEE0)

val TransparentRed: Color = Color(0x14E21221)
val TransparentPurple: Color = Color(0x147210FF)
val TransparentBlue: Color = Color(0x14335EF7)
val TransparentOrange: Color = Color(0x14FF9800)
val TransparentYellow: Color = Color(0x14FACC15)
val TransparentGreen: Color = Color(0x144CAF50)
val TransparentCyan: Color = Color(0x1400BCD4)

data class MuviColor(
    val pairs: MuviColorPairs,
    val primary500: Color,
    val primary400: Color,
    val primary300: Color,
    val primary200: Color,
    val primary100: Color,
    val secondary500: Color,
    val secondary400: Color,
    val secondary300: Color,
    val secondary200: Color,
    val secondary100: Color,
    val statusSuccess: Color,
    val statusInfo: Color,
    val statusWarning: Color,
    val statusError: Color,
    val statusDisabled: Color,
    val statusDisabledButton: Color,
    val greyScale900: Color,
    val greyScale800: Color,
    val greyScale700: Color,
    val greyScale600: Color,
    val greyScale500: Color,
    val greyScale400: Color,
    val greyScale300: Color,
    val greyScale200: Color,
    val greyScale100: Color,
    val greyScale50: Color,
    val dark1: Color,
    val dark2: Color,
    val dark3: Color,
    val othersWhite: Color,
    val othersBlack: Color,
    val othersRed: Color,
    val othersPink: Color,
    val othersPurple: Color,
    val othersDeepPurple: Color,
    val othersIndigo: Color,
    val othersBlue: Color,
    val othersLightBlue: Color,
    val othersCyan: Color,
    val othersTeal: Color,
    val othersGreen: Color,
    val othersLightGreen: Color,
    val othersLime: Color,
    val othersYellow: Color,
    val othersAmber: Color,
    val othersOrange: Color,
    val othersDeepOrange: Color,
    val othersBrown: Color,
    val othersBlueGrey: Color,
    val backgroundRed: Color,
    val backgroundPurple: Color,
    val backgroundGreen: Color,
    val backgroundOrange: Color,
    val backgroundPink: Color,
    val backgroundYellow: Color,
    val transparent: Color,
    val transparentRed: Color,
    val transparentPurple: Color,
    val transparentBlue: Color,
    val transparentOrange: Color,
    val transparentYellow: Color,
    val transparentGreen: Color,
    val transparentCyan: Color,
)

data class MuviColorPairs(
    val textColor: Color,
    val textFieldIconTintColor: Color,
    val textFieldBackgroundColor: Color
)

val LightMuviColorPairs = MuviColorPairs(
    textColor = GreyScale900,
    textFieldIconTintColor = GreyScale900,
    textFieldBackgroundColor = GreyScale50
)

val DarkMuviColorPairs = MuviColorPairs(
    textColor = OthersWhite,
    textFieldIconTintColor = OthersWhite,
    textFieldBackgroundColor = Dark2
)

val LightMuviColor = MuviColor(
    pairs = LightMuviColorPairs,
    primary500 = Color(0xFF8612E2),
    primary400 = Color(0xFFA941E8),
    primary300 = Color(0xFFB771EE),
    primary200 = Color(0xFFCEA0F3),
    primary100 = Color(0xFFF3E7FC),
    secondary500 = Color(0xFF8FFF00),
    secondary400 = Color(0xFFA5FF33),
    secondary300 = Color(0xFFBCFF66),
    secondary200 = Color(0xFFD2FF99),
    secondary100 = Color(0xFFF4FFE6),
    statusSuccess = Color(0xFF4ADE80),
    statusInfo = Color(0xFF246BFD),
    statusWarning = Color(0xFFFACC15),
    statusError = Color(0xFFF75555),
    statusDisabled = Color(0xFFD8D8D8),
    statusDisabledButton = Color(0xFF4F4853),
    greyScale900 = Color(0xFF212121),
    greyScale800 = Color(0xFF424242),
    greyScale700 = Color(0xFF616161),
    greyScale600 = Color(0xFF757575),
    greyScale500 = Color(0xFF9E9E9E),
    greyScale400 = Color(0xFFBDBDBD),
    greyScale300 = Color(0xFFE0E0E0),
    greyScale200 = Color(0xFFEEEEEE),
    greyScale100 = Color(0xFFF5F5F5),
    greyScale50 = Color(0xFFFAFAFA),
    dark1 = Color(0xFF181A20),
    dark2 = Color(0xFF1F222A),
    dark3 = Color(0xFF35383F),
    othersWhite = Color(0xFFFFFFFF),
    othersBlack = Color(0xFF000000),
    othersRed = Color(0xFFF54336),
    othersPink = Color(0xFFEA1E61),
    othersPurple = Color(0xFF9D28AC),
    othersDeepPurple = Color(0xFF673AB3),
    othersIndigo = Color(0xFF3F51B2),
    othersBlue = Color(0xFF1A96F0),
    othersLightBlue = Color(0xFF00A9F1),
    othersCyan = Color(0xFF00BCD3),
    othersTeal = Color(0xFF009689),
    othersGreen = Color(0xFF4AAF57),
    othersLightGreen = Color(0xFF8BC255),
    othersLime = Color(0xFFCDDC4C),
    othersYellow = Color(0xFFFFEB4F),
    othersAmber = Color(0xFFFFC02D),
    othersOrange = Color(0xFFFF981F),
    othersDeepOrange = Color(0xFFFF5726),
    othersBrown = Color(0xFF7A5548),
    othersBlueGrey = Color(0xFF607D8A),
    backgroundRed = Color(0xFFFFF5F6),
    backgroundPurple = Color(0xFFF4ECFF),
    backgroundGreen = Color(0xFFF2FFFC),
    backgroundOrange = Color(0xFFFFF8ED),
    backgroundPink = Color(0xFFFFF5F5),
    backgroundYellow = Color(0xFFFFFEE0),
    transparent = Color(0x00000000),
    transparentRed = Color(0x14E21221),
    transparentPurple = Color(0x147210FF),
    transparentBlue = Color(0x14335EF7),
    transparentOrange = Color(0x14FF9800),
    transparentYellow = Color(0x14FACC15),
    transparentGreen = Color(0x144CAF50),
    transparentCyan = Color(0x1400BCD4)
)

val DarkMuviColor = MuviColor(
    pairs = DarkMuviColorPairs,
    primary500 = Color(0xFF8612E2),
    primary400 = Color(0xFFA941E8),
    primary300 = Color(0xFFB771EE),
    primary200 = Color(0xFFCEA0F3),
    primary100 = Color(0xFFF3E7FC),
    secondary500 = Color(0xFF8FFF00),
    secondary400 = Color(0xFFA5FF33),
    secondary300 = Color(0xFFBCFF66),
    secondary200 = Color(0xFFD2FF99),
    secondary100 = Color(0xFFF4FFE6),
    statusSuccess = Color(0xFF4ADE80),
    statusInfo = Color(0xFF246BFD),
    statusWarning = Color(0xFFFACC15),
    statusError = Color(0xFFF75555),
    statusDisabled = Color(0xFFD8D8D8),
    statusDisabledButton = Color(0xFF4F4853),
    greyScale900 = Color(0xFF212121),
    greyScale800 = Color(0xFF424242),
    greyScale700 = Color(0xFF616161),
    greyScale600 = Color(0xFF757575),
    greyScale500 = Color(0xFF9E9E9E),
    greyScale400 = Color(0xFFBDBDBD),
    greyScale300 = Color(0xFFE0E0E0),
    greyScale200 = Color(0xFFEEEEEE),
    greyScale100 = Color(0xFFF5F5F5),
    greyScale50 = Color(0xFFFAFAFA),
    dark1 = Color(0xFF181A20),
    dark2 = Color(0xFF1F222A),
    dark3 = Color(0xFF35383F),
    othersWhite = Color(0xFFFFFFFF),
    othersBlack = Color(0xFF000000),
    othersRed = Color(0xFFF54336),
    othersPink = Color(0xFFEA1E61),
    othersPurple = Color(0xFF9D28AC),
    othersDeepPurple = Color(0xFF673AB3),
    othersIndigo = Color(0xFF3F51B2),
    othersBlue = Color(0xFF1A96F0),
    othersLightBlue = Color(0xFF00A9F1),
    othersCyan = Color(0xFF00BCD3),
    othersTeal = Color(0xFF009689),
    othersGreen = Color(0xFF4AAF57),
    othersLightGreen = Color(0xFF8BC255),
    othersLime = Color(0xFFCDDC4C),
    othersYellow = Color(0xFFFFEB4F),
    othersAmber = Color(0xFFFFC02D),
    othersOrange = Color(0xFFFF981F),
    othersDeepOrange = Color(0xFFFF5726),
    othersBrown = Color(0xFF7A5548),
    othersBlueGrey = Color(0xFF607D8A),
    backgroundRed = Color(0xFFFFF5F6),
    backgroundPurple = Color(0xFFF4ECFF),
    backgroundGreen = Color(0xFFF2FFFC),
    backgroundOrange = Color(0xFFFFF8ED),
    backgroundPink = Color(0xFFFFF5F5),
    backgroundYellow = Color(0xFFFFFEE0),
    transparent = Color(0x00000000),
    transparentRed = Color(0x14E21221),
    transparentPurple = Color(0x147210FF),
    transparentBlue = Color(0x14335EF7),
    transparentOrange = Color(0x14FF9800),
    transparentYellow = Color(0x14FACC15),
    transparentGreen = Color(0x144CAF50),
    transparentCyan = Color(0x1400BCD4)
)

val LocalMuviColor = staticCompositionLocalOf {
    LightMuviColor
}