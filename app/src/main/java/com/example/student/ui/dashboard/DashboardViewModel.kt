package com.example.student.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.student.R

import com.example.student.model.datamodel.Record
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DashboardViewModel :ViewModel() {
    private var recordlist: MutableLiveData<List<Record>> = MutableLiveData()
    fun getAllRecord(): LiveData<List<Record>> {
        viewModelScope.launch(Dispatchers.IO) {

            val record = arrayListOf<Record>()
            for (i in 0..10) {
                record.add(Record(R.drawable.ic_baseline_add_circle_outline_24, ""+i, ""))

                recordlist.postValue(record)
            }
        }
        return recordlist
        // private val _text = MutableLiveData<String>().apply {
        //   value = "This is dashboard"
        // }
        //val text: LiveData<String> = _text

    }
}
