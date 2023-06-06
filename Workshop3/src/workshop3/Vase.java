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
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void outputVase() {
        super.output();
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
    }

    public void inputVase() {
        Scanner sc = new Scanner(System.in);
        super.input();
        while (true) {
            try {
                System.out.print("Enter the height: ");
                this.height = Integer.parseInt(sc.nextLine());
                while (this.height < 0) {
                    System.out.println("Height can not be a negative number, pls enter again:");
                    System.out.print("Enter the height: ");
                    this.height = Integer.parseInt(sc.nextLine());
                }
                System.out.print("Enter the material: ");
                this.material = sc.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect datatype, pls enter again:");
            }
        }
    }
}
