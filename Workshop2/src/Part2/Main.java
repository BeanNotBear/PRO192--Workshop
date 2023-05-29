/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2;

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
        Car c = new Car();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        
        System.out.println("----------------------------------------------------------");
        
        Car c2 = new Car("red", -100, true, true);
        c2.pressAcceleratorButton();
        c2.setColor("");
        System.out.println("Color of c2:" + c2.getColor());
        c2.output();
    }

}
