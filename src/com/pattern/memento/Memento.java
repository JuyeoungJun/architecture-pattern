package com.pattern.memento;

public class Memento {

    private String data1;
    private Integer data2;

    public Memento() { }

    public Memento(String data1, Integer data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public String getData1() {
        return this.data1;
    }

    public Integer getData2() {
        return this.data2;
    }

    public void setData1(String data) {
        this.data1 = data;
    }

    public void setData2(Integer data) {
        this.data2 = data;
    }


}
