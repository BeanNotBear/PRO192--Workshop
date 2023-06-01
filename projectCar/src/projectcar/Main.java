/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcar;

import java.util.Scanner;

/**
 *
 * @author nghib
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static String maker;
    static int price;
    static int type;
    static int choice;

    public static void main(String[] args) {
        // TODO code application logic here
        input();
        output();
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maker: ");
        maker = sc.nextLine();
        System.out.print("Enter price: ");
        price = Integer.parseInt(sc.nextLine());
        System.out.print("Enter type: ");
        type = Integer.parseInt(sc.nextLine());
        display();
        choice = Integer.parseInt(sc.nextLine());
    }

    private static void output() {
        switch (choice) {
            case 1:
                final Car c1 = new Car(maker, price);
                final Car sc1 = (Car) new SpecCar(maker, price, type);
                System.out.println(c1.toString());
                System.out.println(sc1.toString());
                break;
            case 2:
                final SpecCar sc2 = new SpecCar(maker, price, type);
                sc2.setData();
                final String m = sc2.getMaker();
                final int p = sc2.getPrice();
                System.out.println(m + ", " + p);
                break;
            case 3:
                final SpecCar sc3 = new SpecCar(maker, price, type);
                System.out.println(sc3.getValue());
                break;
        }
    }

    private static void display() {
        System.out.println("1.Test toString()");
        System.out.println("2.Test setData()");
        System.out.println("3.Test getValue()");
        System.out.print("Enter TC(1, 2, 3): ");
        System.out.println("OUTPUT:");
    }

}
