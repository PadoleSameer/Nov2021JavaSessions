package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("Owen");
		empList.add("Clair");
		empList.add("Dino");
		
		System.out.println(empList);
		
		Collections.reverse(empList);//reverses the list
		System.out.println(empList);
		
		//Sort
		Collections.sort(empList); //sort alphabetically - ascending order
		System.out.println(empList);

		Collections.sort(empList, Collections.reverseOrder());////sort alphabetically - descending order
		System.out.println(empList);
		
		System.out.println("---------------");
		
		ArrayList<String> stList = new ArrayList<String>();
		stList.add("Tom");
		stList.add("Owen");
		stList.add("Clair");
		stList.add("Dino");
		
		for(int i = stList.size()-1; i>=0;i--) {
			
			System.out.println(stList.get(i));
		}
		
		System.out.println("---------------");
		
		ArrayList<String> trList = new ArrayList<String>();
		trList.add("Lisa");
		trList.add("Peter");
		trList.add("Naveen");
			
		trList.addAll(stList);
		System.out.println(trList);
		
		System.out.println("---------------");
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		List<Integer> data = Arrays.asList(10,20,30);
		System.out.println(data);	
		
		List<String> names = Arrays.asList("Sam", "Tom","Dam");
		System.out.println(names);
		
		//Static 
		int d[] = new int[3];
		d[0]= 24;
		
		int dd[] = {10,20,30,40};//int linteral array
		int ddd[] = new int[] {10,20,30,40};//new + literal
		System.out.println(ddd.length);
		
		String s = "Java";//String lteral
		String s1 = new String("Java"); //String Object
		
	}
	
}
