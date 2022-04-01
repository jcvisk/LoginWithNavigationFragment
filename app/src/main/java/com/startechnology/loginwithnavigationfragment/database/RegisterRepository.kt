package com.startechnology.loginwithnavigationfragment.database

class RegisterRepository(private val registerDao:RegisterDatabaseDao) {

    val users = registerDao.getAllUsers()

    suspend fun insert(user:RegisterUserEntity){
        return registerDao.insert(user)
    }

    suspend fun getUserName(userName:String):RegisterUserEntity{
        return registerDao.getUserName(userName)
    }

}