package com.example.androidsampleconfiguration.app.ui.master

import androidx.lifecycle.ViewModel
import com.example.androidsampleconfiguration.commons.extensions.observerOnMain
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class MasterViewModel : ViewModel() {
    // -- Subjects
    private val actionSubject = PublishSubject.create<Action>()
    private val commandSubject = PublishSubject.create<Command>()

    // -- Streams
    val actions: Observable<Action>
        get() = actionSubject.observerOnMain()
    val commands: Observable<Command>
        get() = commandSubject.observerOnMain()

    //region Actions and Commands
    sealed class Action {
        data class SampleAction(val data: String) : Action()
        object SampleObjectAction : Action()
    }

    sealed class Command {
        data class SampleCommand(val data: String) : Command()
        object SampleObjectCommand : Command()
    }
    //endregion
}