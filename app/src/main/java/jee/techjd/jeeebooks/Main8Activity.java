package jee.techjd.jeeebooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jee.techjd.jeeebooks.R;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        getSupportActionBar().setTitle("TEST SERIES");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b8 = (Button) findViewById(R.id.button14);
        Button b9 = (Button) findViewById(R.id.button15);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(Main8Activity.this, Main9Activity.class);
                startActivity(i8);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(Main8Activity.this, Main10Activity.class);
                startActivity(i9);
            }
        });
    }
}

