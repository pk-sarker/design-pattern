package com.dp.structural.adapter;

public class AdapterMain {

    public static void main(String args[]) {
        FileProcessor fp = new FileProcessor();
        System.out.println(fp.read("test.txt", "txt"));
        System.out.println(fp.read("data.json", "JSON"));
        System.out.println(fp.read("data.csv", "CSV"));
    }
}
