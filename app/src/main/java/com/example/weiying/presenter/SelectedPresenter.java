package com.example.weiying.presenter;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.model.https.RetrofitUntils;
import com.example.weiying.view.interfaces.IBaseView;
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

    private final RetrofitUntils instance;

    public SelectedPresenter() {
        instance = RetrofitUntils.getInstance();
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
