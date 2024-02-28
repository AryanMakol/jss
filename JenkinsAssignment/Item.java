public class Item {
	private String number;
    private ItemType itemType;
    private String vendor;
    
    public void setNumber(String number){
        this.number = number;
    }
    public void setVendor(String vendor){
        this.vendor = vendor;
    }
    public void setItemType(ItemType itemType){
        this.itemType = itemType;
    }
    public String getNumber(){
        return this.number;
    }
    public String getVendor(){
        return this.vendor;
    }
    public ItemType getItemType(){
        return this.itemType;
    }
    
    public String toString() {
		return "Item Details\nItem Number: "+this.getNumber()+"\nVendor: "+this.getVendor()+"\nItemType: \n"+this.getItemType();
    }
}