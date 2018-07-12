package com.example.weiying.model.bean;

import java.util.List;

public class FirstEvent {
    //简介
    public  String description ;
    //主演
    public  String actors;
    //导演
    public  String directo;
    public List<DetailsBean.RetBean.ListBean> list;

    public FirstEvent(String description, String actors, String directo, List<DetailsBean.RetBean.ListBean> list) {
        this.description = description;
        this.actors = actors;
        this.directo = directo;
        this.list = list;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setDirecto(String directo) {
        this.directo = directo;
    }

    public void setList(List<DetailsBean.RetBean.ListBean> list) {
        this.list = list;
    }

    public String getDescription() {
        return description;
    }

    public String getActors() {
        return actors;
    }

    public String getDirecto() {
        return directo;
    }

    public List<DetailsBean.RetBean.ListBean> getList() {
        return list;
    }
}
