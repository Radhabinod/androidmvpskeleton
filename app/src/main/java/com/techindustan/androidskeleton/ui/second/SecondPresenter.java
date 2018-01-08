package com.techindustan.androidskeleton.ui.second;

import android.content.Context;
import android.widget.Toast;

import com.techindustan.androidskeleton.di.annotation.ActivityContext;
import com.techindustan.androidskeleton.ui.base.BasePresenter;
import com.techindustan.androidskeleton.ui.sample.SamplePresenter;

import javax.inject.Inject;

/**
 * Created by binod on 8/1/18.
 */

public class SecondPresenter<V extends SecondView> extends BasePresenter<V> implements SecondMvpPresenter<V> {
    Context context;

    @Inject
    SecondPresenter(@ActivityContext Context context) {
        this.context = context;
    }




}
