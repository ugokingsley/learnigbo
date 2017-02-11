package com.example.android.learnIgbo;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ugochukwu on 12/30/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /** resource Id for the background color for the list of words **/

    private int mColorResourceId;

    /**
     * create a new link(@link WordAdapter object)
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of objects (@link Word) to display in a list
     */
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;

    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());



        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            //set the image view to the image resource specified in the current view
            imageView.setImageResource(currentWord.getmImageResourceId());
            //make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }else{
            //Otherwise hide image view, set visibility to GONE
            imageView.setVisibility(View.GONE);
        }


        //set the theme color for the list item
        View textConttainer = listItemView.findViewById(R.id.text_container);
        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //set the background color to the text container View
        textConttainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
