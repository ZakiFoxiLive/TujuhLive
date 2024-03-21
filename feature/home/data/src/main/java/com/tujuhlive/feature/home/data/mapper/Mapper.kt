package com.tujuhlive.feature.home.data.mapper

import com.tujuhlive.core.network.model.BaseData
import com.tujuhlive.core.network.model.BaseResponse
import com.tujuhlive.core.network.model.Info
import com.tujuhlive.feature.home.domain.model.Trending

fun BaseResponse<BaseData<Info<com.tujuhlive.core.network.model.Trending>>>.toDomainTrendingList():List<Trending>{
    return this.data!!.info[0].list[0].list.map {
        Trending(avatar = it.avatar)
    }
}