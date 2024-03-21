package com.tujuhlive.feature.home.domain.usecase

import com.tujuhlive.core.common.UiEvent
import com.tujuhlive.feature.home.domain.model.Trending
import com.tujuhlive.feature.home.domain.repository.TrendingRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class TrendingUseCase @Inject constructor(private val trendingRepository: TrendingRepository){
    operator fun invoke(language:String, uid: String, p: Int, refreshOrder: Int) = flow<UiEvent<List<Trending>>> {
        emit(UiEvent.Loading())
        emit(UiEvent.Success(trendingRepository.getTrendingList(language, uid, p, refreshOrder)))
    }.catch {
        emit(UiEvent.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)
}