package com.myapp.models;

public enum CategoryEnum {

    BOX1(1,"kjkk"),
    BOX2(2,"kjkk2"),
    BOX3(3,"kjkk3");

    int id;
    String desc;

    CategoryEnum(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }
}
