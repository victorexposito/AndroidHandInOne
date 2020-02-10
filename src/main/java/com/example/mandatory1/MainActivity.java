package com.example.mandatory1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contactActivity(View view){
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }

    public void aboutActivity(View view){
        Intent intent = new Intent(this, aboutActivity.class);
        startActivity(intent);
    }
}
