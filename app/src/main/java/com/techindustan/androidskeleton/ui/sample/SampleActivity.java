package com.techindustan.androidskeleton.ui.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.techindustan.androidskeleton.R;
import com.techindustan.androidskeleton.ui.base.BaseActivity;
import com.techindustan.androidskeleton.ui.second.SecondActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SampleActivity extends BaseActivity implements SampleView {
    @Inject
    SamplePresenter<SampleView> samplePresenter;
    @BindView(R.id.btnShowToast)
    Button btnShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        getActivityComponent().inject(this);
        ButterKnife.bind(this);
        samplePresenter.attachView(this);
    }

    @OnClick(R.id.btnShowToast)
    void click() {
        samplePresenter.successMsg("working");
        startActivity(new Intent(this, SecondActivity.class));
    }

    @Override
    public void showMessage(String msg) {
        showToast(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        samplePresenter.detachView();
    }
}
