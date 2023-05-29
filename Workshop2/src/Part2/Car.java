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
public class Car {

    private String color;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car() {
    }

    public Car(String color, int enginePower, boolean convertible, boolean parkingBrake) {
        this.color = color;
        if(enginePower > 0) {
            this.enginePower = enginePower;
        }
        else {
            System.out.println("Invalid");
            this.enginePower = 0;
        }
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColor() {
        return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public void setColor(String color) {
        String regex = "^\\w+$";
        if(!color.matches(regex)) {
            this.color = "No color";
        }
        else {
            this.color = color;
        }
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        if (enginePower > 0) {
            this.enginePower = enginePower;
        }
        else {
            this.enginePower = 0;
        }
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        try {
            String tmp = this.color.substring(0, 1).toUpperCase() + this.color.substring(1).toLowerCase();
            System.out.println("Color: " + tmp);
        } catch (NullPointerException strE){
            System.out.println(this.color);
        }finally {
            if(this.enginePower > 0) {
                System.out.println("Engine Power: " + this.enginePower);
            }
            else {
                System.out.println("Engine Power: 0");
            }
            System.out.println("Convertible: " + this.convertible);
            System.out.println("Parking Brake: " + this.parkingBrake);
        }
    }

}
