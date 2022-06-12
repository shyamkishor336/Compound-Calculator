package com.code.compound.interest;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Daoclass {
    @Query("SELECT * FROM user")
    List<UserModel> getAllData();


    @Insert
    void insertAllData(UserModel  users);

//    @Delete
//    void delete(UserModel user);
}