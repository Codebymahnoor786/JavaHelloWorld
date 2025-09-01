package com.example.firstandroidproject;   // <-- apna exact package name lagana

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class mainactivityjava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // yahan wahi layout chalega jo Kotlin wali use kar rahi thi
    }
}