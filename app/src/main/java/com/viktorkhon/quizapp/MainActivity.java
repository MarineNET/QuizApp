package com.viktorkhon.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
        if (answerForQuestion1()) {
            rightAnswer++;
        } else {
            wrongAnswer++;
        }
        if (answerForQuestion2()) {
            rightAnswer++;
        } else {
            wrongAnswer++;
        }
        Toast.makeText(this,
                "You have " + rightAnswer + " correct and " +
                        wrongAnswer +" incorrect answers"
                , Toast.LENGTH_LONG).show();
    }

    private boolean answerForQuestion1() {
        EditText answer1 = (EditText) findViewById(R.id.answer1);
        String answer = answer1.getText().toString().toLowerCase();
        if (answer.equals("brazil")) {
            return true;
        }
        return false;
    }

    public void radioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
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

    public boolean answerForQuestion2() {
        RadioButton answer2 = (RadioButton) findViewById(R.id.radioSwitzerland);
        if (answer2.isChecked()) {
            return true;
        }
        return false;
    }

}
