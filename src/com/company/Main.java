package com.company;

import com.company.executor.DecoratorExecutor;
import com.company.executor.Executor;
import com.company.executor.MementoExecutor;
import com.company.executor.ObserverExecutor;
import com.company.executor.VisitorExecutor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        String pattern = args[0];

        Executor executor = null;

        if (pattern.equals("decorator")) {
            executor = new DecoratorExecutor();
        } else if (pattern.equals("memento")) {
            executor = new MementoExecutor();
        } else if (pattern.equals("observer")) {
            executor = new ObserverExecutor();
        } else if (pattern.equals("visitor")) {
            executor = new VisitorExecutor();
        }

        executor.execute();

    }
}
