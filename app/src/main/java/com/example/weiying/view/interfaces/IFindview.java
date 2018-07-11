package com.example.weiying.view.interfaces;

import com.example.weiying.model.bean.FindBean;

import java.util.List;

public interface IFindview extends IBaseView {
    void onFindSussecc(List<FindBean.RetBean.ListBean> list);
}
