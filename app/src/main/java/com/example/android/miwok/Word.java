package com.example.android.miwok;

/** {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word. */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Resource ID for the image associated with the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Resource ID for the audio pronunciation of with the word */
    private int mAudioResourceId;

    /** Create a new Word object.
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param audioResourceId is the resource ID for the audio pronunciation of the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /** Create a new Word object with an associated image.
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the resource ID of the image associated with the word
     * @param audioResourceId is the resource ID of the audio pronunciation of the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /* Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /* Get the Miwok translation of the word */
    public String getMiwokTranslation() {
       return mMiwokTranslation;
    }

    /* Get the resource ID of the image associated with the word */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /* Return whether or not there is an image for this word */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /* Return the resource ID of the audio pronunciation for the word */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}