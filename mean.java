package parth;

import java.util.Scanner;

class anju {
    public static void main(String[] args) {
        int[][] arr = data(5);
        System.out.println(arithematic_mean(arr));



    }
    static void representation(int[][] data ){
        int length = data.length;
        System.out.println("Range    Frequency");
        for (int i = 0; i < length; i++) {

                System.out.print(data[i][0] + " - " + data[i][1] + "     " + data[i][2]);

            System.out.println();
        }
    }
    static int[][] data(int limit){
        Scanner input = new Scanner(System.in);
        int[][] data = new int[limit][3];
        for (int i = 0; i < limit; i++) {
            System.out.println("Enter the first bound");
            data[i][0] = input.nextInt();
            System.out.println("Enter the second bound");
            data[i][1] = input.nextInt();
            System.out.println("Enter the frequency");
            data[i][2] = input.nextInt();

        }
        representation(data);

        return data;
    }
    static int h(int[][] arr){
        return arr[0][1] - arr[0][0];
    }
    static double arithematic_mean(int[][] arr){
        int length = arr.length;
        int A = assume_mean(arr);
        int h = h(arr);
        int[] m = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            m[i] = (arr[i][0] + arr[i][1]) / 2;
        }
        int[] d = new int[length];
        for (int i = 0; i < length; i++) {
            d[i] = (m[i] - A) / h;
        }
        int[] fd = new int[length];
        for (int i = 0; i < length; i++) {
            fd[i] = (arr[i][2] * d[i]);
        }
        int net_fd = 0;
        for (int i = 0; i < length; i++) {
            net_fd += fd[i];

        }
        int net_f = 0;
        for (int i = 0; i < length; i++) {
            net_f += arr[i][2];
        }
        double sum = ((double) net_fd / net_f) * h;
        return A + sum;



    }
    static int assume_mean(int[][] arr){
        int A = 0;
        int row = arr.length / 2;
        return (arr[row][0] + arr[row][1]) / 2;
    }
