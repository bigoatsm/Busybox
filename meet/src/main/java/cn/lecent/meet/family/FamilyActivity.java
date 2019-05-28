package cn.lecent.meet.family;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.FamilyActivityBinding;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class FamilyActivity extends MyActivity<FamilyActivityBinding, FamilyViewMode> {

    @Override
    protected int myView() {
        return R.layout.family_activity;
    }

    @Override
    protected void myCreate(@NonNull FamilyActivityBinding bind, @NonNull FamilyViewMode vm) {

    }

}
