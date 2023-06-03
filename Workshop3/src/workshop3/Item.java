/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

import java.util.Scanner;

/**
 *
 * @author nghib
 */
public class Item {

    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void output() {
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter value: ");
                this.value = Integer.parseInt(sc.nextLine());
                while (this.value < 0) {
                    System.out.println("Value can not be a negative number, pls enter again:");
                    System.out.print("Enter value: ");
                    this.value = Integer.parseInt(sc.nextLine());
                }
                System.out.print("Enter creator: ");
                this.creator = sc.nextLine();
                while (this.creator.trim().isEmpty()) {
                    System.out.println("Creator can not be a null, pls enter again:");
                    System.out.print("Enter creator: ");
                    this.creator = sc.nextLine();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect datatype, pls enter again:");
            }
        }
    }
}
