package com.dp.structural.adapter;

public class FileProcessor implements TextFileProcessor {
    FileProcessingAdapter fileProcessingAdapter;

    @Override
    public String read(String fileName, String type) {
        if (type.equalsIgnoreCase("txt")) {
            return "Reading text file: " + fileName;
        } else if (type.equalsIgnoreCase("JSON") || type.equalsIgnoreCase("CSV")) {
            fileProcessingAdapter = new FileProcessingAdapter(type);
            return fileProcessingAdapter.read(fileName, type);
        } else {
            return "Failed the read the file: " + fileName;
        }
    }
}
