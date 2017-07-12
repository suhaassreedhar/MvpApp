package com.example.suhaas.mvpapp;

import android.app.Application;
import android.content.Context;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.interceptors.HttpLoggingInterceptor;
import com.example.suhaas.mvpapp.di.component.ApplicationComponent;
import com.example.suhaas.mvpapp.di.component.DaggerApplicationComponent;
import com.example.suhaas.mvpapp.di.module.ApplicationModule;
import com.example.suhaas.mvpapp.utils.AppLogger;

import javax.inject.Inject;

/**
 * Created by suhaas on 11/7/17.
 */

public class MvpApp extends Application {

    private ApplicationComponent mApplicationComponent;

    public static MvpApp get(Context context) {
        return (MvpApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AppLogger.init();

        AndroidNetworking.initialize(getApplicationContext());
        if (BuildConfig.DEBUG) {
            AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY);
        }

    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}