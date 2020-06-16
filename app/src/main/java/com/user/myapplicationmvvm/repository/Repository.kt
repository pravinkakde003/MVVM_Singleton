package com.user.myapplicationmvvm.repository

import androidx.lifecycle.LiveData
import com.user.myapplicationmvvm.api.MyRetrofitBuilder
import com.user.myapplicationmvvm.model.CatsModel
import com.user.myapplicationmvvm.model.User
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

object Repository {

    var job: CompletableJob? = null

    fun getUser(userId: String): LiveData<CatsModel>{
        job = Job()
        return object: LiveData<CatsModel>(){
            override fun onActive() {
                super.onActive()
                job?.let{ theJob ->
                    CoroutineScope(IO + theJob).launch {
                        val catsModel = MyRetrofitBuilder.apiService.getAnimalsData(userId)
                        // Switch to main thread and set Live data
                        withContext(Main){
                            value = catsModel
                            theJob.complete()
                        }
                    }
                }
            }
        }
    }

    fun cancelJobs(){
        job?.cancel()
    }
}
