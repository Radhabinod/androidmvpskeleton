package com.techindustan.androidskeleton;

import android.app.Application;

import com.techindustan.androidskeleton.di.component.AppComponent;
import com.techindustan.androidskeleton.di.component.DaggerAppComponent;
import com.techindustan.androidskeleton.di.module.AppModule;

/**
 * Created by binod on 8/1/18.
 */

public class MyApp extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        appComponent.inject(this);

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }


}
