package com.bigoat.base;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * <pre>
 *     author : ylw
 *     e-mail : bigoatsm@gmail.com
 *     time   : 18-11-15
 *     desc   : Activity基础
 * </pre>
 */
public abstract class BaseActivity<Binding extends ViewDataBinding, ViewMode extends BaseViewModel> extends AppCompatActivity {
    protected String tag;

    protected Binding bind;
    protected ViewMode vm;

    private Intent intent;
    private Bundle bundle = new Bundle();

    /**
     * 布局文件
     *
     * @return layoutId
     */
    protected abstract @LayoutRes int myView();

    /**
     * 业务操作
     *
     * @param bind Binding
     * @param vm ViewMode
     */
    protected abstract void myCreate(@NonNull Binding bind, @NonNull ViewMode vm);

    /**
     * 创建ViewMode
     *
     * @return ViewMode
     */
    private ViewMode createViewModel() {
        Type type = getClass().getGenericSuperclass();

        if (type instanceof ParameterizedType) {
            ParameterizedType paraType = (ParameterizedType) type;

            if (paraType.getActualTypeArguments().length == 2) {
                Class clazz = (Class<ViewMode>) paraType.getActualTypeArguments()[1];
                return (ViewMode) ViewModelProviders.of(this).get(clazz);
            } else {
                throw new RuntimeException("请配置正确的泛型参数, eg: MyActivity extends BaseActivity<?, ?>");
            }

        } else {
            BaseViewModel baseViewModel = ViewModelProviders.of(this).get(BaseViewModel.class);
            return (ViewMode)baseViewModel;
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tag = getClass().getSimpleName();

        bind = DataBindingUtil.setContentView(this, myView());

        vm = createViewModel();

        injectArgs(getIntent().getExtras());

        bind.setLifecycleOwner(this);

        myCreate(bind, vm);

        vm.create();
    }

    @Override
    protected void onStart() {
        super.onStart();
        vm.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        vm.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        vm.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        vm.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        vm.onDestroy();
    }

    protected BaseActivity with(@NonNull String key, @NonNull Object value) {
        if (value instanceof String) {
            bundle.putString(key, (String) value);
        } else if (value instanceof Boolean) {
            bundle.putBoolean(key, (Boolean) value);
        } else if (value instanceof Integer) {
            bundle.putInt(key, (Integer) value);
        } else if (value instanceof Float) {
            bundle.putFloat(key, (Float) value);
        } else if (value instanceof Double) {
            bundle.putDouble(key, (Double) value);
        } else {
            // TODO object
//            bundle.putString(key, .toJson(value));
        }

        return this;
    }

    protected BaseActivity startActivity(Class activity) {
        intent = new Intent(this, activity);
        return this;
    }

    protected void go() {
        if (intent == null) {
            throw new RuntimeException("请先设置跳转Activity eg：startActivity(Class activity)");
        }

        intent.putExtras(bundle);
        startActivity(intent);
    }

    protected void go(Class activity, Object... args) {
        intent = new Intent(this, activity);
        for (int i = 0; i < args.length; i++) {
            Object value = args[i];
            if (value instanceof String) {
                bundle.putString("arg"+i, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean("arg"+i, (Boolean) value);
            } else if (value instanceof Integer) {
                bundle.putInt("arg"+i, (Integer) value);
            } else if (value instanceof Float) {
                bundle.putFloat("arg"+i, (Float) value);
            } else if (value instanceof Double) {
                bundle.putDouble("arg"+i, (Double) value);
            } else {
                // TODO object
//            bundle.putString(key, .toJson(value));
            }
        }

        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void injectArgs(Bundle bundle) {
        if (bundle != null) {
            injectBundle(this, bundle);
            injectBundle(vm, bundle);
        }

    }

    private void injectBundle(Object o, Bundle bundle) {
        try {
            Field[] fields = o.getClass().getDeclaredFields();
            for (Field field : fields) {
                boolean annotationPresent = field.isAnnotationPresent(AutoArg.class);
                if (annotationPresent) {
                    field.setAccessible(true);

                    Object value = bundle.get(field.getName());

                    if (value instanceof String) {
                        String str = (String) value;
                        try {
//                            Object obj = GsonUtils.fromJson(str, field.getType());

//                            field.set(o, obj);
                        } catch (Exception e) {
                            field.set(o, str);
                        }

                    } else {
                        field.set(o, value);
                    }

                }
            }
        } catch (Exception e) {
        }
    }

}