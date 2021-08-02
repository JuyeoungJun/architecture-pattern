package com.pattern.visitor;

public class ViewVisitor extends Visitor {

    private String path = "";

    public void visit(File file) {
        System.out.println(path + "/" + file.name);
    }

    public void visit(Directory directory) {
        path = path + "/" + directory.name;
        System.out.println(path);
        for (Entry entry : directory.directory) {
            entry.accept(this);
        }
    }

}
