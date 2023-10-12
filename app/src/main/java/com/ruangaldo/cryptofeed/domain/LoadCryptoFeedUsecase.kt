package com.ruangaldo.cryptofeed.domain

import kotlinx.coroutines.flow.Flow
import java.lang.Exception

/**
 * Written with joy and smile by Ruang Aldo on 11/10/23.
 * Github: https://github.com/reinaldoriant
 */

// Di unclebob masuknya entity dan ini domain
interface LoadCryptoFeedUsecase {
    fun load(): Flow<LoadCryptoFeedResult>
}

sealed class LoadCryptoFeedResult {
    data class Success(val cryptoFeed: List<CryptoFeed>) : LoadCryptoFeedResult()
    data class Error(val exception: Exception) : LoadCryptoFeedResult()
}
