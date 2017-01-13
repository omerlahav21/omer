package omersfirst.packmeup;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    //remark for commit
    //remark for 2nd commit
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a1);
        Log.e("started", "created");
        final Intent Choises = new Intent(this, Choises.class);
        final Intent Flights = new Intent(this, Flights.class);
        final Intent Hotels = new Intent(this, Hotels.class);

        final Button Pack = (Button) findViewById(R.id.Pack);
        Pack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(Choises);
            }
        });

        final ImageView hotels = (ImageView) findViewById(R.id.imageView4);
        hotels.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(Hotels);
            }
        });

        final ImageView flights = (ImageView) findViewById(R.id.imageView3);
        flights.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(Flights);
            }
        });

    }
}