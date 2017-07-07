package com.example.lsw38.facebook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lsw38 on 2017-07-05.
 */

public class TabPageAdapter extends FragmentPagerAdapter {
    public TabPageAdapter(FragmentManager fragmentManger){
        super(fragmentManger);
    }
    @Override
    public Fragment getItem(int position){

        switch(position){
            case 0:
                return BlankFragment.newInstance();
            case 1:
                return BlankFragment2.newInstance();
            case 2:
                return BlankFragment3.newInstance();
            case 3:
                return BlankFragment4.newInstance();

            default:
                return null;

        }
    }


    @Override
    public int getCount(){

        return 4;
    }


}

