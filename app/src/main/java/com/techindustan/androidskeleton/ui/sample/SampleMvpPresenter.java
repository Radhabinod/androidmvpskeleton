package com.techindustan.androidskeleton.ui.sample;

import com.techindustan.androidskeleton.ui.base.MvpPresenter;

/**
 * Created by binod on 8/1/18.
 */

public interface SampleMvpPresenter<V extends SampleView> extends MvpPresenter<V> {
    void successMsg(String s);
}
