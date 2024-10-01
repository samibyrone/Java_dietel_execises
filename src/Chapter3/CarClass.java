package Chapter3;

import java.util.Scanner;

public class CarClass {

    private String model;
    private String year;
    private double price;

    public CarClass(String model, String year, double price) {
        setModel(model);
        setYear(year);
        setPrice(price);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        if(price > 0) this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void priceDiscount(double percentageDiscount) {
        if(percentageDiscount > 0 && percentageDiscount <= 100)
            price -= price * (percentageDiscount / 100);
    }
}
