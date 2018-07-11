package com.example.weiying.presenter;

import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.model.https.RetrofitUtils;
import com.example.weiying.view.interfaces.ISelectedView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by nyj on 2018/7/9.
 */
public class SelectedPresenter extends BasePresenter<ISelectedView> {

    private final RetrofitUtils instance;

    public SelectedPresenter() {
        instance = RetrofitUtils.getInstance();
    }

    //加载数据
    public void loadDataSelected() {
        final Observable<SelectedBeans> selected = instance.getApi().getSelected();
        selected.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SelectedBeans>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SelectedBeans selectedBeans) {
                        getiBaseView().onSuccess(selectedBeans);
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
