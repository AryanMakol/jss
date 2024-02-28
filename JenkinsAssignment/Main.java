import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args){
        ItemType itemType = new ItemType();
		Item item = new Item();
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Item Number");
		item.setNumber(scan.nextLine());
		System.out.println("Enter the Vendor Name");
		item.setVendor(scan.nextLine());
        System.out.println("Enter the Item Type Name");
        itemType.setName(scan.nextLine());
        System.out.println("Enter the Deposit Amount");
        itemType.setDeposit(Double.parseDouble(scan.nextLine()));
        System.out.println("Enter the Cost per day of the Item Type");
        itemType.setCostPerDay(Double.parseDouble(scan.nextLine()));
		item.setItemType(itemType);
        System.out.println(item);        
	}
}