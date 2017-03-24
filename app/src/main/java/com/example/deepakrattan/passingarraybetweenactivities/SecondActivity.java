package com.example.deepakrattan.passingarraybetweenactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView txtName, txtAge, txtCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //findViewById
        txtName = (TextView) findViewById(R.id.txtName);
        txtAge = (TextView) findViewById(R.id.txtAge);
        txtCourse = (TextView) findViewById(R.id.txtCourse);


        //Getting array from previous screen
        String[] array = getIntent().getStringArrayExtra("array");
        txtName.setText(array[0]);
        txtAge.setText(array[1]);
        txtCourse.setText(array[2]);
    }
}
