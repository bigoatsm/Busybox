package com.bigoat.base;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * <pre>
 *     author : ylw
 *     e-mail : bigoatsm@gmail.com
 *     time   : 18-11-19
 *     desc   : 基础ViewModel进行逻辑处理
 * </pre>
 */
public class BaseViewModel extends ViewModel implements Base {
    private boolean isCreate = false;

    String tag;

    BaseLiveData<Integer> toastData = new BaseLiveData<>();
    String toastMsg;

    BaseLiveData<Boolean> progressData = new BaseLiveData<>();
    String progressMsg;


    /**
     * 监听Activity 和 Fragment 生命周期
     */
    public void create() {
        if (!isCreate) {
            onCreate();
            isCreate = true;
        }
    }

    public void onCreate() {}

    public void onStart() {}

    public void onResume() {}

    public void onPause() {}

    public void onStop() {}

    public void onDestroy() {}
}
