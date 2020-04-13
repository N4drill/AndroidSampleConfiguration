package com.example.androidsampleconfiguration.app.di.builders

import com.example.androidsampleconfiguration.app.di.FragmentScope
import com.example.androidsampleconfiguration.app.ui.master.MasterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilder {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun bindMasterFragment(): MasterFragment
}