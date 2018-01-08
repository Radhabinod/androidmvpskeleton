package com.techindustan.androidskeleton.ui.sample;

import com.techindustan.androidskeleton.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by binod on 8/1/18.
 */

public class SamplePresenter<V extends SampleView> extends BasePresenter<V> implements SampleMvpPresenter<V> {
    @Inject
    public SamplePresenter() {

    }

    @Override
    public void successMsg(String s) {
        getMvpView().showMessage(s);
    }

}
