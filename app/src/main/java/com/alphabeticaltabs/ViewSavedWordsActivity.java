package com.alphabeticaltabs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

public class ViewSavedWordsActivity extends AppCompatActivity {

    private AppCompatTextView noDataHintTv;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_saved_words);

        noDataHintTv = (AppCompatTextView) findViewById(R.id.no_data_hint_tv);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
