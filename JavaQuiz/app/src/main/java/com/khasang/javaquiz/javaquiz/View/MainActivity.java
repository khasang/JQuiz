package com.khasang.javaquiz.javaquiz.View;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.khasang.javaquiz.javaquiz.Model.data.Question;
import com.khasang.javaquiz.javaquiz.Presenter.IPresenter;
import com.khasang.javaquiz.javaquiz.R;
import com.khasang.javaquiz.javaquiz.View.adapters.TabsPagerFragmentAdapter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
    IPresenter presenter;
    private Toolbar toolbar;
    private static final int LAYOUT = R.layout.activity_main;
    private static final String DB_NAME = "dbQuestions.sqlite";
    private DrawerLayout drawerLayout;
    private ViewPager viewPager;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        checkDataBase();

        initToolbar();
        initNavigationView();
        initTabs();
        initFab();
    }

    private void checkDataBase() {
        SQLiteDatabase checkDB = null;
        try {
            checkDB = SQLiteDatabase.openDatabase(getApplicationContext().getDatabasePath(DB_NAME).getPath(), null, SQLiteDatabase.OPEN_READONLY);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }

        if (checkDB != null) {
            checkDB.close();
        } else {
            try {
                copyDataBase();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void copyDataBase() throws IOException {
        Question question = new Question();
        question.save();
        InputStream myInput = getApplicationContext().getAssets().open(DB_NAME);
        OutputStream myOutput = new FileOutputStream(getApplicationContext().getDatabasePath(DB_NAME).getPath());
        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }
        myOutput.flush();
        myOutput.close();
        myInput.close();
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
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                startActivity(i);
                switch (viewPager.getCurrentItem()) {
                    case R.id.tab_themes:
                        // TODO: add item in current list
                        break;
                    case R.id.tab_quicktest:
                        // TODO: add item in current list
                        break;
                    case R.id.tab_favorits:
                        // TODO: add item in current list
                        break;
                }
            }
        });
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
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
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        TabsPagerFragmentAdapter adapter = new TabsPagerFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.view_navigation_open, R.string.view_navigation_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                drawerLayout.closeDrawers();
                switch (item.getItemId()) {
                    case R.id.tab_themes:
                        show1Tab();
                        break;
                    case R.id.tab_quicktest:
                        show2Tab();
                        break;
                    case R.id.tab_favorits:
                        show3Tab();
                        break;
                }

                return true;
            }
        });
    }

    private void show1Tab() {
        viewPager.setCurrentItem(Constants.TAB_ONE);
    }

    private void show2Tab() {
        viewPager.setCurrentItem(Constants.TAB_TWO);
    }

    private void show3Tab() {
        viewPager.setCurrentItem(Constants.TAB_THREE);
    }
}
