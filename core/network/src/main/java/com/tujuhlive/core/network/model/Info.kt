package com.tujuhlive.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class Info<T>(
    val list: List<T>,
)