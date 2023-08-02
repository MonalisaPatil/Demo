package Item;

public class Item {
    String itemName;
    int itemPrice;
    String itemDescription;
    boolean itemAvailability;

//    public Item(String itemName,int itemPrice,String itemDescription,boolean itemAvailability ){
//        this.itemName=itemName;
//        this.itemPrice=itemPrice;
//        this.itemDescription=itemDescription;
//        this.itemAvailability= itemAvailability;
//    }
    public void setItemName(String itemName){
        this.itemName=itemName;
    }
    public void setItemPrice(int itemPrice){
        this.itemPrice=itemPrice;
    }
    public void setItemDescription(String itemDescription){
        this.itemDescription=itemDescription;
    }
    public void setItemAvailability(boolean itemAvailability){
        this.itemAvailability=itemAvailability;
    }
    public String getItemName(){
        return itemName;
    }
    public String getItemDescription(){
        return itemDescription;
    }
    public int getItemPrice(){
        return itemPrice;
    }
    public boolean getItemAvailability(){
        return itemAvailability;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemAvailability=" + itemAvailability +
                '}';
    }
}
