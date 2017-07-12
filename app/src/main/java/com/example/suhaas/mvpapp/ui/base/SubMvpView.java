package com.example.suhaas.mvpapp.ui.base;

/**
 * Created by suhaas on 12/7/17.
 */

public interface SubMvpView extends MvpView{

    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void attachParentMvpView(MvpView mvpView);
}
