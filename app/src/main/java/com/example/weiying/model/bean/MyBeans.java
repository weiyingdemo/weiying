package com.example.weiying.model.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;

/**
 * Created by nyj on 2018/7/10.
 */
@Entity
public class MyBeans {
    @Id(autoincrement = true)
    private Long id;
    @Unique
    private String name;
    @Generated(hash = 466521072)
    public MyBeans(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 257406712)
    public MyBeans() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
