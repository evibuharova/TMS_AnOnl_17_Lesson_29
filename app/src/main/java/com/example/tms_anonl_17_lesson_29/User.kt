package com.example.tms_anonl_17_lesson_29

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="user")
data class User(
    @PrimaryKey (autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "email") val email: String?,
    @ColumnInfo(name = "password") val password: String?
)
