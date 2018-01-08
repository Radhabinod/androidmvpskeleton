package com.techindustan.androidskeleton.di.component;

import android.content.Context;

import com.techindustan.androidskeleton.MyApp;
import com.techindustan.androidskeleton.di.annotation.ApplicationContext;
import com.techindustan.androidskeleton.di.module.AppModule;
import com.techindustan.androidskeleton.utils.GlideImageDowload;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by binod on 8/1/18.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MyApp app);

    @ApplicationContext
    Context context();

    GlideImageDowload download();



}
