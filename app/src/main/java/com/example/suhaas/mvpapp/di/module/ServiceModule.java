package com.example.suhaas.mvpapp.di.module;

import android.app.Service;

import dagger.Module;

/**
 * Created by suhaas on 11/7/17.
 */

@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }
}
