package com.startechnology.loginwithnavigationfragment.login

import android.app.Application
import androidx.databinding.Observable
import androidx.lifecycle.AndroidViewModel
import com.startechnology.loginwithnavigationfragment.database.RegisterRepository

class LoginViewModel(private val repository: RegisterRepository, application: Application): AndroidViewModel(application), Observable {

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

}