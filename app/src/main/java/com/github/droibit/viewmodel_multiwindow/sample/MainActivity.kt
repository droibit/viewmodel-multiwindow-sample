package com.github.droibit.viewmodel_multiwindow.sample

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.text

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    text.text = "${viewModel::class.java.simpleName}@${viewModel.hashCode().toString(16)}"
  }
}
