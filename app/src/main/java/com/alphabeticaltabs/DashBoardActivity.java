package com.alphabeticaltabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class DashBoardActivity extends AppCompatActivity implements View.OnClickListener {



    private LinearLayout alphabetsLayout;
    private LinearLayout translateAlphabetsLayout;
    private LinearLayout savedAlphabetsLayout;
    private LinearLayout examLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        alphabetsLayout = (LinearLayout) findViewById(R.id.alphabets_layout);
        translateAlphabetsLayout = (LinearLayout) findViewById(R.id.translate_alphabets_layout);
        savedAlphabetsLayout = (LinearLayout) findViewById(R.id.saved_alphabets_layout);
        examLayout = (LinearLayout) findViewById(R.id.exam_layout);

        translateAlphabetsLayout.setOnClickListener(this);
        alphabetsLayout.setOnClickListener(this);
        savedAlphabetsLayout.setOnClickListener(this);
        examLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.alphabets_layout:
                callCommonIntent(AlphabetsActivity.class);
                break;

            case R.id.translate_alphabets_layout:
                callCommonIntent(TranslateWordsActivity.class);
                break;

            case R.id.saved_alphabets_layout:
                callCommonIntent(ViewSavedWordsActivity.class);
                break;

            case R.id.exam_layout:
                callCommonIntent(TakeATestActivity.class);
                break;

        }
    }

    /**
     * @param className
     */
    private void callCommonIntent(Class className) {

        Intent intent = new Intent(this, className);
        startActivity(intent);
    }
}
