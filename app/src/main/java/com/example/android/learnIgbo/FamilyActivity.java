package com.example.android.learnIgbo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            //create an array of words
            ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("father","lutti",R.drawable.family_father));
            words.add(new Word("mother yellow","abuo",R.drawable.family_mother));
            words.add(new Word("brother","ato",R.drawable.family_younger_brother));
            words.add(new Word("sister","ano",R.drawable.family_younger_sister));
            words.add(new Word("elder brother","ise",R.drawable.family_older_brother));
            words.add(new Word("elder sister","isii",R.drawable.family_older_sister));
            words.add(new Word("grand mother","asaa",R.drawable.family_grandmother));
            words.add(new Word("grand father","asato",R.drawable.family_grandfather));
            words.add(new Word("cousin","itolu",R.drawable.family_son));
            words.add(new Word("mother-in-law","iri",R.drawable.family_grandmother));
            words.add(new Word("father-in-law","iri",R.drawable.family_grandfather));
            words.add(new Word("brother-in-law","iri",R.drawable.family_older_brother));
            words.add(new Word("sister-in-law","iri",R.drawable.family_older_sister));
            words.add(new Word("uncle","iri",R.drawable.family_father));
            words.add(new Word("aunt","iri",R.drawable.family_mother));
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
