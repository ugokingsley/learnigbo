package com.example.android.learnIgbo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","lutti"));
        words.add(new Word("mustard yellow","abuo"));
        words.add(new Word("dusty yellow","ato"));
        words.add(new Word("green","ano"));
        words.add(new Word("brown","ise"));
        words.add(new Word("grey","isii"));
        words.add(new Word("blue","asaa"));
        words.add(new Word("black","asato"));
        words.add(new Word("white","itolu"));
        words.add(new Word("purple","iri"));
        /*
        *  use this to display a list view - non scrollable interface
        *
        //find the root view of the whole layout
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        for(int index = 0; index < words.size(); index++){
            //create a new text view
            TextView wordView = new TextView(this);
            //set the text to be word as the current index
            wordView.setText(words.get(index));
            //add this view as another child to the root view of the layout
            rootView.addView(wordView);

        }*/

        // using array adapter to display list view- scrollable interface

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
