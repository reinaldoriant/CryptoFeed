package com.ruangaldo.cryptofeed

/**
 * Written with joy and smile by Ruang Aldo on 11/10/23.
 * Github: https://github.com/reinaldoriant
 */

// Call me CryptoFeed Aggregate
data class CryptoFeed(
    val coinInfo: CoinInfo,
    val raw: Raw,
)

// Call me CoinInfo Entity
data class CoinInfo(
    val id: String,
    val name: String,
    val fullName: String,
)

// Call me Raw value object
data class Raw(
    val usd: Usd,
)

data class Usd(
    val price: Double,
    val changePctDay: Long,
)
