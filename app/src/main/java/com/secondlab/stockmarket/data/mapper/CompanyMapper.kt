package com.secondlab.stockmarket.data.mapper

import com.secondlab.stockmarket.data.local.CompanyListingEntity
import com.secondlab.stockmarket.data.remote.dto.CompanyInfoDto
import com.secondlab.stockmarket.domain.model.CompanyInfo
import com.secondlab.stockmarket.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: ",",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}
