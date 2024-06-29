package Grocery;
import food.vegetables;
import food.fruits;
import java.util.Date;

public class Grocery {
    private vegetables vegetable;
    private fruits fruit;
    private Date expirationDate;

    // Constructor
    public Grocery(vegetables veg, fruits frt, Date expDate) {
        this.vegetable = veg;
        this.fruit = frt;
        this.expirationDate = expDate;
    }

    // Getter methods
    public vegetables getVegetable() {
        return vegetable;
    }

    public fruits getFruit() {
        return fruit;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    // Setter methods
    public void setVegetable(vegetables vegetable) {
        this.vegetable = vegetable;
    }

    public void setFruit(fruits fruit) {
        this.fruit = fruit;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
