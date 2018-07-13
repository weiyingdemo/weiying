package com.example.weiying.presenter;

import com.example.weiying.model.bean.CommentBean;
import com.example.weiying.model.https.RetrofitUtils;
import com.example.weiying.view.interfaces.ICommentview;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.http.Field;

public class CommentPresenter extends BasePresenter<ICommentview> {
    private final RetrofitUtils instance;

    public CommentPresenter(){
        instance = RetrofitUtils.getInstance();
    }

    public void showcomment( String mediaId,int pnum){
        Observable<CommentBean> commentBeanObservable = instance.getApi().ShowComment(mediaId, pnum);
        commentBeanObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CommentBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(CommentBean commentBean) {
                String code = commentBean.getCode();
                if(code.equals("200")){
                    List<CommentBean.RetBean.ListBean> list = commentBean.getRet().getList();
                    getiBaseView().onCommentSuccess(list);
                }
            }

            @Override


            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
