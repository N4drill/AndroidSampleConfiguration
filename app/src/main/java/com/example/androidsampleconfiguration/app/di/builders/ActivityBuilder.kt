package com.example.androidsampleconfiguration.app.di.builders

import com.example.androidsampleconfiguration.app.di.ActivityScope
import com.example.androidsampleconfiguration.app.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class, FragmentBuilder::class])
    abstract fun bindMainActivity(): MainActivity

}

@Module
class MainActivityModule