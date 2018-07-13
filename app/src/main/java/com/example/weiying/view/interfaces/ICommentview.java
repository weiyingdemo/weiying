package com.example.weiying.view.interfaces;

import com.example.weiying.model.bean.CommentBean;

import java.util.List;

public interface ICommentview extends IBaseView {
    void onCommentSuccess(List<CommentBean.RetBean.ListBean> list);
}
