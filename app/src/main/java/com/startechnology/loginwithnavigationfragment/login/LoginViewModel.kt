package com.startechnology.loginwithnavigationfragment.login

import android.app.Application
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.startechnology.loginwithnavigationfragment.database.RegisterRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: RegisterRepository, application: Application): AndroidViewModel(application), Observable {

    val users = repository.users

    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    @Bindable
    val inputUserName = MutableLiveData<String>()

    @Bindable
    val inputPassword = MutableLiveData<String>()

    private val _errorToast = MutableLiveData<Boolean>()

    val errorToast: LiveData<Boolean>
    get() = _errorToast

    fun loginButton(){
        if (inputUserName.value == null || inputPassword == null){
            _errorToast.value = true
        }else{
            uiScope.launch {
                val credentialUserName = repository.getUserName(inputUserName.value!!)
            }
        }
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

}