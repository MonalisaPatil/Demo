package Food;

public class PaneerTikka {

    String itemName;
    String spicyLevel;
    String ingredients;
    boolean availability;
    int price;
    char cuisineType;

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setSpicyLevel(String spicyLevel){
        this.spicyLevel = spicyLevel;
    }
    public void setIngredients(String ingredients){
        this.ingredients = ingredients;
    }
    public void setAvailability(boolean availability){
        this.availability = availability;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setCuisineType(char cuisineType){
        this.cuisineType = cuisineType;
    }

    public String getItemName(){
        return itemName;
    }

    public String getSpicyLevel(){
        return spicyLevel;
    }

    public String getIngredients(){
        return ingredients;
    }
    public boolean getAvailability(){
        return availability;
    }
    public int getPrice(){
        return price;
    }

    public char getCuisineType(){
        return cuisineType;
    }

    @Override
    public String toString() {
        return "PaneerTikka{" +
                "itemName='" + itemName + '\'' +
                ", spicyLevel='" + spicyLevel + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", availability=" + availability +
                ", price=" + price +
                ", cuisineType=" + cuisineType +
                '}';
    }
}
