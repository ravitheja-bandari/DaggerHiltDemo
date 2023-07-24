package com.rt.daggerhiltdemo.presentation

import androidx.lifecycle.ViewModel
import com.rt.daggerhiltdemo.domain.repository.MyRepository

class MyViewModel(private val repository: MyRepository):ViewModel() {
}