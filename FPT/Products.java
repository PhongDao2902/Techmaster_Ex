package Exercises.FPT;

public class Products {
    private String id;
    private String name;
    private String describe;
    private long price;
    private int amount;
    private int amountSale;
    private String brand;
    private Category category;

    public Products() {
    }

    public Products(String id, String name, String describe, long price, int amount, int amountSale, String brand,
            Category category) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.price = price;
        this.amount = amount;
        this.amountSale = amountSale;
        this.brand = brand;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + describe + " - " + price 
        + " - " + amount + " - " + amountSale + " - " + brand + " - " 
        + category.getValue();
    }
    


    
    
}
