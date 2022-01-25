package com.shia.practice127;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity /*implements MainContract.View*/{

    //private static final String TAG = "MainActivity";
    //private MainContract.Presenter mainPresenter = new MainPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mainPresenter.onAttach(this);
    }

    /*public void showUsers(List<User> users) {
        Log.i(TAG, "showUsers: ");
    }*/

    /*@Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.onDetach();
    }

    @Override
    public void showUsers(List<User> users) {
        Log.i(TAG, "showUsers: ");
    }*/
}