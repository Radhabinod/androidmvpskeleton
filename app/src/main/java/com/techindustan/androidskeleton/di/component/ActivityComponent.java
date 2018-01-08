package com.techindustan.androidskeleton.di.component;

import com.techindustan.androidskeleton.di.annotation.ActivityContext;
import com.techindustan.androidskeleton.di.annotation.PerActivity;
import com.techindustan.androidskeleton.di.module.ActivityModule;
import com.techindustan.androidskeleton.di.module.AppModule;
import com.techindustan.androidskeleton.ui.sample.SampleActivity;
import com.techindustan.androidskeleton.ui.second.SecondActivity;
import com.techindustan.androidskeleton.utils.GlideImageDowload;


import dagger.Component;

/**
 * Created by binod on 8/1/18.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(SampleActivity activity);
    void inject(SecondActivity activity);


}
