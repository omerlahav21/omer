package omersfirst.packmeup;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.jar.Attributes;

/**
 * Created by Lahav on 11/13/2016.
 */
public class UserDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "USERINFO.DB";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_QUERY =
            "CREATE TABLE " + User.NewUserInfo.TABLE_NAME+"("+ User.NewUserInfo.USER_NAME+" TEXT,"+
                    User.NewUserInfo.USER_PASSWORD+" TEXT,"+ User.NewUserInfo.USER_EMAIL+" TEXT);";
    public UserDBHelper(Context context)
    {

        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        Log.e("DATABASE OPERATIONS","DATABASE CREATED/ OPENED...");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_QUERY);
        Log.e("DATABASE OPERATIONS","Table CREATED...");
    }

    public void addinfos(String name, String password, String email, SQLiteDatabase db){

        ContentValues contentValues = new ContentValues();
        contentValues.put(User.NewUserInfo.USER_NAME, name );
        contentValues.put(User.NewUserInfo.USER_PASSWORD, password );
        contentValues.put(User.NewUserInfo.USER_EMAIL, email );
        db.insert(User.NewUserInfo.TABLE_NAME, null, contentValues);
        Log.e("DATABASE OPERATIONS","one row has been inserted...");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
