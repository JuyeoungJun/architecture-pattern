package com.pattern.executor;

import com.pattern.visitor.Directory;
import com.pattern.visitor.File;
import com.pattern.visitor.ViewVisitor;

public class VisitorExecutor implements Executor{

    @Override
    public void execute() {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory test = new Directory("test");

        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");

        root.add(file1);
        bin.add(file2);
        bin.add(file3);
        test.add(file4);
        root.add(test);
        root.add(bin);

        root.accept(new ViewVisitor());
    }
}
