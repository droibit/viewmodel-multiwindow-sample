package com.github.droibit.viewmodel_multiwindow.sample

import android.arch.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {

  override fun toString() = "${FragmentViewModel::class.java.simpleName}@${hashCode().toString(16)}"
}