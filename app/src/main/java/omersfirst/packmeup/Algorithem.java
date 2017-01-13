package omersfirst.packmeup;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Lahav on 12/1/2016.
 */
public class Algorithem extends Choises{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2_wating);
        Log.e("started", "created");
        Intent intent = getIntent();

    }
}
