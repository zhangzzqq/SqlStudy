package com.example.admin.greendaostudy.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by admin on 2016/9/4.
 */
    @Entity
public class User2 {
    @Id(autoincrement = true)
    private Long id;
    private String name;
    private String age;
    private String sex;
    private String hoby;
    public String getHoby() {
        return this.hoby;
    }
    public void setHoby(String hoby) {
        this.hoby = hoby;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 1117953118)
    public User2(Long id, String name, String age, String sex, String hoby) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hoby = hoby;
    }
    @Generated(hash = 377798761)
    public User2() {
    }

}


