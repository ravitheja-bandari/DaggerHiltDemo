package com.rt.daggerhiltdemo.di

import com.rt.daggerhiltdemo.data.remote.API
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(
    SingletonComponent::class // Dependencies will live as long as the Application is alive
//    ActivityComponent::class -> Dependencies will live as long as the Activity is alive
//    ActivityRetainedComponent::class, -> Will retain through Activity configuration changes
//    ViewModelComponent::class, -> Dependencies will live as long as the ViewModel is alive
//    ServiceComponent::class ->Dependencies will live as long as the Service is alive
)
object AppModule {

    /**
     * Defines the scope of the function.
     * Identifies a type that the injector only instantiates once. Not inherited.
     */
    @Provides
    @Singleton //-defines
    fun provideMyAPI(): API {
        return Retrofit.Builder()
            .baseUrl("https://cat-fact.herokuapp.com")
            .build()
            .create(API::class.java)
    }
}