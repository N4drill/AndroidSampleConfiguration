package com.example.androidsampleconfiguration.app.di.modules

import android.content.Context
import com.example.androidsampleconfiguration.app.App
import com.example.androidsampleconfiguration.app.di.AppContext
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    @AppContext
    fun provideApplicationContext(app: App): Context = app
}