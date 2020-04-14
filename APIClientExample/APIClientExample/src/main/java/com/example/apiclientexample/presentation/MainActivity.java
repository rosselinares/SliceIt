package com.example.apiclientexample.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.apiclientexample.R;

public class MainActivity extends AppCompatActivity {
    private Button apiCallButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiCallButton = findViewById(R.id.api_call_button);

        apiCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // this is an empty method on master
            }
        });


    }
}
