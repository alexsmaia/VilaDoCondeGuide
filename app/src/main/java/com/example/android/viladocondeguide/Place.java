package com.example.android.viladocondeguide;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alexandremaia on 28/03/2018.
 * <p>
 * {@link Place} represents a vocabulary word that the user want to learn
 * It contains a default translation and a Mowok translation for that word
 */

public class Place implements Parcelable {

    /**
     * Name Place
     */
    private int mStringResourceId;
    /**
     * Image resource Id for the Place
     */
    private int mImageResourceId;

    /**
     *
     */
    public static final Creator<Place> CREATOR
            = new Creator<Place>() {
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        public Place[] newArray(int size) {
            return new Place[size];
        }
    };
    /**
     * Place Description
     */
    private int mPlaceDescription;

    /**
     * Create a new Place object.
     *
     * @param stringResourceId is the Place name
     * @param imageResourceId is image associated to the word in the Miwok language
     * @param placeDescription is the Place description
     *
     */
    public Place(int stringResourceId, int imageResourceId, int placeDescription) {
        this.mStringResourceId = stringResourceId;
        this.mImageResourceId = imageResourceId;
        this.mPlaceDescription = placeDescription;
    }

    public Place(Parcel in) {
        mStringResourceId = in.readInt();
        mImageResourceId = in.readInt();
        mPlaceDescription = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
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

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mStringResourceId);
        out.writeInt(mImageResourceId);
        out.writeInt(mPlaceDescription);
    }

    /**
     * Get Place description.
     */
    public int getPlaceDescription() {
        return mPlaceDescription;
    }

}