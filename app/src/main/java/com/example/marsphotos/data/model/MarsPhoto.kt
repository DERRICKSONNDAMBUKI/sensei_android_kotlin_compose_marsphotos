package com.example.marsphotos.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsPhoto(
    val id: String,

    @SerialName(value = "img_src")
    val imgSrc: String
)
