package com.example.android.learnIgbo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","lutti"));
        words.add(new Word("mother yellow","abuo"));
        words.add(new Word("brother","ato"));
        words.add(new Word("sister","ano"));
        words.add(new Word("elder brother","ise"));
        words.add(new Word("elder sister","isii"));
        words.add(new Word("grand mother","asaa"));
        words.add(new Word("grand father","asato"));
        words.add(new Word("cousin","itolu"));
        words.add(new Word("mother-in-law","iri"));
        words.add(new Word("father-in-law","iri"));
        words.add(new Word("brother-in-law","iri"));
        words.add(new Word("sister-in-law","iri"));
        words.add(new Word("uncle","iri"));
        words.add(new Word("aunt","iri"));
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
