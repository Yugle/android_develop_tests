package com.example.android.marsphotos.newwork

import com.squareup.moshi.Json

data class MarsPhoto (
    val id: String, @Json(name = "img_src") val img_src: String
)