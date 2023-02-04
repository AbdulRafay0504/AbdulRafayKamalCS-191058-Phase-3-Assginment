package com.example.student.ui.favourite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.student.R
import com.example.student.model.datamodel.FavouriteRecord
import com.example.student.model.datamodel.Record
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FavouriteViewModel :ViewModel() {
    private var favrecordlist: MutableLiveData<List<FavouriteRecord>> = MutableLiveData()
    fun getAllFavRecords(): LiveData<List<FavouriteRecord>>{
        viewModelScope.launch(Dispatchers.IO) {

            val record = arrayListOf<FavouriteRecord>()
            for (i in 0..10){
                if(i%2 == 0)
                record.add(FavouriteRecord(R.drawable.image_avatar, "DSUStudent-"+i,"Hello this is discription",true))
                else
                    record.add(FavouriteRecord(R.drawable.image_avatar, "DSUStudent-"+i,"Hello this is discription",false))
                favrecordlist.postValue(record)
            }
        }
        return  favrecordlist


    }





}
