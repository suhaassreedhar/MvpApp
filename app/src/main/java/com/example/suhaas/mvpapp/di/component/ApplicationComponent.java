package com.example.suhaas.mvpapp.di.component;

import android.app.Application;
import android.content.Context;

import com.example.suhaas.mvpapp.MvpApp;
import com.example.suhaas.mvpapp.di.ApplicationContext;
import com.example.suhaas.mvpapp.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by suhaas on 11/7/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MvpApp mvpApp);

    @ApplicationContext
    Context context();

    Application application();

}
