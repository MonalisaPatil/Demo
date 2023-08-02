package Food;

public class Customer {

    String itemName;
    String customerOrdered;
    String customerSelectedSpicy;
    String ingrediant;
    int price;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setCustomerOrdered(String customerOrdered) {
        this.customerOrdered = customerOrdered;
    }

    public void setCustomerSelectedSpicy(String customerSelectedSpicy) {
        this.customerSelectedSpicy = customerSelectedSpicy;
    }

    public void setIngrediant(String ingrediant) {
        this.ingrediant = ingrediant;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCustomerOrdered() {
        return customerOrdered;
    }

    public String getCustomerSelectedSpicy() {
        return customerSelectedSpicy;
    }

    public String getIngrediant() {
        return ingrediant;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "itemName='" + itemName + '\'' +
                ", customerOrdered='" + customerOrdered + '\'' +
                ", customerSelectedSpicy='" + customerSelectedSpicy + '\'' +
                ", ingrediant='" + ingrediant + '\'' +
                ", price=" + price +
                '}';
    }
}
