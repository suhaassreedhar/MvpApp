package com.example.suhaas.mvpapp.di.module;

import android.app.Application;
import android.content.Context;

import com.example.suhaas.mvpapp.di.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by suhaas on 11/7/17.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

}
