package com.example.suhaas.mvpapp.di.component;

import com.example.suhaas.mvpapp.di.PerService;
import com.example.suhaas.mvpapp.di.module.ServiceModule;

import dagger.Component;

/**
 * Created by suhaas on 11/7/17.
 */

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

}
