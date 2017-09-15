package com.kholodok.implem;

import com.kholodok.interf.Body;
import com.kholodok.interf.Head;
import com.kholodok.interf.Robot;

public class T1000 implements Robot {

    private Head head;
    private Body body;

    public T1000(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    public T1000(){

    }


    public void fire() {
        head.think();
        body.move();
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
