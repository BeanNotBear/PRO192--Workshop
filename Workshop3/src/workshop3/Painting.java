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
public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWaterColour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWaterColour() {
        return isWaterColour;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        super.output();
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("isWaterColour: " + this.isWaterColour);
        System.out.println("isFramed: " + this.isFramed);
    }

    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        super.input();
        while (true) {
            try {
                System.out.print("Enter height: ");
                this.height = Integer.parseInt(sc.nextLine());
                while(this.height < 0) {
                    System.out.println("Height can not be a negative number, pls enter again:");
                    this.height = Integer.parseInt(sc.nextLine());
                }
                System.out.print("Enter width: ");
                this.width = Integer.parseInt(sc.nextLine());
                while(this.width < 0) {
                    System.out.println("Width can not be a negative number, pls enter again:");
                    this.width = Integer.parseInt(sc.nextLine());
                }
                String pattern = "^(true|false|True|False)$";
                System.out.print("Is water colour? ");
                String ans = sc.nextLine();
                this.isWaterColour = Boolean.parseBoolean(ans);
                while(!ans.matches(pattern)) {
                    System.out.println("Incorrect datatype, pls enter true or false:");
                    ans = sc.nextLine();
                    this.isWaterColour = Boolean.parseBoolean(ans);
                }
                System.out.print("Is framed? ");
                ans = sc.nextLine();
                this.isFramed = Boolean.parseBoolean(ans);
                while(!ans.matches(pattern)) {
                    System.out.println("Incorrect datatype, pls enter true or false:");
                    ans = sc.nextLine();
                    this.isFramed = Boolean.parseBoolean(ans);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect datatype, pls enter again");
            }
        }
    }
}
