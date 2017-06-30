package com.viktorkhon.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Create 2 int instance variables, that will be used to display total
    // right and wrong answers to a user
    private int rightAnswer = 0;
    private int wrongAnswer = 0;

    CheckBoxes answer3 = new CheckBoxes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find Button {@id submitButton} and cast it into (Button)
        Button submitButton = (Button) findViewById(R.id.submitButton);
        // Set a click listener on this Button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             // Use submitButton function upon getting a click
             submitButton();
            }
        });
    }

    // Upon clicking on Submit Button by a user, this code will run
    public void submitButton () {
        // create a boolean Array to store values for answers from each question
        boolean [] allAnswers = new boolean[4];
        allAnswers[0] = answerForQuestion1();
        allAnswers[1] = answerForQuestion2();
        allAnswers[2] = answerForQuestion3();
        allAnswers[3] = answerForQuestion4();

        // Use for loop to check each answer and count how many a user got right
        // or wrong
        for (int i = 0; i < allAnswers.length; i++) {
            if (allAnswers[i]) {
                rightAnswer++;
            } else {
                wrongAnswer++;
            }
        }
        // after calculating total number of right and wrong answers, show a Toast
        // message that gives a summary of how a user performed
        Toast.makeText(this,
                "You have " + rightAnswer + " correct and " +
                        wrongAnswer +" incorrect answers"
                , Toast.LENGTH_LONG).show();

        // After each Toast message, reset answers back to 0
        rightAnswer = 0;
        wrongAnswer = 0;
    }

    // Check if user's input is equal to the answer "brazil"
    public boolean answerForQuestion1() {
        // Find EditText View {@id answer1} and cast it as EditText
        EditText answer1 = (EditText) findViewById(R.id.answer1);
        // Accept user's input and stores it as a lower case String
        String answer = answer1.getText().toString().toLowerCase();
        // use .equals method to compare the String from a user to answer "brazil"
        if (answer.equals("brazil")) {
            return true;
        }
        // return false if the input is incorrect
        return false;
    }

    // Create onClick attribute on each RadioButton in XML and use it to create
    // a new method that will allow a user to choose only 1 out of 4 answers
    public void radioButtonClicked(View view) {
        // Check to see if a user clicked on 1 of the 4 radio buttons and store answer
        // in boolean checked
        boolean checked = ((RadioButton) view).isChecked();
        // use switch loop to check all 4 RadioButtons IDs for a click
        // Once a click is detected, the loop breaks and no more checks are allowed
        switch (view.getId()) {
            case R.id.radioSwitzerland:
                if (checked)
                    break;
            case R.id.radioEngland:
                if (checked)
                    break;
            case R.id.radioFrance:
                if (checked)
                    break;
            case R.id.radioNorway:
                if (checked)
                    break;
        }
    }

    // Assign answer to RadioButton {@id radioSwitzerland} and create an if statement
    // to check if the user chose the correct button
    public boolean answerForQuestion2() {
        RadioButton answer2 = (RadioButton) findViewById(R.id.radioSwitzerland);
        if (answer2.isChecked()) {
            return true;
        }
        return false;
    }

    public boolean answerForQuestion3() {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
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

    // Check if user's input is equal to the answer "greece"
    public boolean answerForQuestion4() {
        // Find EditText View {@id answer4} and cast it as EditText
        EditText answer4 = (EditText) findViewById(R.id.answer4);
        // Accept user's input and stores it as a lower case String
        String answer = answer4.getText().toString().toLowerCase();
        // use .equals method to compare the String from a user to answer "greece"
        if (answer.equals("greece")) {
            return true;
        }
        // return false if the input is incorrect
        return false;
    }

}
