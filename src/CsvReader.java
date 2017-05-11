/**
 * Created by Dave on 5/11/17.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

    private String filePath;
    private double[][] data;

    CsvReader(String filePath) {
        this.filePath = filePath;
    }

    private int[] getNumberOfRowsAndColumns() {

        int[] returnValues = new int[2];
        int numberOfRows = 0;
        int numberOfColumns = 0;
        String line;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((line = bufferedReader.readLine()) != null) {
                numberOfRows++;
                String[] rowOfData = line.split(",");
                numberOfColumns = rowOfData.length;
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getLocalizedMessage());
        }

        returnValues[0] = numberOfRows;
        returnValues[1] = numberOfColumns;

        return returnValues;
    }

    private double[] convertStringArrayToDoubleArray(String[] a) {
        double[] d = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            double currentValue = Double.parseDouble(a[i]);
            d[i] = currentValue;
        }
        return d;
    }

    private void addRowToData(double[] d, int rowNumber) {
        for (int i = 0; i < d.length; i++) {
            data[rowNumber][i] = d[i];
        }
    }

    public void loadData() {
        int[] rowsAndColumns = getNumberOfRowsAndColumns();
        int numberOfRows = rowsAndColumns[0];
        int numberOfColumns = rowsAndColumns[1];
        String line;
        int currentRow = 0;

        data = new double[numberOfRows][numberOfColumns];

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            while ((line = bufferedReader.readLine()) != null) {
                String[] rowOfData = line.split(",");

                /* there are two types of flowers Iris-setosa and Iris-versicolor
                * we need to relabel them as 1 and 0 so they can be converted to a double */

                if (rowOfData[numberOfColumns - 1].equals("Iris-setosa")) {
                    rowOfData[numberOfColumns - 1] = "1";
                }
                else if (rowOfData[numberOfColumns - 1].equals("Iris-versicolor")) {
                    rowOfData[numberOfColumns - 1] = "0";
                }

                double[] rowAsDoubles = convertStringArrayToDoubleArray(rowOfData);
                addRowToData(rowAsDoubles, currentRow);
                currentRow++;
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getLocalizedMessage());
        }
    }

    public void printData() {
        for (int i = 0; i < data.length; i++) {
            System.out.println();
            System.out.print("[ ");
            for (int j = 0; j < data[0].length; j++) {
                if (j < data[0].length - 1){
                    System.out.print(data[i][j] + ", ");
                }
                else if (j == data[0].length - 1){
                    System.out.print(data[i][j] + " ]");
                }
                else {
                    System.out.println(data[i][j]);
                }
            }
        }
    }
}





