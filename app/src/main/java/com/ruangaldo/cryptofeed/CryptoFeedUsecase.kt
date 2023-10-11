package com.ruangaldo.cryptofeed

import kotlinx.coroutines.flow.Flow
import java.lang.Exception

/**
 * Written with joy and smile by Ruang Aldo on 11/10/23.
 * Github: https://github.com/reinaldoriant
 */

// Di unclebob masuknya entity dan ini domain
interface CryptoFeedUsecase {
    fun load(): Flow<CryptoFeedResult>
}

sealed class CryptoFeedResult {
    data class Success(val cryptoFeed: List<CryptoFeed>) : CryptoFeedResult()
    data class Error(val exception: Exception) : CryptoFeedResult()
}
