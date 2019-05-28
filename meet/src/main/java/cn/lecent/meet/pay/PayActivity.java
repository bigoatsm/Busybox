package cn.lecent.meet.pay;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.databinding.PayActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class PayActivity extends MyActivity<PayActivityBinding, PayViewMode> {

    @Override
    protected int myView() {
        return R.layout.pay_activity;
    }

    @Override
    protected void myCreate(@NonNull PayActivityBinding bind, @NonNull PayViewMode vm) {

    }

}
