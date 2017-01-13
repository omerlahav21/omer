package omersfirst.packmeup;

import android.provider.BaseColumns;

/**
 * Created by Lahav on 12/19/2016.
 */
public final class FeedReaderContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private FeedReaderContract() {
    }

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "Items";
        public static final String COLUMN_NAME_TITLE = "name";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";
    }
}
