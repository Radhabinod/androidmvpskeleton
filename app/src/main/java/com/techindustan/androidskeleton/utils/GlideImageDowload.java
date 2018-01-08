package com.techindustan.androidskeleton.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.techindustan.androidskeleton.di.annotation.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sql.DataSource;

/**
 * Created by binod on 8/1/18.
 */
public class GlideImageDowload {
    Context context;
    @Inject
    public GlideImageDowload(@ApplicationContext Context context)
    {
        this.context=context;
    }
    public void downloadImage(String string, ImageView iv)
    {
        Glide.with(context).load(string).into(iv);
    }

}
