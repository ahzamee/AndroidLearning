package com.ewu.androidpractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ewu.androidpractice.activity.Dashboard;
import com.ewu.androidpractice.databaseAdapter.DatabaseAdapter;

public class MainActivity extends AppCompatActivity {
    DatabaseAdapter MyDB;
    EditText name, email, phone_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDB = new DatabaseAdapter(this);
    }

    public void registration(View view) {
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone_number = findViewById(R.id.phone_number);
        boolean isInserted=false;

        try {
            isInserted = MyDB.insertData(name.getText().toString(), email.getText().toString(), phone_number.getText().toString());
        }catch (Exception e){
            Toast.makeText(getApplicationContext(), "Insert Correct Data", Toast.LENGTH_LONG).show();
        }

        if (isInserted == true) {
            Toast.makeText(getApplicationContext(), "Data is Inserted", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(getApplicationContext(), Dashboard.class);
            startActivity(intent);
        } else
            Toast.makeText(getApplicationContext(), "ERROR", Toast.LENGTH_LONG).show();
    }
}
