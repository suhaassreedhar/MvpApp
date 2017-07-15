package com.example.suhaas.mvpapp.ui.main.useraccount;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.suhaas.mvpapp.R;
import com.example.suhaas.mvpapp.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by suhaas on 15/7/17.
 */

public class NewMedicinePresenter<V extends NewMedicineMvpView> extends BasePresenter<V>
        implements NewMedicineMvpPresenter<V>{

    private static final String TAG = "NewMedicinePresenter";
    private LinearLayout parentLinearLayout;

    public void onAddField(View v) {
        parentLinearLayout.addView((View) v.getParent(), parentLinearLayout.getChildCount() - 1);
    }

    public void onDelete(View v) {
        parentLinearLayout.removeView((View) v.getParent());
    }
}
