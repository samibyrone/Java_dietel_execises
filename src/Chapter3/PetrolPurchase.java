package Chapter3;

public class PetrolPurchase {

    private String location;
    private String petrolType;
    private int Quantity;
    private double price;
    private double priceDiscount;

    public PetrolPurchase(String location, String petrolType, int quantity, double price, double priceDiscount) {
        setLocation(location);
        setPetrolType(petrolType);
        setQuantity(quantity);
        setPrice(price);
        setPriceDiscount(priceDiscount);
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public String getLocation() {
        return location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public int getQuantity() {
        return Quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceDiscount() {
        return priceDiscount;
    }

    public double getPurchasePrice() {
        double petrolCost = Quantity * price;
        double petrolDiscount = petrolCost * (priceDiscount / 100);
        return petrolCost - petrolDiscount;
    }
}
