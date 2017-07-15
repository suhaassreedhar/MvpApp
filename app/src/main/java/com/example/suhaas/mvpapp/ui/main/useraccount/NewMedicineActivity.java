package com.example.suhaas.mvpapp.ui.main.useraccount;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.example.suhaas.mvpapp.R;
import com.example.suhaas.mvpapp.ui.base.BaseActivity;

import javax.inject.Inject;

public class NewMedicineActivity extends BaseActivity implements NewMedicineMvpView {

    private LinearLayout parentLinearLayout;

    @Inject
    NewMedicinePresenter<NewMedicineMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_medicine);

        getActivityComponent().inject(this);

        parentLinearLayout = (LinearLayout) findViewById(R.id.parent_linear_layout);
    }

    @Override
    protected void setUp() {

    }

    public void onAddField(View v) {
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.field, null);
        // Add the new row before the add field button.
//        parentLinearLayout.addView(rowView, parentLinearLayout.getChildCount() - 1);
        mPresenter.onAddField(rowView);
    }

    public void onDelete(View v) {
        parentLinearLayout.removeView((View) v.getParent());
    }
}
