/**
 * Created by Dave on 5/11/17.
 */
public class Tester {
    public static void main(String[] args) {
        CsvReader trainingData = new CsvReader("iris-training.csv");
        trainingData.loadData();
        trainingData.printData();

        System.out.println("\n___________________________________________________");
        CsvReader testingData = new CsvReader("iris-testing.csv");
        testingData.loadData();
        testingData.printData();
    }
}
