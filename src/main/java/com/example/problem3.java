package com.example;
import java.util.Random;
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int row = input.nextInt();
        System.out.println("enter the number of columns");
        int columns = input.nextInt();

        Random rdm = new Random();
        int[][] array2d = new int[row][columns];

        for(int r = 0; r < array2d.length; r++){
            for(int c = 0; c < array2d[r].length; c++){
                array2d[r][c] = rdm.nextInt(80) + 10;
            }
        }

        print(array2d);

        int[] sumColumn = cSum(array2d);
        System.out.println("the sum of each column ");
        for(int sum : sumColumn) {
            System.out.print(sum + "  ");
        }
    }//end main

    public static void print(int[][] a){
        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[r].length; c++){
                System.out.print(a[r][c] + "  ");
            }
            System.out.println();
        }
    }

    public static int[] cSum(int[][] a){
        int rows = a.length;
        int columns = a[0].length;
        int[] sum = new int[columns];
        for(int c = 0; c < columns; c++){
            for(int r = 0; r< rows; r++){
                sum[c] += a[r][c];
            }
        }
        return sum;
    }
}
