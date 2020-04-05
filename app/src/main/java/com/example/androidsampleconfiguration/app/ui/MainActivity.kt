package com.example.androidsampleconfiguration.app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidsampleconfiguration.R
import com.example.androidsampleconfiguration.app.ui.master.MasterFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MasterFragment.newInstance())
                    .commitNow()
        }
    }
}
