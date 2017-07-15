package com.example.suhaas.mvpapp.ui.main.useraccount;

import android.view.View;

import com.example.suhaas.mvpapp.di.PerActivity;
import com.example.suhaas.mvpapp.ui.base.MvpPresenter;

/**
 * Created by suhaas on 15/7/17.
 */

@PerActivity
public interface NewMedicineMvpPresenter<V extends NewMedicineMvpView> extends MvpPresenter<V> {

    void onAddField(View v);

    void onDelete(View v);
}
