package com.pattern.memento;

public class Information {

    private String data1;
    private Integer data2;

    public Information(String data1, Integer data2) {

        this.data1 = data1;
        this.data2 = data2;
    }

    public Memento createMemento() {
        return new Memento(this.data1, this.data2);
    }

    public void restoreMemento(Memento memento) {
        this.data1 = memento.getData1();
        this.data2 = memento.getData2();
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
