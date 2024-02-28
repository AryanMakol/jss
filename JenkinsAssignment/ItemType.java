public class ItemType {
	private String name;
    private double deposit;
    private double costPerDay;
    
    public void setName(String name){
        this.name = name;
    }
    public void setDeposit(double deposit){
        this.deposit = deposit;
    }
    public void setCostPerDay(double costPerDay){
        this.costPerDay = costPerDay;
    }
    public String getName(){
        return this.name;
    }
    public double getDeposit(){
        return this.deposit;
    }
    public double getCostPerDay(){
        return this.costPerDay;
    }
    
    public String toString() {
		return "Item Name: "+this.getName()+"\nDeposit Amount: "+this.getDeposit()+"\nCost Per Day: "+this.getCostPerDay();
    }
}