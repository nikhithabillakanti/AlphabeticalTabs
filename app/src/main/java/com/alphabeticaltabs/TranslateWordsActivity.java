package com.alphabeticaltabs;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.MenuItem;

/**
 * Created by venu on 13/11/17.
 */


public class TranslateWordsActivity extends AppCompatActivity {


    private TextInputLayout wordsTextIpLayout;
    private AppCompatEditText editText;
    private AppCompatButton englishButton;
    private AppCompatButton frenchButton;
    private AppCompatEditText convertedEditText;
    private AppCompatButton saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_words);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        wordsTextIpLayout = (TextInputLayout) findViewById(R.id.words_text_ip_layout);
        editText = (AppCompatEditText) findViewById(R.id.edit_text);
        englishButton = (AppCompatButton) findViewById(R.id.english_button);
        frenchButton = (AppCompatButton) findViewById(R.id.french_button);
        convertedEditText = (AppCompatEditText) findViewById(R.id.converted_edit_text);
        saveButton = (AppCompatButton) findViewById(R.id.save_button);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
