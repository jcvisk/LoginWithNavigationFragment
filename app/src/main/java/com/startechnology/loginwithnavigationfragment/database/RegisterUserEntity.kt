package com.startechnology.loginwithnavigationfragment.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Register_user_table")
data class RegisterUserEntity(
    @PrimaryKey (autoGenerate = true)
    var userId:Int=0,
    @ColumnInfo(name = "first_name")
    val firstName:String,
    @ColumnInfo(name = "last_name")
    val lastName:String,
    @ColumnInfo(name = "user_name")
    val userName:String,
    @ColumnInfo(name = "password_text")
    val password:String,
)