package com.example.labassignment5_localization;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public static final  String HOLDER = "";
    boolean well = false ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Spinner spinner = findViewById(R.id.spinner);
        final ConstraintLayout layout = findViewById(R.id.layout);

        getSupportActionBar().setTitle("PaletteActivity");

        spinner.setAdapter(new CustomAdapter(this)) ;


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, CanvasActivity.class);
                String colSelected = spinner.getSelectedItem().toString();

                if(well){

                    intent.putExtra("HOLDER" , colSelected);
                    startActivity(intent);
                }

                else
                {
                    well = true;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
