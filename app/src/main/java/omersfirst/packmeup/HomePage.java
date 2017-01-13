package omersfirst.packmeup;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Lahav on 11/13/2016.
 */
public class HomePage extends MainActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        Intent intent = getIntent();
    }


}
