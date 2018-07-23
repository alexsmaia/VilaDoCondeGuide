package com.example.android.viladocondeguide;

/**
 * Created by alexandremaia on 28/03/2018.
 * <p>
 * {@link Place} represents a vocabulary word that the user want to learn
 * It contains a default translation and a Mowok translation for that word
 */

public class Place {

    /**
     * Name Place
     */
    private int mStringResourceId;
    /**
     * Image resource Id for the Place
     */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param stringResourceId is the Place name
     * @param imageResourceId is image associated to the word in the Miwok language
     */
    public Place(int stringResourceId, int imageResourceId) {
        mStringResourceId = stringResourceId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get name of the Place.
     */
    public int getPlaceName() {
        return mStringResourceId;
    }

    /**
     * Return image resource ID of the Place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}