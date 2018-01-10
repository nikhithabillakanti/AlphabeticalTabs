package com.alphabeticaltabs;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphabeticaltabs.models.AlphabetsModel;

import java.util.ArrayList;

/**
 * Created by venu on 13/11/17.
 */

public class AlphabetsWordsAdapter extends RecyclerView.Adapter<AlphabetsWordsAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<AlphabetsModel> wordsList;

    public AlphabetsWordsAdapter(Context mContext, ArrayList<AlphabetsModel> wordsList) {
        this.mContext = mContext;
        this.wordsList = wordsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_words_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.englishWordItem.setText(wordsList.get(position).englishAlphabet);
        holder.frenchWordItem.setText(wordsList.get(position).frenchAlphabet);
    }

    @Override
    public int getItemCount() {
        return wordsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private AppCompatTextView englishWordItem;
        private AppCompatTextView frenchWordItem;

        public ViewHolder(View view) {
            super(view);
            englishWordItem = (AppCompatTextView) view.findViewById(R.id.english_word_item);
            frenchWordItem = (AppCompatTextView) view.findViewById(R.id.french_word_item);
        }
    }
}
