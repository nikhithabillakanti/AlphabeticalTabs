package com.alphabeticaltabs;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alphabeticaltabs.models.AlphabetsModel;

import java.util.ArrayList;

/**
 * Created by venu on 13/11/17.
 */

public class AlphabetsPagerAdapter extends PagerAdapter {


    private Context mContext;
    private ArrayList<AlphabetsModel> list;

    public AlphabetsPagerAdapter(Context mContext, ArrayList<AlphabetsModel> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.adapter_alphabets_view_item, container,
                false);
        // Add viewpager_item.xml to ViewPager

        AppCompatTextView englishWordItem = (AppCompatTextView) itemView.findViewById(R.id.english_word_item);
        AppCompatTextView frenchWordItem = (AppCompatTextView) itemView.findViewById(R.id.french_word_item);

        englishWordItem.setText(""+list.get(position).englishAlphabet);
        frenchWordItem.setText(""+list.get(position).frenchAlphabet);

        ((ViewPager) container).addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
