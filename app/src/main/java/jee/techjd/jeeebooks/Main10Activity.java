package jee.techjd.jeeebooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jee.techjd.jeeebooks.R;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        getSupportActionBar().setTitle("JEE ADVANCED");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button b14 = (Button)findViewById(R.id.button11);
        Button b15 = (Button)findViewById(R.id.button12);
        Button b16 = (Button)findViewById(R.id.button16);

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i14 = new Intent(Main10Activity.this, Main14Activity.class);
                startActivity(i14);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i15 = new Intent(Main10Activity.this, Main15Activity.class);
                startActivity(i15);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i16 = new Intent(Main10Activity.this, Main16Activity.class);
                startActivity(i16);
            }
        });
    }
}
