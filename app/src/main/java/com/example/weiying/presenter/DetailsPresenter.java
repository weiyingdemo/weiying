package com.example.weiying.presenter;

import com.example.weiying.model.bean.DetailsBean;
import com.example.weiying.model.https.RetrofitUtils;
import com.example.weiying.view.interfaces.IDetailsview;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class DetailsPresenter extends BasePresenter<IDetailsview> {
    private final RetrofitUtils instance;

    public DetailsPresenter(){
        instance = RetrofitUtils.getInstance();
    }

    public void detailsShow(String mediaId){
        Observable<DetailsBean> detailsBeanObservable = instance.getApi().showDetail(mediaId);
        detailsBeanObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DetailsBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(DetailsBean detailsBean) {
                        if(detailsBean.getCode().equals("200")){
                            DetailsBean.RetBean ret = detailsBean.getRet();
                            getiBaseView().onDetailsSuccess(ret);
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
