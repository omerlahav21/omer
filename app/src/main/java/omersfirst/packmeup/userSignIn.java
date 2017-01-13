package omersfirst.packmeup;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Lahav on 12/30/2016.
 */
public class userSignIn extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_sign_in);
        Log.e("started", "created");

        EditText UserName =new EditText();

    }
}