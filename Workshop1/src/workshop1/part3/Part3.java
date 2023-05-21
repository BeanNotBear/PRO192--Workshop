/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1.part3;

import java.util.Scanner;

/**
 *
 * @author nghib
 */
public class Part3 {

    /**
     * @param args the command line arguments
     */
    static int n;
    static String[] list;

    public static void main(String[] args) {
        // TODO code application logic here
        input();
        output();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        n = sc.nextInt();
        list = new String[n];
        sc.nextLine();
        System.out.println("Enter list of student:");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLine();
        }
    }

    static void output() {
        System.out.println("The list after uppering:");
        convertToUpercase();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("The list after sorting in terms of ascending:");
        sortName();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
  
    static void convertToUpercase() {
        for (int i = 0; i < list.length; i++) {
            StringBuilder sb = new StringBuilder();
            String[] words = list[i].split("\\s+");
            for (int j = 0; j < words.length; j++) {
                sb.append(words[j].substring(0, 1).toUpperCase() + words[j].substring(1).toLowerCase() + " ");
            }
            list[i] = sb.toString().substring(0, sb.toString().length() - 1);
        }
    }

    static void sortName() {
        mergeSort(list);
    }

    static void mergeSort(String[] list) {
        int length = list.length;
        if(length < 2) {
            return;
        }
        int middle = length / 2;
        String[] leftList = new String[middle];
        String[] rightList = new String[length-middle];
        int i = 0;
        int j = 0;
        for(; i < length; i++) {
            if(i < middle) {
                leftList[i] = list[i];
            }
            else {
                rightList[j++] = list[i];
            }
        }
        mergeSort(leftList);
        mergeSort(rightList);
        merge(leftList, rightList, list);
    }

    static void merge(String[] leftList, String[] rightList, String[] list) {
        int leftSize = leftList.length;
        int rightSize = rightList.length;
        int i = 0, l = 0, r = 0;
        while(l < leftSize && r < rightSize) {
            int indexOfLastSpace1 = lastSpace(leftList[l]);
            int indexOfLastSpace2 = lastSpace(rightList[r]);
            if(leftList[l].substring(indexOfLastSpace1).compareToIgnoreCase(rightList[r].substring(indexOfLastSpace2)) < 0) {
                list[i++] = leftList[l++];
            }
            else {
                list[i++] = rightList[r++];
            }
        }
        while(l < leftSize) {
            list[i++] = leftList[l++];
        }
        while(r < rightSize) {
            list[i++] = rightList[r++];
        }
    }
    
    static int lastSpace(String name) {
        int index = name.trim().lastIndexOf(" ");
        return index;
    }
    
}
