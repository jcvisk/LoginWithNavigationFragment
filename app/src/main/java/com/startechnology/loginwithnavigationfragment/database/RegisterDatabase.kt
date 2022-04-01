package com.startechnology.loginwithnavigationfragment.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RegisterUserEntity::class], version = 1)
abstract class RegisterDatabase:RoomDatabase() {
    abstract val regiterDataBaseDao: RegisterDatabaseDao

    @Volatile
    private var INSTANCE:RegisterDatabase? = null

    fun getDabase(context: Context):RegisterDatabase{
        synchronized(this){

            var instance = INSTANCE

            if(instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    RegisterDatabase::class.java,
                    "users_database"
                ).build()
                INSTANCE = instance
            }
            return instance
        }
    }
}

