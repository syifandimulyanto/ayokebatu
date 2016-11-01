package com.syifandimulyanto.ayokebatu.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.github.florent37.materialviewpager.MaterialViewPager;
import com.syifandimulyanto.ayokebatu.R;

import butterknife.ButterKnife;

/**
 * Created by Fandi on 10/29/2016.
 */

public class ScrollActivity extends AppCompatActivity {

    private MaterialViewPager mViewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.scroll);

        mViewPager = (MaterialViewPager) findViewById(R.id.materialViewPager);

        ButterKnife.bind(this);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}

