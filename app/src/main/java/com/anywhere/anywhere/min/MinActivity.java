package com.anywhere.anywhere.min;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import com.anywhere.anywhere.R;
import com.anywhere.anywhere.insang.src.adapter.TripListAdapter;
import com.anywhere.anywhere.insang.src.fragment.SlidingDrawer;
import com.anywhere.anywhere.insang.models.dto.TripDTO;
import com.anywhere.anywhere.min.config.AnyWhere;

import java.util.ArrayList;

public class MinActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private final int MY_PERMISSION_REQUEST_STORAGE = 100;
    private SlidingDrawer mSlidingDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.min_activity);

        checkPermision(AnyWhere.PERMISSIONS);

        mSlidingDrawer= (SlidingDrawer)findViewById(R.id.main_slidingdrawer);
        mSlidingDrawer.setClosedPostionHeight(300);
        mSlidingDrawer.setPartlyPositionHeight(0);
        mSlidingDrawer.setAutoRewindHeight(0);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setIcon(getApplicationContext().getDrawable(R.drawable.icon1)));
        tabLayout.addTab(tabLayout.newTab().setIcon(getApplicationContext().getDrawable(R.drawable.icon2)));
        tabLayout.addTab(tabLayout.newTab().setIcon(getApplicationContext().getDrawable(R.drawable.icon3)));
        tabLayout.addTab(tabLayout.newTab().setIcon(getApplicationContext().getDrawable(R.drawable.icon4)));
        //tabLayout.setSelectedTabIndicatorHeight(0);
        tabLayout.setSelectedTabIndicatorColor(Color.GRAY);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                System.out.println("current: "+ tab.getPosition());
                tabLayout.getTabAt(tab.getPosition()).getIcon().setAlpha(50);

                //region slidingrawer 컨트롤

                /* 2번째 탭일때만 slidingdrawer보이도록 수정 --insang 18.08.30 */
                /* fragment에서 컨트롤하도록 변경 --insang 18.09.06 */

//                if (tab.getPosition() == 1){
//                    mSlidingDrawer.setVisibility(View.VISIBLE);
//                }
//                else{
//                    mSlidingDrawer.setVisibility(View.INVISIBLE);
//                }

                //endregion

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

    public void checkPermision(String[] permision) {

        requestPermissions(permision, MY_PERMISSION_REQUEST_STORAGE);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch (requestCode) {

            case MY_PERMISSION_REQUEST_STORAGE:

                int cnt = permissions.length;

                for (int i = 0; i < cnt; i++) {

                    if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {

                    } else {

                    }

                }

                break;

        }

    }


    public void setViewPager(){
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setBackgroundColor(getResources().getColor(R.color.colorBack));
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),this));
        viewPager.setCurrentItem(0);
        tabLayout.getTabAt(0).getIcon().setAlpha(50);
        viewPager.getAdapter().notifyDataSetChanged();
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.setFocusable(false);

    }
    @Override
    public void onClick(View view) {

    }

    /* fragment에서 slidingdrawer 컨트롤을 위해 객체를 넘기는 메소드 작성 --insang 18.09.06 */
    public SlidingDrawer getDrawer(){
        return mSlidingDrawer;
    }

    private void getTrip(){
        ArrayList<TripDTO> tripList= new ArrayList<>();

        for (int i=0; i<10; i++){
            TripDTO item= new TripDTO(i+1, "trip"+ (i+1));
            tripList.add(item);
        }

        TripListAdapter adapter= new TripListAdapter(this, R.layout.insang_trip_list, tripList);

        ListFragment tripFrag= (ListFragment) getSupportFragmentManager().findFragmentById(R.id.viewpager);
        tripFrag.setListAdapter(adapter);
    }


}