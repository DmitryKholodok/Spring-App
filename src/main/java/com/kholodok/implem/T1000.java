package com.kholodok.implem;

import com.kholodok.interf.Body;
import com.kholodok.interf.Head;
import com.kholodok.interf.Robot;
import com.sun.org.apache.xpath.internal.SourceTree;

public class T1000 implements Robot {

    private Head head;
    private Body body;

    private String color;
    private int year;
    private boolean soundCreated;

    public T1000(Head head, Body body) {
        super();
        this.head = head;
        this.body = body;
    }

    public T1000(Head head, Body body, String color, int year, boolean soundCreated) {
        super();
        this.head = head;
        this.body = body;
        this.color = color;
        this.year = year;
        this.soundCreated = soundCreated;
    }

    public T1000(String color, int year, boolean soundCreated) {
        this.color = color;
        this.year = year;
        this.soundCreated = soundCreated;
    }

    public T1000(){

    }

    public void fire() {
        head.think();
        body.move();
        System.out.println("Color - " + color);
        System.out.println("Year - " + year);
        System.out.println("SoundCreated - " + soundCreated);
    }

    public void dance() {
        System.out.println("T1000 is dancing...");
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
