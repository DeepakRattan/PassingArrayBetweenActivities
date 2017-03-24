package com.example.deepakrattan.passingarraybetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtName, edtAge, edtCourse;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewById
        edtName = (EditText) findViewById(R.id.edtName);
        edtAge = (EditText) findViewById(R.id.edtAge);
        edtCourse = (EditText) findViewById(R.id.edtCourse);
        btnNext = (Button) findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString().trim();
                String age = edtAge.getText().toString().trim();
                String course = edtCourse.getText().toString().trim();

                //Storing information in String array
                String[] strArr = {name, age, course};

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("array",strArr);
                startActivity(intent);

            }
        });
    }
}
