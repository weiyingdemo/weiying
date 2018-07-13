package com.example.weiying.presenter;

import com.example.weiying.model.bean.SearchListBeans;
import com.example.weiying.model.bean.SelectedBeans;
import com.example.weiying.model.https.RetrofitUtils;
import com.example.weiying.view.interfaces.ISearchListView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by nyj on 2018/7/12.
 */
public class SearchListPresenter extends BasePresenter<ISearchListView> {

    private final RetrofitUtils instance;

    public SearchListPresenter() {
        instance = RetrofitUtils.getInstance();
    }

    public void loadSearchListData(String name) {
        final Observable<SearchListBeans> searchList = instance.getApi().getSearchList(name, "1");
        searchList.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SearchListBeans>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(SearchListBeans searchListBeans) {
                        getiBaseView().onSuccess(searchListBeans);
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
