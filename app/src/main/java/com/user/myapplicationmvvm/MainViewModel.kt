package com.user.myapplicationmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.user.myapplicationmvvm.model.CatsModel
import com.user.myapplicationmvvm.repository.Repository

class MainViewModel : ViewModel() {

    private val _userId: MutableLiveData<String> = MutableLiveData()

    val user: LiveData<CatsModel> = Transformations
        .switchMap(_userId) { userID ->
            Repository.getUser(userID)
        }

    fun setUserId(userId: String) {
        val update = userId
        if (_userId.value == update) {
            return
        }
        _userId.value = update
    }

    fun cancelJobs() {
        Repository.cancelJobs()
    }
}