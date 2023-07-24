package com.rt.daggerhiltdemo.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}