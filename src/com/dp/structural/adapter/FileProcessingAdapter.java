package com.dp.structural.adapter;

public class FileProcessingAdapter implements TextFileProcessor {

    OtherFileProcessor otherFileProcessor;

    public  FileProcessingAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("JSON")) {
            otherFileProcessor = new JSONFileProcessor();
        } else if (fileType.equalsIgnoreCase("CSV")) {
            otherFileProcessor = new CSVFIleProcessor();
        }
    }
    public String read(String fileName, String type) {
        if (type.equalsIgnoreCase("JSON")) {
            return otherFileProcessor.readJSONFile(fileName);
        } else if (type.equalsIgnoreCase("CSV")) {
            return otherFileProcessor.readCSVFile(fileName);
        }
        return "";
    }
}
