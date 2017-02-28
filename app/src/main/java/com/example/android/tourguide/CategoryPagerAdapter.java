package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private int mCount;
    private Fragment mFragmentOne;
    private Fragment mFragmentTwo;
    private Fragment mFragmentThree;
    private CharSequence mPageTitleOne;
    private CharSequence mPageTitleTwo;
    private CharSequence mPageTitleThree;

    public CategoryPagerAdapter(Context context, FragmentManager fm, int count, Fragment fragmentOne, Fragment fragmentTwo, Fragment fragmentThree, CharSequence pageTitleOne, CharSequence pageTitleTwo, CharSequence pageTitleThree) {
        super(fm);
        mContext = context;
        mCount = count;
        mFragmentOne = fragmentOne;
        mFragmentTwo = fragmentTwo;
        mFragmentThree = fragmentThree;
        mPageTitleOne = pageTitleOne;
        mPageTitleTwo = pageTitleTwo;
        mPageTitleThree = pageTitleThree;
    }

    public CategoryPagerAdapter(Context context, FragmentManager fm, int count, Fragment fragmentOne, Fragment fragmentTwo, CharSequence pageTitleOne, CharSequence pageTitleTwo) {
        super(fm);
        mContext = context;
        mCount = count;
        mFragmentOne = fragmentOne;
        mFragmentTwo = fragmentTwo;
        mPageTitleOne = pageTitleOne;
        mPageTitleTwo = pageTitleTwo;
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return mFragmentOne;
            case 1:
                return mFragmentTwo;
            case 2:
                return mFragmentThree;
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mPageTitleOne;
            case 1:
                return mPageTitleTwo;
            case 2:
                return mPageTitleThree;
            default:
                return null;
        }
    }

}
