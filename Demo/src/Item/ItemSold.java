package Item;

public class ItemSold {
    String itemName;
    int itemSoldat;
    String itemDescription;
    int itemQuantitySold;

    int totalSalePrice;

    int itemProfitEarned;

    public void setItemName(String itemName){
        this.itemName=itemName;
    }

    public void setItemQuantitySold(int itemQuantitySold){
        this.itemQuantitySold=itemQuantitySold;
    }

    public void setItemDescription(String itemDescription){
        this.itemDescription = itemDescription;
    }

    public void setItemSoldat(int itemSoldat){
        this.itemSoldat = itemSoldat;
    }

    public void setItemTotalSalePrice(int totalSalePrice){
        this.totalSalePrice = totalSalePrice;
    }

    public void setItemProfitEarned(int itemProfitEarned){
            this.itemProfitEarned = itemProfitEarned;
    }
    public String getItemName(){
        return itemName;
    }

    public String getItemDescription(){
         return itemDescription;
    }
    public int getItemSoldat(){
        return itemSoldat;
    }
    public int getTotalSalePrice(){
        return totalSalePrice;
    }

    public int getItemProfitEarned(){
        return itemProfitEarned;
    }


    @Override
    public String toString() {
        return "ItemSold{" +
                "itemName='" + itemName + '\'' +
                ", itemSoldat=" + itemSoldat +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemQuantitySold=" + itemQuantitySold +
                ", totalSalePrice=" + totalSalePrice +
                ", itemProfitEarned=" + itemProfitEarned +
                '}';
    }
}


