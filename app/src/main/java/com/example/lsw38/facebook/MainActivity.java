package com.example.lsw38.facebook;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageButton cameraBtn = (ImageButton) findViewById(R.id.camerabtn);
        cameraBtn.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){
                Toast.makeText(MainActivity.this, "카메라 기능을 시작합니다.", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton messageBtn = (ImageButton) findViewById(R.id.messagebtn);
        messageBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "메신저를 실행합니다.", Toast.LENGTH_SHORT).show();
            }
        });

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#3b589a"));
        TabPageAdapter tabPageAdapter = new TabPageAdapter(getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(tabPageAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.tab1);
        tabLayout.getTabAt(1).setIcon(R.drawable.tab2);
        tabLayout.getTabAt(2).setIcon(R.drawable.tab3);
        tabLayout.getTabAt(3).setIcon(R.drawable.tab4);



    }
}

