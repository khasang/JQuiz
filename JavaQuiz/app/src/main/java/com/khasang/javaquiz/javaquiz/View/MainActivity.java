package com.khasang.javaquiz.javaquiz.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.khasang.javaquiz.javaquiz.Presenter.PresenterImpl;
import com.khasang.javaquiz.javaquiz.R;

public class MainActivity extends AppCompatActivity {
    PresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void onClickFAB(){
        return;
    }
}
