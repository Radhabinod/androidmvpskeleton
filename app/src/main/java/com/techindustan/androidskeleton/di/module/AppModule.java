package com.techindustan.androidskeleton.di.module;

import android.app.Application;
import android.content.Context;

import com.techindustan.androidskeleton.di.annotation.ApplicationContext;
import com.techindustan.androidskeleton.utils.GlideImageDowload;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by binod on 8/1/18.
 */
@Module
public class AppModule {
    Context appContext;

    public AppModule(Context context) {
        appContext = context;
    }

    @Provides
    @ApplicationContext
    Context getAppContext() {
        return appContext;
    }
    @Provides
    @Singleton
    GlideImageDowload getGlideImageDowloader(@ApplicationContext Context context)
    {
        return new GlideImageDowload(context);
    }


}
