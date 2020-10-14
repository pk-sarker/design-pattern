package com.dp.structural.adapter;

public class JSONFileProcessor implements OtherFileProcessor {

    public String readJSONFile(String fileName) {
        return "Reading JSON file: " + fileName;
    }

    public String readCSVFile(String fileName) {
        return null;
    }
}
