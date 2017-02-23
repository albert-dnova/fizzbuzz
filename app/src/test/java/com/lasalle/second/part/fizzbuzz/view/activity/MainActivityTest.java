package com.lasalle.second.part.fizzbuzz.view.activity;


import android.widget.TextView;

import com.lasalle.second.part.fizzbuzz.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void clickingButtonFiresIntent() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        TextView textView = (TextView) activity.findViewById(R.id.main_activity_text);

        assertEquals(textView.getText(), "Hello World!");
    }

}
