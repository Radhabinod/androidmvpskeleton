package com.techindustan.androidskeleton.ui.base;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.techindustan.androidskeleton.MyApp;
import com.techindustan.androidskeleton.di.component.ActivityComponent;
import com.techindustan.androidskeleton.di.component.DaggerActivityComponent;
import com.techindustan.androidskeleton.di.module.ActivityModule;
import com.techindustan.androidskeleton.utils.views.DialogUtils;

import butterknife.internal.Utils;

public class BaseActivity extends AppCompatActivity implements MvpView {

    ActivityComponent activityComponent;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public ActivityComponent getActivityComponent() {
        if (activityComponent == null)
            activityComponent = DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).appComponent(((MyApp) getApplication()).getAppComponent()).build();
        return activityComponent;
    }

    @Override
    public void showProgress() {
        progressDialog = DialogUtils.showLoadingDialog(this);
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        if (progressDialog != null) {
            progressDialog.hide();
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void requestPermissionsSafely(String[] permissions, int requestCode) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions, requestCode);
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    public boolean hasPermission(String permission) {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M ||
                checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    }

    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
