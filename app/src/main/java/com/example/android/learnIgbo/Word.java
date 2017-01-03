package com.example.android.learnIgbo;

/**
 * Created by ugochukwu on 12/30/16.
 * {@link Word}represent the vocabulary word that the user wants to learn
 * It contains a default translation and a miwok translation for the word
 */

public class Word {
    /*
    *   default translation for the word
    */
    private String mDefaultTranslation;

    /*
    *   miwok translation for the word
    */
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /*
    *   get default translation for the word
    */

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*
    *   get miwok translation for the word
    */

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
