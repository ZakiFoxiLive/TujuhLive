package com.tujuhlive.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class BaseData<T>(
    val code: Int,
    val info: List<Info<T>>,
    val msg: String
)