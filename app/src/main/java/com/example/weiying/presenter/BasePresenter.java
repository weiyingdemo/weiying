package com.example.weiying.presenter;

import com.example.weiying.view.interfaces.IBaseView;

/**
 * Created by nyj on 2018/7/5.
 */
public class BasePresenter<V extends IBaseView> {

    //关联view
    private V iBaseView;

    public void attachView(V iBaseView) {
        this.iBaseView = iBaseView;
    }

    public V getiBaseView() {
        return iBaseView;
    }

    //取消关联
    public void deachView(V iBaseView) {
        this.iBaseView = null;
    }
}
