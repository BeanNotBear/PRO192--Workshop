/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.Scanner;

/**
 *
 * @author nghib
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        checkGrade();
    }

    private static void checkGrade() {
        boolean cont = false;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                String s = "";
                String pattern = "^SE\\d{3}$";
                System.out.println("Enter the String:");
                s = sc.nextLine();
                if (!s.matches(pattern)) {
                    throw new Exception();
                }
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }

}
