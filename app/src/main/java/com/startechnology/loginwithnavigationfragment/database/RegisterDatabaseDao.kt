package com.startechnology.loginwithnavigationfragment.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RegisterDatabaseDao {
    @Insert
    suspend fun insert(register:RegisterUserEntity)

    @Query("SELECT * FROM Register_user_table ORDER BY userId DESC")
    fun getAllUsers():LiveData<List<RegisterUserEntity>>

    @Query("SELECT * FROM Register_user_table WHERE user_name LIKE :userName")
    suspend fun getUserName(userName:String):RegisterUserEntity
}
