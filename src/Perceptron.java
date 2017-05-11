/**
 * Created by Dave on 5/11/17.
 */
public class Perceptron {

    double[] weights = new double[4]; // weights are initialized to 0
    double[][] data;
    double learningRate;
    int iterations;

    Perceptron(double learningRate, int iterations, double[][] data) {
        this.learningRate = learningRate;
        this.iterations = iterations;
        this.data = data;
    }

    /* Your Perceptron should be an object with methods to train and predict */

    public void train() {

    }

    public void predict() {

    }

    public void calculateAccuracy() {

    }

    private double dotProduct() {
        // you might want to write this method
        return  0.0;
    }


}
