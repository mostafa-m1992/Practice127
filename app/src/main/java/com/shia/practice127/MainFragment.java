package com.shia.practice127;

import android.util.Log;

import androidx.fragment.app.Fragment;

import java.util.List;

public class MainFragment extends Fragment implements MainContract.View {

    private static final String TAG = "MainFragment";
    private MainContract.Presenter presenter = new MainPresenter();

    @Override
    public void onStart() {
        super.onStart();
        presenter.onAttach(this);
    }

    @Override
    public void showUsers(List<User> users) {
        Log.i(TAG, "showUsers: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.onDetach();
    }
}
