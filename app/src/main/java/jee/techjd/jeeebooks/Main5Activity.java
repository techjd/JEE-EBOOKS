package jee.techjd.jeeebooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jee.techjd.jeeebooks.R;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        getSupportActionBar().setTitle("Previous Year");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b5 = (Button) findViewById(R.id.button);
        Button b6 = (Button) findViewById(R.id.button6);


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent(Main5Activity.this, Main6Activity.class);
                startActivity(i5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Main5Activity.this, Main7Activity.class);
                startActivity(i6);
            }
        });
    }
}
