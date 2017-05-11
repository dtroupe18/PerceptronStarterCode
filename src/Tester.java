/**
 * Created by Dave on 5/11/17.
 */
public class Tester {
    public static void main(String[] args) {
        CsvReader data = new CsvReader("iris-training.csv");
        data.loadData();
        data.printData();
    }
}
