package com.blank.blank.projectwednsday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_testclick(View view) {

        Button test = (Button)findViewById(R.id.btn_test);
        test.setText("hej :D");

    }
}