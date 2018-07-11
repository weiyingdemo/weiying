package com.example.weiying.presenter;

import com.example.weiying.model.bean.SpecialListBean;
import com.example.weiying.model.https.RetrofitUtils;
import com.example.weiying.view.interfaces.ISpecialListView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class SpecialListPresenter  extends BasePresenter<ISpecialListView> {

    private final RetrofitUtils instance;

    public SpecialListPresenter(){
        instance = RetrofitUtils.getInstance();
    }

    public void getSpecialListData(String catalogid){
        Observable<SpecialListBean> specialList = instance.getApi().getSpecialList(catalogid);
        specialList.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SpecialListBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SpecialListBean specialListBean) {
                        String code = specialListBean.getCode();
                        if (code.equals("200")){
                            SpecialListBean.RetBean ret = specialListBean.getRet();
                            getiBaseView().onSuccess(ret);
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

