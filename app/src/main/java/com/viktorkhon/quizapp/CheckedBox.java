package com.viktorkhon.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

/**
 * Created by Viktor Khon on 6/30/2017.
 */

public class CheckedBox extends AppCompatActivity {

    public boolean answerForQuestion3() {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox3_1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox3_2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3_3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox3_4);
        // Create an if statement to check if a user has chosen exactly checkBox1 AND
        // checkBox2, and NOT checkBox3 NOR checkBox4
        if (checkBox1.isChecked() && checkBox2.isChecked() &&
                !checkBox3.isChecked() && !checkBox4.isChecked()) {
            // If only checkBox1 AND checkBox2 are chosen, return true
            return true;
        }
        // If any other combination is chosen, return false
        return false;
    }
}
