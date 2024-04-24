package com.example.jetpackcomposetraining

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Retention(AnnotationRetention.BINARY)
@Target(
    AnnotationTarget.ANNOTATION_CLASS,
    AnnotationTarget.FUNCTION
)
@Preview(name = "01-PHONE", device = Devices.PHONE)
@Preview(name = "02-FOLDABLE", device = Devices.FOLDABLE)
@Preview(name = "03-SMALL", widthDp = 320, heightDp = 480)
@Preview(name = "04-NEXUS_7", device = Devices.NEXUS_7)
@Preview(name = "05-NEXUS_7_2013", device = Devices.NEXUS_7_2013)
@Preview(name = "06-NEXUS_5", device = Devices.NEXUS_5)
@Preview(name = "07-NEXUS_6", device = Devices.NEXUS_6)
@Preview(name = "08-NEXUS_5X", device = Devices.NEXUS_5X)
@Preview(name = "09-NEXUS_6P", device = Devices.NEXUS_6P)
@Preview(name = "10-PIXEL", device = Devices.PIXEL)
@Preview(name = "11-PIXEL_XL", device = Devices.PIXEL_XL)
@Preview(name = "12-PIXEL_2", device = Devices.PIXEL_2)
@Preview(name = "13-PIXEL_2_XL", device = Devices.PIXEL_2_XL)
@Preview(name = "14-PIXEL_3", device = Devices.PIXEL_3)
@Preview(name = "15-PIXEL_3_XL", device = Devices.PIXEL_3_XL)
@Preview(name = "16-PIXEL_3A", device = Devices.PIXEL_3A)
@Preview(name = "17-PIXEL_3A_XL", device = Devices.PIXEL_3A_XL)
@Preview(name = "18-PIXEL_4", device = Devices.PIXEL_4)
@Preview(name = "19-PIXEL_4_XL", device = Devices.PIXEL_4_XL)
@Preview(name = "20-PIXEL_4A", device = Devices.PIXEL_4A)
@Preview(name = "21-PIXEL_5", device = Devices.PIXEL_5)
@Preview(name = "22-PIXEL_6", device = Devices.PIXEL_6)
@Preview(name = "23-PIXEL_6_PRO", device = Devices.PIXEL_6_PRO)
@Preview(name = "24-PIXEL_6A", device = Devices.PIXEL_6A)
@Preview(name = "25-PIXEL_7", device = Devices.PIXEL_7)
@Preview(name = "26-PIXEL_7_PRO", device = Devices.PIXEL_7_PRO)
@Preview(name = "27-PIXEL_7A", device = Devices.PIXEL_7A)
@Preview(name = "28-PIXEL_FOLD", device = Devices.PIXEL_FOLD)
@Preview(name = "29-NEXUS_10", device = Devices.NEXUS_10)
@Preview(name = "30-PIXEL_C", device = Devices.PIXEL_C)
@Preview(name = "31-PIXEL_TABLET", device = Devices.PIXEL_TABLET)
@Preview(name = "32-AUTOMOTIVE_1024p", device = Devices.AUTOMOTIVE_1024p)
@Preview(name = "33-DESKTOP", device = Devices.DESKTOP)
@Preview(name = "34-TV_720p", device = Devices.TV_720p)
@Preview(name = "35-TV_1080p", device = Devices.TV_1080p)
@Preview(name = "36-TABLET", device = Devices.TABLET)
@Preview(name = "37-NEXUS_9", device = Devices.NEXUS_9)
annotation class PreviewMuviScreenSizes