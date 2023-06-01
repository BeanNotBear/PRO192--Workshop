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
public class SpecCar extends Car {

    private int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.type;
    }

    public void setData() {
        StringBuilder sb = new StringBuilder();
        sb.append("XZ");
        sb.append(getMaker());
        super.setMaker(sb.toString());
        super.setPrice(getPrice() + 20);
    }

    public int getValue() {
        if (this.type < 7) {
            return super.getPrice() + 10;
        }
        return super.getPrice() + 15;
    }

}
