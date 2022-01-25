package com.shia.practice127;

import java.util.List;

public interface MainContract {

    interface View {
        void showUsers(List<User> users);
    }

    interface Presenter {
        void onAttach(View view);

        void onDetach();
    }
}
