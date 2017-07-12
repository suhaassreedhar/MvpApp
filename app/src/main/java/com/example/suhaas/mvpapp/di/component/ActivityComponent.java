package com.example.suhaas.mvpapp.di.component;

import com.example.suhaas.mvpapp.ui.main.MainActivity;
import com.example.suhaas.mvpapp.di.PerActivity;
import com.example.suhaas.mvpapp.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by suhaas on 11/7/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

}
