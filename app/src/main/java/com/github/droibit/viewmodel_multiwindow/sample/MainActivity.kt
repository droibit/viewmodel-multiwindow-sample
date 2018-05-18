package com.github.droibit.viewmodel_multiwindow.sample

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.text

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val vm = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
    text.text = "${vm::class.java.simpleName}@${vm.hashCode().toString(16)}"

    button.setOnClickListener {
      startActivity(Intent(this@MainActivity, FragmentActivity::class.java))
    }
  }
}
