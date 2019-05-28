package cn.lecent.meet.laws;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.databinding.LawsActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class LawsActivity extends MyActivity<LawsActivityBinding, LawsViewMode> {

    @Override
    protected int myView() {
        return R.layout.laws_activity;
    }

    @Override
    protected void myCreate(@NonNull LawsActivityBinding bind, @NonNull LawsViewMode vm) {

    }

}
