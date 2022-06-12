package com.code.compound.interest;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class UserModel {

    @PrimaryKey(autoGenerate = true)
    private int key;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "phoneno")
    private String phoneno;

    @ColumnInfo(name = "email")
    private String email;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
