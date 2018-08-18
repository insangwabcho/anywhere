package com.anywhere.anywhere.min;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import com.anywhere.anywhere.R;
import com.anywhere.anywhere.min.PageAdapter;

public class MinActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.min_activity);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.icon1));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.icon2));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.icon3));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.icon4));
        tabLayout.setSelectedTabIndicatorHeight(0);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);



        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                tabLayout.getTabAt(tab.getPosition()).getIcon().setAlpha(50);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tabLayout.getTabAt(tab.getPosition()).getIcon().setAlpha(255);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        setViewPager();
    }

    public void setViewPager(){
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),this));
        viewPager.setCurrentItem(0);
        tabLayout.getTabAt(0).getIcon().setAlpha(50);
        viewPager.getAdapter().notifyDataSetChanged();
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
    @Override
    public void onClick(View view) {

    }
}