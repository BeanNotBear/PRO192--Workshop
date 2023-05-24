/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1.part1;

import java.util.Scanner;

/**
 *
 * @author nghib
 */
public class Part1 {

    /**
     * @param args the command line arguments
     */
    static int rows;
    static int columns;
    static int[][] arr;

    public static void main(String[] args) {
        // TODO code application logic here
        input();
        output();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        rows = sc.nextInt();
        System.out.println("Enter number of column:");
        columns = sc.nextInt();
        arr = new int[rows][columns];
        System.out.println("Enter the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("m[" + i + "]" + "[" + j + "]" + "=");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void output() {
        System.out.println("Matrix inputted");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(""); 
        }
        System.out.println("Sum: " + sum());
        System.out.format("Average: %.3f", average());
        System.out.println("");
        sort();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int sum() {
        int s = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                s += arr[i][j];
            }
        }
        return s;
    }

    static double average() {
        double avg = (double) sum() / (rows * columns);
        return avg;
    }

    static void sort() {
        for(int i = 0; i < arr.length; i++) {
            mergeSort(arr[i]);
        }
    }
    
    static void mergeSort(int[] array) {
        int length = array.length;
        int middle = length / 2;
        if(length < 2) {
            return;
        }
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0; // left index;
        int j = 0; // right index;
        for(; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            }
            else {
                rightArray[j++] = array[i]; 
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0; // indices
        while(l < leftSize && r < rightSize) {
            if(leftArray[l] > rightArray[r]) {
                array[i++] = leftArray[l++];
            }
            else {
                array[i++] = rightArray[r++];
            }
        }
        while(l < leftSize) {
            array[i++] = leftArray[l++];
        }
        while(r < rightSize) {
            array[i++] = rightArray[r++];
        }
    }
    
}

    
