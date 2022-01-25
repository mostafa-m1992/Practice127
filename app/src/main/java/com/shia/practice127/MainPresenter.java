package com.shia.practice127;

public class MainPresenter implements MainContract.Presenter{

    //private MainActivity mainActivity;

    private MainContract.View view;

    @Override
    public void onAttach(MainContract.View view) {
        this.view = view;
        this.view.showUsers(ModelLayerExample.getUsers());
    }

    @Override
    public void onDetach() {
        this.view = null;
    }

    /*public void onAttach(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        mainActivity.showUsers(ModelLayerExample.getUsers());
    }

    public void onDetach(){
        this.mainActivity = null;
    }*/
}
