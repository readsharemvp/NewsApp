package com.myself.newsapp.home;

import android.os.Bundle;

import com.myself.library.controller.BaseFragment;
import com.myself.newsapp.R;

/**
 * 我的
 * Created by Jusenr on 2017/3/25.
 */

public class MeFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_me;
    }

    @Override
    public void onViewCreatedFinish(Bundle savedInstanceState) {

    }

    @Override
    protected String[] getRequestUrls() {
        return new String[0];
    }
}
