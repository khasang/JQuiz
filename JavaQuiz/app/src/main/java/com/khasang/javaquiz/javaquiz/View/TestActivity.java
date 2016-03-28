package com.khasang.javaquiz.javaquiz.View;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.khasang.javaquiz.javaquiz.Presenter.IPresenter;
import com.khasang.javaquiz.javaquiz.Presenter.PresenterImpl;
import com.khasang.javaquiz.javaquiz.Presenter.Tests.TypeTest;
import com.khasang.javaquiz.javaquiz.R;
import com.khasang.javaquiz.javaquiz.View.adapters.TestTabsPagerFragmentAdapter;
import com.khasang.javaquiz.javaquiz.View.fragments.QuestionFragment;
import com.khasang.javaquiz.javaquiz.View.fragments.QuickTestFragment;

import java.util.List;

public class TestActivity extends AppCompatActivity implements QuestionFragment.QuestionRequest {
    private IPresenter presenter;
    private Toolbar toolbar;
    private static final int LAYOUT = R.layout.activity_test;
    private ViewPager viewPager;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        initToolbar();
        initTabs();
        initFab();

        createTest();
    }

    private void createTest() {
        presenter = new PresenterImpl();
        presenter.createTest(TypeTest.TYPE_1);
    }

    @Override
    public List getQuestion(int questionNumber) {
        return presenter.getCurrentQuestion(questionNumber);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void initFab() {
        fab = (FloatingActionButton) findViewById(R.id.fab_test);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_test);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        toolbar.inflateMenu(R.menu.menu_main);
    }

    private void initTabs() {
        viewPager = (ViewPager) findViewById(R.id.viewpager_test);
        TestTabsPagerFragmentAdapter adapter = new TestTabsPagerFragmentAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        adapter.setPageAmount(QuickTestFragment.getQuestionCount());
        adapter.notifyDataSetChanged();

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout_test);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
}
