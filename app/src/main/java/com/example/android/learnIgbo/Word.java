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

    /*
   *   image resource id for the word
   */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    private static final int NO_IMAGE_PROVIDED = -1;


    private int mAudioResourceId;

    /*
    * create a new Word object
    *
    * @param defaultTranslation a word in english language
    * @param miwokTranslation a word in igbo language
    *
    */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }



    /*
    * create a new Word object
    *
    * @param defaultTranslation a word in english language
    * @param miwokTranslation a word in igbo language
    * @param int imageResourceId is the drawable resource ID for the image asset
    */
    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
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

    /*
    *   return the image resource id of a word
    */

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /*
    * returns whether or not there is an image for this word
    *
    */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    /*
    * returns the audio resource ID of a word
    *
    */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
