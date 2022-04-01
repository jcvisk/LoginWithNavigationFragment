package com.startechnology.loginwithnavigationfragment.login

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.startechnology.loginwithnavigationfragment.database.RegisterRepository

class LoginViewModelFactory(private val repository: RegisterRepository,private val application: Application):
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(repository, application) as T
    }

}