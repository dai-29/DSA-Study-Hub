package com.example.dsa_projectpatwal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView ds = findViewById(R.id.ds);
        TextView algorithms = findViewById(R.id.algorithm);
        TextView practice = findViewById(R.id.practice);

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dsIntent = new Intent(MainActivity.this, DsActivity.class);
                startActivity(dsIntent);
            }
        });

        algorithms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent algoIntent = new Intent(MainActivity.this, AlgorithmActivity.class);
                startActivity(algoIntent);
            }
        });

        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent practiceIntent = new Intent(MainActivity.this, practiceActivity.class);
                startActivity(practiceIntent);
            }
        });
    }
}
