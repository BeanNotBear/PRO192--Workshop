package workshop1.part2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nghib
 */
public class Part2 {

    static float num1 = 0;
    static float num2 = 0;
    static String op = "";

    public static void main(String[] args) {
        input();
        output();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number 1:");
        num1 = sc.nextFloat();
        System.out.println("Input the number 2:");
        num2 = sc.nextFloat();
        System.out.println("Input the operator(+-*/):");
        sc.nextLine();
        op = sc.nextLine();
    }

    static void output() {
        if (op.equals("+")) {
            System.out.println("The result of: " + num1 + " " + op + " " + num2 + " = " + (num1 + num2));
        } else if (op.equals("-")) {
            System.out.println("The result of: " + num1 + " " + op + " " + num2 + " = " + (num1 - num2));
        } else if (op.equals("*")) {
            System.out.println("The result of: " + num1 + " " + op + " " + num2 + " = " + (num1 * num2));
        } else if (op.equals("/")) {
            if (num2 != 0) {
                System.out.println("The result of: " + num1 + " " + op + " " + num2 + " = " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by 0");
            }
        }
        else {
            System.out.println("The operator is invaild");
        }
    }

    static float sum() {
        return num1 + num2;
    }

    static float subtract() {
        return num1 - num2;
    }

    static float multiple() {
        return num1 * num2;
    }

    static float divide() {
        return (float) num1 / num2;
    }
}
