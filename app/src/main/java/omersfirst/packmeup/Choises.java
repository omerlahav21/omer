package omersfirst.packmeup;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

/**
 * Created by Lahav on 12/1/2016.
 */
public class Choises extends MainActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);
        Log.e("started", "created");

        final Intent done = new Intent(this, view.class);
        final Intent Back = new Intent(this,MainActivity.class);

        Spinner spinner1 = (Spinner) findViewById(R.id.tripType);
        spinner1.setOnClickListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.tripType, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adapter);

        Spinner spinner2 = (Spinner) findViewById(R.id.country);
        spinner2.setOnClickListener(this);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.country, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner2.setAdapter(adapter1);

        ImageView back2a1 = (ImageView) findViewById(R.id.back2a1);
        back2a1.setOnClickListener(this);

        Button Done = (Button) findViewById(R.id.Done);
        Done.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Done:

                break;

        }
    }
}
