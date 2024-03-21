package com.tujuhlive.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Trending(
    @SerialName("anyway") val anyway: String,
    @SerialName("avatar") val avatar: String,
    @SerialName("avatar_thumb") val avatarThumb: String,
    @SerialName("city") val city: String,
    @SerialName("game") val game: String,
    @SerialName("game_action") val gameAction: String,
    @SerialName("goodnum") val goodNum: String,
    @SerialName("hotvotes") val hotVotes: String,
    @SerialName("isrecommend") val isRecommend: String,
    @SerialName("isshop") val isShop: String,
    @SerialName("isvideo") val isVideo: String,
    @SerialName("level") val level: String,
    @SerialName("level_anchor") val levelAnchor: String,
    @SerialName("live_type") val liveType: String,
    @SerialName("nums") val numS: String,
    @SerialName("pull") val pull: String,
    @SerialName("sex") val sex: String,
    @SerialName("starttime") val startTime: String,
    @SerialName("stream") val stream: String,
    @SerialName("thumb") val thumb: String,
    @SerialName("title") val title: String,
    @SerialName("type") val type: String,
    @SerialName("type_val") val typeVal: String,
    @SerialName("uid") val uid: String,
    @SerialName("user_nickname") val userNickname: String,
    @SerialName("user_username") val userUsername: String
)