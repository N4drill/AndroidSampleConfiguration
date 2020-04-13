package com.example.androidsampleconfiguration.commons.extensions

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject

fun Disposable.addTo(compositeDisposable: CompositeDisposable) {
    compositeDisposable.add(this)
}

fun <T> PublishSubject<T>.observerOnMain(): Observable<T> =
    observeOn(AndroidSchedulers.mainThread())

fun <T> Observable<T>.subscribeOnComputation(): Observable<T> =
    subscribeOn(Schedulers.computation())

fun <T> Observable<T>.subscribeOnIO(): Observable<T> =
    subscribeOn(Schedulers.io())