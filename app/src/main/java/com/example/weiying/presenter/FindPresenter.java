package com.example.weiying.presenter;

import android.util.Log;

import com.example.weiying.model.bean.FindBean;
import com.example.weiying.model.https.RetrofitUtils;
import com.example.weiying.view.interfaces.IFindview;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.http.Field;

public class FindPresenter extends BasePresenter<IFindview> {
    private final RetrofitUtils instance;

    public FindPresenter(){
        instance = RetrofitUtils.getInstance();
    }

    public void showfind(String catalogId,int pnum){
        Observable<FindBean> showfind = instance.getApi().showfind(catalogId, pnum);
        showfind.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FindBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(FindBean findBean) {
                Log.e("find_next",findBean.getCode());
                if(findBean.getCode().equals("200")){
                    List<FindBean.RetBean.ListBean> list = findBean.getRet().getList();
                    Log.e("find-----",list.get(0).getTitle());
                    getiBaseView().onFindSussecc(list);
                }
            }

            @Override
            public void onError(Throwable e) {
                Log.e("find",e.toString());
            }

            @Override
            public void onComplete() {

            }
        });

    }

}
