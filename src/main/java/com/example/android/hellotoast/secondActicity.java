package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class secondActicity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.hellotoast.extra.REPLY";
    private int mCount = 0;
    private TextView mShowCount;
    private TextView show_count;
    private Button button_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acticity);


        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.show_count);
        textView.setText(message);
        TextView button_toast= findViewById(R.id.textView2);


    }

    public void showCount(View view) {
        mCount++;
        int textView2 = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(textView2));
    }
}

