package com.dp.structural.adapter;

public class CSVFIleProcessor implements OtherFileProcessor {
    public String readJSONFile(String fileName) {
        return null;
    }

    public String readCSVFile(String fileName) {
        return "Reading CSV file: "+ fileName;
    }
}
