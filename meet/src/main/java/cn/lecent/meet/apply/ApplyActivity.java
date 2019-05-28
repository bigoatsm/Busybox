package cn.lecent.meet.apply;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.ApplyActivityBinding;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class ApplyActivity extends MyActivity<ApplyActivityBinding, ApplyViewMode> {

    @Override
    protected int myView() {
        return R.layout.apply_activity;
    }

    @Override
    protected void myCreate(@NonNull ApplyActivityBinding bind, @NonNull ApplyViewMode vm) {

    }

}
