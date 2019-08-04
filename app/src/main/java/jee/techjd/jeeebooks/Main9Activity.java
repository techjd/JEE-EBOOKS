package jee.techjd.jeeebooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jee.techjd.jeeebooks.R;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        getSupportActionBar().setTitle("JEE MAINS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b11 = (Button)findViewById(R.id.button8);
        Button b12 = (Button)findViewById(R.id.button9);
        Button b13 = (Button)findViewById(R.id.button10);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(Main9Activity.this, Main11Activity.class);
                startActivity(i11);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(Main9Activity.this, Main12Activity.class);
                startActivity(i12);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i13 = new Intent(Main9Activity.this, Main13Activity.class);
                startActivity(i13);
            }
        });
    }
}
