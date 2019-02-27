package com.example.labassignment5_localization;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        setTitle("ColorActivity");
        final ConstraintLayout lay = findViewById(R.id.layout2);
        Intent intent = getIntent();
        String col = intent.getStringExtra("HOLDER");

        lay.setBackgroundColor(Color.parseColor(col));
    }
}
