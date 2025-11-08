package be.ucll.sc.designpatternsexercises.dataprocessing;

import java.util.ArrayList;
import java.util.List;

public class CSVProcessor extends DataProcessor{

    private List<String> data;

    public CSVProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.data = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("loading CSV...");
        data.add("line 1");
        data.add("line 2");
        data.add("line 3");
    }

    @Override
    protected void transform() {
        System.out.println("transforming CSV...");
        data.replaceAll(String::toUpperCase);
    }

    @Override
    protected void validate() {
        System.out.println("Validating CSV data...");
        if (data.isEmpty()) {
            System.out.println("Error: CSV contains no data.");
        }
    }

    @Override
    protected void save() {
        System.out.println("saving CSV...");
        data.forEach(System.out::println);
    }

}