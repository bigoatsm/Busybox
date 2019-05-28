package com.bigoat.share.main;

import android.support.annotation.NonNull;

import com.bigoat.base.BaseActivity;
import com.bigoat.share.R;
import com.bigoat.share.databinding.MainActivityBinding;

public class MainActivity extends BaseActivity<MainActivityBinding, MainViewMode> {

    @Override
    protected int myView() {
        return R.layout.main_activity;
    }

    @Override
    protected void myCreate(@NonNull MainActivityBinding bind, @NonNull MainViewMode vm) {

    }
}
