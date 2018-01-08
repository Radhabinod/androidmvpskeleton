package com.techindustan.androidskeleton.ui.second;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.techindustan.androidskeleton.R;
import com.techindustan.androidskeleton.ui.base.BaseActivity;
import com.techindustan.androidskeleton.utils.GlideImageDowload;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends BaseActivity implements SecondView {
    @Inject
    SecondPresenter<SecondView> secondPresenter;
    @BindView(R.id.image)
    ImageView imageView;
    @Inject
    GlideImageDowload glideImageDowload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        secondPresenter.attachView(this);

        //showProgressD();
        //Glide.with(this).load("https://techindustan.in/pms/files/profile_images//_file59ef28ed2859e-avatar.png").into(imageView);

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        glideImageDowload.downloadImage( "https://techindustan.in/pms/files/profile_images//_file59ef28ed2859e-avatar.png",imageView);
    }
}
