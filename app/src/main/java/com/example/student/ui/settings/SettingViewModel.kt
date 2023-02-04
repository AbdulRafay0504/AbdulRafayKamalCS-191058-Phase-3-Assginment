package com.example.student.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is setting fragment"
    }
    val text: LiveData<String> = _text
}