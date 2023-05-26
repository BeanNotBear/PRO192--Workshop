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
public class Part1_1 {

    /**
     * @return 
     * @throws java.lang.Exception 
     *
     */
    
    public String inputString() throws Exception {
        String pattern = "^SE\\d{3}$";
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string:");
        s = sc.nextLine();
        if(!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Part1_1 obj = new Part1_1();
        boolean cont = false;
        do {            
            try {
                String s = obj.inputString();
                System.out.println("the string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }
    
}
