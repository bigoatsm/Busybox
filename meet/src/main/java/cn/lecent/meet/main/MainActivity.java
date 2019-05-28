package cn.lecent.meet.main;

import android.support.annotation.NonNull;

import cn.lecent.meet.R;
import cn.lecent.meet.databinding.MainActivityBinding;
import cn.lecent.meet.my.MyActivity;

/**
 * <pre>
 *     author : ylw
 *     e-mail : bigoatsm@gmail.com
 *     time   : 19-5-28
 *     desc   :
 * </pre>
 */
public class MainActivity extends MyActivity<MainActivityBinding, MainViewMode> {

    @Override
    protected int myView() {
        return R.layout.main_activity;
    }

    @Override
    protected void myCreate(@NonNull MainActivityBinding bind, @NonNull MainViewMode vm) {
    }

}
