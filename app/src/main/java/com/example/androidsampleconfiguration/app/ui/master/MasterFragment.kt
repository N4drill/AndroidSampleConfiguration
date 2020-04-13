package com.example.androidsampleconfiguration.app.ui.master

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.androidsampleconfiguration.app.ui.master.MasterViewModel.Action
import com.example.androidsampleconfiguration.app.ui.master.MasterViewModel.Action.SampleAction
import com.example.androidsampleconfiguration.app.ui.master.MasterViewModel.Action.SampleObjectAction
import com.example.androidsampleconfiguration.app.ui.master.MasterViewModel.Command
import com.example.androidsampleconfiguration.commons.extensions.addTo
import com.example.androidsampleconfiguration.commons.extensions.exhaustivePatternCheck
import com.example.androidsampleconfiguration.databinding.FragmentMasterBinding
import dagger.android.support.DaggerFragment
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

class MasterFragment : DaggerFragment() {

    private val viewModel: MasterViewModel by activityViewModels()
    private val compositeDisposable = CompositeDisposable()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentMasterBinding.inflate(inflater, container, false).apply {
        viewModel.observeViewModel()
        Timber.d("Master Fragment created")
    }.root

    private fun MasterViewModel.observeViewModel() {
        actions
            .subscribe({
                when (it) {
                    is SampleAction -> onAction(it)
                    SampleObjectAction -> onAction(it)
                }.exhaustivePatternCheck()
            }, { Timber.d(it, "Something went wrong observing ACTION") })
            .addTo(compositeDisposable)

        commands
            .subscribe({
                when (it) {
                    is Command.SampleCommand -> onCommand(it)
                    Command.SampleObjectCommand -> onCommand(it)
                }.exhaustivePatternCheck()
            }, { Timber.d(it, "Something went wrong observing COMMANDS") })
            .addTo(compositeDisposable)
    }

    private fun onAction(action: Action) {}
    private fun onCommand(command: Command) {}

}