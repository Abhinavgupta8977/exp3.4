package com.example.exp34;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDBHelper dbHelper = new MyDBHelper(this);

        dbHelper.addContact("Roman", "9814123807");
        dbHelper.addContact("Ashley", "9814123803");
        dbHelper.addContact("Roomi", "9814123834");
        dbHelper.addContact("Brock", "9814123802");
    }
}
