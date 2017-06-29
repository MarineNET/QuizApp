package com.viktorkhon.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             submitButton();
            }
        });
    }

    int rightAnswer = 0;
    int wrongAnswer = 0;

    public void submitButton () {
        if(displayAnswer1()) {
            rightAnswer++;
        } else {
            wrongAnswer++;
        }
        Toast.makeText(this,
                "You have " + rightAnswer + " correct and " +
                        wrongAnswer +" incorrect answers"
                , Toast.LENGTH_LONG).show();
    }

    private boolean displayAnswer1() {
        EditText answer1 = (EditText) findViewById(R.id.question1);
        String answer = answer1.getText().toString().toLowerCase();
        if(answer.equals("brazil")) {
            return true;
        }
        return false;
    }



}
