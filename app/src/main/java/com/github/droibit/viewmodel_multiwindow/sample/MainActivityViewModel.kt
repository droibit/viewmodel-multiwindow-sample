package com.github.droibit.viewmodel_multiwindow.sample

import android.arch.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

  override fun toString() = "${MainActivityViewModel::class.java.simpleName}@${hashCode().toString(16)}"
}