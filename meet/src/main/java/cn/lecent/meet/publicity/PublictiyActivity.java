package cn.lecent.meet.publicity;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.databinding.PublictiyActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class PublictiyActivity extends MyActivity<PublictiyActivityBinding, PublicityViewMode> {

    @Override
    protected int myView() {
        return R.layout.home_activity;
    }

    @Override
    protected void myCreate(@NonNull PublictiyActivityBinding bind, @NonNull PublicityViewMode vm) {

    }

}
