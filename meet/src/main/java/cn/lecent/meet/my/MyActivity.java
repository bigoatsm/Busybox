package cn.lecent.meet.my;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.bigoat.base.BaseActivity;
import com.bigoat.base.BaseViewModel;
import com.bigoat.utils.NavigationUtils;

/**
 * <pre>
 *     author : ylw
 *     e-mail : bigoatsm@gmail.com
 *     time   : 19-5-28
 *     desc   :
 * </pre>
 */
public abstract class MyActivity<Binding extends ViewDataBinding, ViewMode extends BaseViewModel> extends BaseActivity<Binding, ViewMode> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // 隐藏虚拟导航按钮
        NavigationUtils.hideVirtualKey3(this);
    }
}
