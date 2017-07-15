package com.example.suhaas.mvpapp.ui.base;

/**
 * Created by suhaas on 12/7/17.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V>  {

    private static final String TAG = "BasePresenter";

    private V mMvpView;

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void onDetach() {

    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }


    public V getMvpView() {
        return mMvpView;
    }
}
