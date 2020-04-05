package com.example.androidsampleconfiguration.app.ui.master

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidsampleconfiguration.R

class MasterFragment : Fragment() {

    companion object {
        fun newInstance() =
            MasterFragment()
    }

    private lateinit var viewModel: MasterViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MasterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
