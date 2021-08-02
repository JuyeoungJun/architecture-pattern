package com.pattern.visitor;

public class File extends Entry {

    public File(String name) {
        super(name);
    }

    public void add(Entry entry) { }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
