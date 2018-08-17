package com.anywhere.anywhere.min;

import android.app.Activity;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.anywhere.anywhere.MainActivity;
import com.anywhere.anywhere.min.ui.FirstFragment;
import com.anywhere.anywhere.min.ui.FourthFragment;
import com.anywhere.anywhere.min.ui.SecondFragment;
import com.anywhere.anywhere.min.ui.ThirdFragment;

/**
 * Created by ken13 on 2018-08-17.
 */
public class PageAdapter extends FragmentStatePagerAdapter
{
    private Activity Activity;
    public PageAdapter(android.support.v4.app.FragmentManager fm, Activity activity)
    {
        super(fm);
        this.Activity = activity;

    }
    @Override
    public android.support.v4.app.Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new FourthFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 4;
    }
}