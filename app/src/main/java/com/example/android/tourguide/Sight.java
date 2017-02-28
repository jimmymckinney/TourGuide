package com.example.android.tourguide;

public class Sight {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mSightName;
    private String mSightDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Sight(int imageResourceId, String sightName, String sightDescription) {
        mImageResourceId = imageResourceId;
        mSightName = sightName;
        mSightDescription = sightDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getSightName() {
        return mSightName;
    }

    public String getSightDescription() {
        return mSightDescription;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
