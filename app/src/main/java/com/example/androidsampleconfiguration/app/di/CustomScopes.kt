package com.example.androidsampleconfiguration.app.di

import javax.inject.Scope
import kotlin.annotation.AnnotationRetention.RUNTIME

@Scope
@Retention(RUNTIME)
annotation class ActivityScope

@Scope
@Retention(RUNTIME)
annotation class FragmentScope


@Scope
@Retention(RUNTIME)
annotation class ChildFragmentScope