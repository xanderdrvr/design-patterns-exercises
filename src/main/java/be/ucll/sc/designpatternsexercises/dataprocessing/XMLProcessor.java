package be.ucll.sc.designpatternsexercises.dataprocessing;

import java.util.ArrayList;
import java.util.List;

public class XMLProcessor extends DataProcessor {

    private List<String> xmlData;

    public XMLProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.xmlData = new ArrayList<>();
    }

    @Override
    protected void load() {
        System.out.println("Loading XML ...");
        xmlData.add("<user>john</user>");
        xmlData.add("<user>alice</user>");
    }

    @Override
    protected void transform() {
        System.out.println("Transforming XML...");
        xmlData.replaceAll(x -> "<record>" + x + "</record>");
    }

    @Override
    protected void validate() {
        System.out.println("Validating XML...");
        if (!xmlData.stream().allMatch(x -> x.startsWith("<record>"))) {
            System.out.println("Validation Failed: Some XML entries are incorrect.");
        }
    }

    @Override
    protected void save() {
        System.out.println("Saving XML to " + outputFile + "...");
        xmlData.forEach(System.out::println);
    }
}
