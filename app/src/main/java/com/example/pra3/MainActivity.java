package com.example.pra3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mRed;
    private Button mYellow;
    private Button mGreen;
    private TextView textV;
    private ConstraintLayout clayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textV = findViewById(R.id.textV);
        mRed = findViewById(R.id.mRed);
        mRed.setOnClickListener(view ->
        {

            textV.setText(R.string.red);
            clayout.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        });
        
    }



    public void onClick(View view) {
    }
}