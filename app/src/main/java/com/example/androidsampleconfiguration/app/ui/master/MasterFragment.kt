package com.example.androidsampleconfiguration.app.ui.master

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.androidsampleconfiguration.R

class MasterFragment : Fragment() {

    companion object {
        fun newInstance() =
            MasterFragment()
    }

    private lateinit var viewModel: MasterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MasterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
