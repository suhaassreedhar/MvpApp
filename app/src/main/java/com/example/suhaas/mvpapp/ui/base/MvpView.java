package com.example.suhaas.mvpapp.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by suhaas on 12/7/17.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
