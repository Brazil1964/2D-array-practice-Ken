import java.util.ArrayList;
import java.util.HashMap;
public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int counter = 0;
        for (int[]arr : mat){
            for (int i : arr){
                if (i % 2 == 1) counter++;
            }
        }
        return counter;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
       int max_int = Integer.MIN_VALUE;
       for (int [] arr : mat){
           for (int i : arr){
               max_int = Math.max(max_int, i);
           }
       }
       return max_int;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        int [][] new_mat = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                new_mat[i][j] = mat[i][(j+1) % mat[0].length];
            }
        }
        return new_mat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int [][] two_arr = new int[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++){
            for (int j = 0; j < arraySize; j++){
                two_arr[i][j] = i+j;
            }
        }
        return two_arr;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double current_sum = 0;
        for (double [] arr : mat){
            for (double i : arr){
                current_sum += i;
            }
        }
        return current_sum/(mat.length * mat[0].length);
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        ArrayList<Double>temp_arr = new ArrayList<Double>();
        for (double [] arr : mat){
            for (double i : arr){
                temp_arr.add(i);
            }
        }
        if (temp_arr.size() % 2 == 0){
            return (temp_arr.get(temp_arr.size()/2) + temp_arr.get(temp_arr.size()/2 - 1))/2;
        }
        else{
            return temp_arr.get(temp_arr.size()/2);
        }
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!

    public static double mode(double[][] mat) {
        HashMap<Double, Integer>temp_map = new HashMap<Double, Integer>();
        for (double [] arr : mat){
            for (double i : arr){
                if (temp_map.containsKey(i)){
                    temp_map.put(i, temp_map.get(i) + 1);
                }
                else{
                    temp_map.put(i, 1);
                }
            }
        }
        double max_key = 0;
        int max_val = 0;
        for (double key : temp_map.keySet()){
            if (temp_map.get(key) > max_val){
                max_val = temp_map.get(key);
                max_key = key;
            }
        }
        return max_key;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
