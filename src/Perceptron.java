/**
 * Created by Dave on 5/11/17.
 */
public class Perceptron {

    double[] weights = new double[4]; // weights are initialized to 0
    double[][] trainData;
    double[][] testData;
    double learningRate;
    int iterations;

    Perceptron(double learningRate, int iterations, double[][] trainData, double[][] testData) {
        this.learningRate = learningRate;
        this.iterations = iterations;
        this.trainData = trainData;
        this.testData = testData;
    }

    /* Your Perceptron should be an object with methods to train, predict, etc */

    public void train() {

    }

    public void predict() {

    }

    public void calculateAccuracy(int correct) {

    }

    private void decreaseWeightVector(double[] dataPoint) {

    }

    private void increaseWeightVector(double[] dataPoint) {

    }

    private double dotProduct(double[] dataPoint) {
        // you might want to write this method
        return 0;
    }


}