package cn.lecent.meet.home;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class HomeActivity extends MyActivity<HomeActivityBinding, HomeViewMode> {

    @Override
    protected int myView() {
        return R.layout.home_activity;
    }

    @Override
    protected void myCreate(@NonNull HomeActivityBinding bind, @NonNull HomeViewMode vm) {

    }

}
