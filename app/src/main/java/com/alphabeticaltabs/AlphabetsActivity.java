package com.alphabeticaltabs;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import com.alphabeticaltabs.models.AlphabetsModel;

import java.util.ArrayList;

public class AlphabetsActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private RecyclerView recyclerView;
    private AlphabetsWordsAdapter alphabetsWordsAdapter;
    private ArrayList<AlphabetsModel> wordsList;
    private AppCompatButton prevButton;
    private AppCompatButton nextButton;
    private int vPosition=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        prevButton = (AppCompatButton) findViewById(R.id.prev_button);
        nextButton = (AppCompatButton) findViewById(R.id.next_button);

        AlphabetsPagerAdapter adapter = new AlphabetsPagerAdapter(this, getAlphabets());
        viewPager.setAdapter(adapter);

        wordsList = new ArrayList<>();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        alphabetsWordsAdapter = new AlphabetsWordsAdapter(this, wordsList);
        recyclerView.setAdapter(alphabetsWordsAdapter);
        update(0);
        prevButton.setVisibility(View.GONE);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if(position == 0){
                    prevButton.setVisibility(View.GONE);
                }else{
                    prevButton.setVisibility(View.VISIBLE);
                }

                if(position == 25){
                    nextButton.setVisibility(View.GONE);
                }else{
                    nextButton.setVisibility(View.VISIBLE);
                }

                vPosition=position;
                wordsList.clear();
                alphabetsWordsAdapter.notifyDataSetChanged();
                update(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vPosition--;
                viewPager.setCurrentItem(vPosition);
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vPosition++;
                viewPager.setCurrentItem(vPosition);
            }
        });


    }

    /**
     * @param position
     */
    private void update(int position) {

        switch (position) {

            case 0:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 1:
                wordsList.add(new AlphabetsModel("BABY", "le bébé"));
                wordsList.add(new AlphabetsModel("BAG", "le sac"));
                wordsList.add(new AlphabetsModel("BANANA", "la banana"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 2:
                wordsList.add(new AlphabetsModel("CAB", "le taxi"));
                wordsList.add(new AlphabetsModel("CAKE", "la cage"));
                wordsList.add(new AlphabetsModel("CANDLE", "la bougie"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 3:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 4:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 5:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 6:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 7:
                wordsList.add(new AlphabetsModel("BABY", "le bébé"));
                wordsList.add(new AlphabetsModel("BAG", "le sac"));
                wordsList.add(new AlphabetsModel("BANANA", "la banana"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 8:
                wordsList.add(new AlphabetsModel("CAB", "le taxi"));
                wordsList.add(new AlphabetsModel("CAKE", "la cage"));
                wordsList.add(new AlphabetsModel("CANDLE", "la bougie"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 9:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 10:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 11:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 12:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 13:
                wordsList.add(new AlphabetsModel("BABY", "le bébé"));
                wordsList.add(new AlphabetsModel("BAG", "le sac"));
                wordsList.add(new AlphabetsModel("BANANA", "la banana"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 14:
                wordsList.add(new AlphabetsModel("CAB", "le taxi"));
                wordsList.add(new AlphabetsModel("CAKE", "la cage"));
                wordsList.add(new AlphabetsModel("CANDLE", "la bougie"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 15:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 16:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 17:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 18:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 19:
                wordsList.add(new AlphabetsModel("BABY", "le bébé"));
                wordsList.add(new AlphabetsModel("BAG", "le sac"));
                wordsList.add(new AlphabetsModel("BANANA", "la banana"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 20:
                wordsList.add(new AlphabetsModel("CAB", "le taxi"));
                wordsList.add(new AlphabetsModel("CAKE", "la cage"));
                wordsList.add(new AlphabetsModel("CANDLE", "la bougie"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 21:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 22:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 23:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 24:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;

            case 25:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;


            default:
                wordsList.add(new AlphabetsModel("AMBULANCE", "l'ambulance"));
                wordsList.add(new AlphabetsModel("AND", "et"));
                wordsList.add(new AlphabetsModel("ANT", "la fourmi"));
                alphabetsWordsAdapter.notifyDataSetChanged();
                break;
        }


    }

    private ArrayList<AlphabetsModel> getAlphabets() {

        ArrayList<AlphabetsModel> list = new ArrayList<>();
        list.add(new AlphabetsModel("A", "ɑ"));
        list.add(new AlphabetsModel("B", "be"));
        list.add(new AlphabetsModel("C", "se"));
        list.add(new AlphabetsModel("D", "de"));
        list.add(new AlphabetsModel("E", "ə"));

        list.add(new AlphabetsModel("F", "ɛf"));
        list.add(new AlphabetsModel("G", "ʒe"));
        list.add(new AlphabetsModel("H", "aʃ"));
        list.add(new AlphabetsModel("I", "i"));
        list.add(new AlphabetsModel("J", "ʒi"));

        list.add(new AlphabetsModel("K", "ka"));
        list.add(new AlphabetsModel("L", "ɛl"));

        list.add(new AlphabetsModel("M", "ɛm"));
        list.add(new AlphabetsModel("N", "ɛn"));
        list.add(new AlphabetsModel("O", "o"));
        list.add(new AlphabetsModel("P", "pe"));
        list.add(new AlphabetsModel("Q", "ky"));


        list.add(new AlphabetsModel("R", "ɛʀ"));
        list.add(new AlphabetsModel("S", "ɛs"));
        list.add(new AlphabetsModel("T", "te"));
        list.add(new AlphabetsModel("U", "y"));
        list.add(new AlphabetsModel("V", "ve"));

        list.add(new AlphabetsModel("W", "dubləve"));
        list.add(new AlphabetsModel("X", "iks"));
        list.add(new AlphabetsModel("Y", "igʀɛk"));
        list.add(new AlphabetsModel("Z", "zɛd"));


        return list;

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
