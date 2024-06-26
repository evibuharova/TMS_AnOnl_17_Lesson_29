package com.example.tms_anonl_17_lesson_29

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao  {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>
    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>
    @Query("SELECT * FROM user WHERE email LIKE :first AND " +
            "password LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): User
    @Insert
    fun insertAll(vararg users: User)
    @Delete
    fun delete(user: User)
}