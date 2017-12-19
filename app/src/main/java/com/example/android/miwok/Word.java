package com.example.android.miwok;

/**
 * Created by ebtesam on 12/8/2017 AD.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;


    public Word(String defaultTranslation, String miwokTranslation, int mMediaPlayer) {
               mDefaultTranslation = defaultTranslation;
               mMiwokTranslation = miwokTranslation;
               mAudioResourceId=mMediaPlayer;
           }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId,int mMediaPlayer) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId=mMediaPlayer;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
         return mMiwokTranslation;
    }

    public int getmImageResourceId(){return mImageResourceId;}
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
