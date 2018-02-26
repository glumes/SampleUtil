package com.glumes.library;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.glumes.sampleutil.BaseToolbarActivity;

/**
 * @author glumes
 */
public class MainActivity extends BaseToolbarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void setUpToolbar(Toolbar toolbar) {
        toolbar.setTitle("Toolbar");
    }
}
