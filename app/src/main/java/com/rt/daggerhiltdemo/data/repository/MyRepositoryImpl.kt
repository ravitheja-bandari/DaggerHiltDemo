package com.rt.daggerhiltdemo.data.repository

import com.rt.daggerhiltdemo.data.remote.API
import com.rt.daggerhiltdemo.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: API
) : MyRepository{

    override suspend fun doNetworkCall() {

    }
}