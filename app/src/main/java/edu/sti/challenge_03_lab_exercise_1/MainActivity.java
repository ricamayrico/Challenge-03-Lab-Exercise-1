package edu.sti.challenge_03_lab_exercise_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Clear(View view){
        EditText editText = (EditText) findViewById(R.id.edit_message);
        editText.setText("");

    }
}
