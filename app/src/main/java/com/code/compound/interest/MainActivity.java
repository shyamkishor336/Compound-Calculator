package com.code.compound.interest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, address, phone;
    Button save, getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        phone = findViewById(R.id.phone);
        save = findViewById(R.id.saveBtn);
        getData = findViewById(R.id.getData);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });

        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), DataActivity.class));
            }
        });
    }

    private void saveData() {
        String nameT = name.getText().toString().trim();
        String addressT = address.getText().toString().trim();
        String phoneT = phone.getText().toString().trim();

            UserModel model = new UserModel();

            model.setName(nameT);
            model.setEmail(addressT);
            model.setPhoneno(phoneT);

            DatabaseClass.getDatabse(getApplicationContext()).getDao().insertAllData(model);



            name.setText("");
            address.setText("");
            phone.setText("");

            Toast.makeText(this, "Data Saved Successfully", Toast.LENGTH_SHORT).show();
        }

    }
