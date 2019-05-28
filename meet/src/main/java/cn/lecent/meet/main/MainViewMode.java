package cn.lecent.meet.main;

import com.bigoat.base.BaseLiveData;

import cn.lecent.meet.my.MyViewMode;

/**
 * <pre>
 *     author : ylw
 *     e-mail : bigoatsm@gmail.com
 *     time   : 19-5-28
 *     desc   :
 * </pre>
 */
public class MainViewMode extends MyViewMode {
    public BaseLiveData<String> mAddressData = new BaseLiveData<>();
    public BaseLiveData<String> mPortData = new BaseLiveData<>();
    public BaseLiveData<String> mRegisterCodeData = new BaseLiveData<>();

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
