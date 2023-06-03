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
public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void outputStatue() {
        super.output();
        System.out.println("Weight: " + this.weight);
        System.out.println("Colour: " + this.colour);
    }

    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        super.input();
        while (true) {
            try {
                System.out.print("Enter the weight: ");
                this.weight = Integer.parseInt(sc.nextLine());
                while(this.weight < 0) {
                    System.out.println("Weight can not be a negative number, pls enter again:");
                    this.weight = Integer.parseInt(sc.nextLine());
                }
                System.out.print("Enter the colour: ");
                this.colour = sc.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect datatype, pls enter again:");
            }
        }
    }
}
