package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {

	
	//WAF:
	//name:getCompInfo
	//input param : compName(String)
	//return : name , Banglore, 1000,5.5, Tom-- Object Static array
	public Object[] getCompInfo(String compName) {
		
		System.out.println("Getting info for "+compName);
		Object info[] = new Object[5];
		
		if(compName.equals("IBM")) {
			info[0]= "IBM";
			info[1]= 1000;
			info[2]= 5.5;
			info[3]= "Banglore";
			info[4]= "Tom";
		} else if (compName.equals("MS")) {
			info[0]= "MS";
			info[1]= 2000;
			info[2]= 6.5;
			info[3]= "HYD";
			info[4]= "Peter";
		}
		else {
			System.out.println("Comp Name is not found");
		}
		return info;
	}
	
	//name :
	//input
	// return :List of products : ArrayList<Strigs>
	public ArrayList<String> getProdList(String compName) {
		
		ArrayList<String> prodList = new ArrayList<String>();
		System.out.println("Getting product list for :" + compName);
		
		switch (compName.toLowerCase()) {
		case "amazon":
			prodList.add("macbook");
			prodList.add("samsung");
			prodList.add("imac");
			break;
		case "walmart":
			prodList.add("nike");
			prodList.add("adidas");
			prodList.add("reebok");
			break;
			
		case "flipkart":
			prodList.add("zara");
			prodList.add("H&M");
			prodList.add("H&B");
			break;
		default:
			System.out.println("Comp name not found..." + compName );
			break;
		}
		
		return prodList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company comp = new Company();
		Object info[] = comp.getCompInfo("IBM");
		
		for (Object obj : info) {
			
			System.out.println(obj);
		}
		System.out.println(Arrays.toString(info));
		System.out.println("-------------------------");
	
		//	Array List
		ArrayList prodList = comp.getProdList("Flipkart");
		if(prodList.isEmpty())
			System.out.println("No products found for the company");
		else
			System.out.println(prodList);
	}
}
