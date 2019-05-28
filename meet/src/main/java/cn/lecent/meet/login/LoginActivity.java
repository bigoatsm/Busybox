package cn.lecent.meet.login;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.databinding.LoginActivityBinding;
import cn.lecent.meet.my.MyActivity;

public class LoginActivity extends MyActivity<LoginActivityBinding, LoginViewMode> {

    @Override
    protected int myView() {
        return R.layout.login_activity;
    }

    @Override
    protected void myCreate(@NonNull LoginActivityBinding bind, @NonNull LoginViewMode vm) {

    }

}
