package cn.lecent.meet.shop;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.HomeActivityBinding;
import cn.lecent.meet.databinding.ShopActivityBinding;
import cn.lecent.meet.home.HomeViewMode;
import cn.lecent.meet.my.MyActivity;

public class ShopActivity extends MyActivity<ShopActivityBinding, ShopViewMode> {

    @Override
    protected int myView() {
        return R.layout.shop_activity;
    }

    @Override
    protected void myCreate(@NonNull ShopActivityBinding bind, @NonNull ShopViewMode vm) {

    }

}
