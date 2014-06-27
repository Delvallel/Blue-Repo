/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win 7
 */
public class Bundle {
    private int unit;
    private int measurement;
    private int packSellPrice;

    public int getMeasurement() {
        return measurement;
    }

    public int getPackSellPrice() {
        return packSellPrice;
    }

    public void setMeasurement(int measurement) {
        this.measurement = measurement;
    }

    public void setPackSellPrice(int packSellPrice) {
        this.packSellPrice = packSellPrice;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    
}
