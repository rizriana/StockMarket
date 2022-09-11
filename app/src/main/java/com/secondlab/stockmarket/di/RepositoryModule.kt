package com.secondlab.stockmarket.di

import com.secondlab.stockmarket.data.csv.CSVParser
import com.secondlab.stockmarket.data.csv.CompanyListingsParser
import com.secondlab.stockmarket.data.repository.StockRepositoryImpl
import com.secondlab.stockmarket.domain.model.CompanyListing
import com.secondlab.stockmarket.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingParser(
        companyListingsParser: CompanyListingsParser,
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl,
    ): StockRepository

}