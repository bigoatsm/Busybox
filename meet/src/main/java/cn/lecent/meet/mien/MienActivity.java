package cn.lecent.meet.mien;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.databinding.MienActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class MienActivity extends MyActivity<MienActivityBinding, MienViewMode> {

    @Override
    protected int myView() {
        return R.layout.mien_activity;
    }

    @Override
    protected void myCreate(@NonNull MienActivityBinding bind, @NonNull MienViewMode vm) {

    }
}
