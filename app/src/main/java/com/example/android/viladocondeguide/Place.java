package com.example.android.viladocondeguide;

/**
 * Created by alexandremaia on 28/03/2018.
 * <p>
 * {@link Place} represents a vocabulary word that the user want to learn
 * It contains a default translation and a Mowok translation for that word
 */

public class Place {

    /**
     * Constant value no image provided for this Place
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Name Place
     */
    private String mPlaceName;
    /**
     * Image resource Id for the Place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Place object.
     *
     * @param placeName       is the Place name
     * @param imageResourceId is image associated to the word in the Miwok language
     */
    public Place(String placeName, int imageResourceId) {
        mPlaceName = placeName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get name of the word.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Return image resource ID of the Place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}