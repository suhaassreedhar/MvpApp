package com.example.suhaas.mvpapp.ui.base;

/**
 * Created by suhaas on 12/7/17.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);

    void onDetach();
}
