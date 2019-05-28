package cn.lecent.meet.remit;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.databinding.RemitActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class RemitActivity extends MyActivity<RemitActivityBinding, RemitViewMode> {

    @Override
    protected int myView() {
        return R.layout.remit_activity;
    }

    @Override
    protected void myCreate(@NonNull RemitActivityBinding bind, @NonNull RemitViewMode vm) {

    }

}
