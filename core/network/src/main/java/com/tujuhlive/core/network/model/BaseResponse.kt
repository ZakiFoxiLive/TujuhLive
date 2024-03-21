package com.tujuhlive.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    val data: T? = null,
    val msg: String,
    val ret: Int
)