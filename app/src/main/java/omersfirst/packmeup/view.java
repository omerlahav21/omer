package omersfirst.packmeup;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Lahav on 12/19/2016.
 */
public class view extends Choises {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3);
        Log.e("started", "created");
        Intent intent = getIntent();

        final Intent Back = new Intent(this,MainActivity.class);

        ImageView back2a1 = (ImageView) findViewById(R.id.back2a2);
        back2a1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(Back);
            }
        });
    }
    public static void Miami()
    {


    }
}
