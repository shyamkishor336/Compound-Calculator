package com.code.compound.interest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DataActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        recyclerView = findViewById(R.id.recycler);

        getData();

    }

    public void getData() {
        recyclerView.setAdapter(new UserAdapter(getApplicationContext(), DatabaseClass.getDatabse(getApplicationContext()).getDao().getAllData()));
    }
}