/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcar;

/**
 *
 * @author nghib
 */
public class Car {

    private String maker;
    private int price;

    public Car(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    public Car() {
    }

    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.maker + ", " + this.price;
    }

}
