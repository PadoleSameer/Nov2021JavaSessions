package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//Collection
		//ArrayList - default class
		//Dynamic array
		
		//Object of an ArrayList
		
		ArrayList ar = new ArrayList<>();
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());//2
		
		ar.add("Tom");//2
		ar.add('C');//3

		System.out.println(ar.size());//4
		
		//Lowest Index =0
		//Highest Index=3
		//length/size =highest index +1 =4
		
		ar.add(300); //4
		
		System.out.println(ar.size());//5
		
		System.out.println(ar.get(0));//100
		//System.out.println(ar.get(-1));//Index out of bounds
		//System.out.println(ar.get(5));//Index out of bounds
		
		ArrayList ar1 = new ArrayList(20);//vc =20
		
		System.out.println("----------------------");
		ArrayList ar2 = new	ArrayList(5); //vc =5
		
		ar2.add(100);//0
		ar2.add(100);//1
		ar2.add(null);//2
		ar2.add(null);//3
		
		System.out.println(ar2.size());//4
		System.out.println(ar2.get(0));//100
		System.out.println(ar2.get(1));//100
		System.out.println(ar2.get(2));//null
		System.out.println(ar2.get(3));//null
		//System.out.println(ar2.get(4));//IndexOutOfBoundsException
		
		ar2.add(4,200);//4
		//ar2.add(9, 400);//IndexOutOfBoundsException
		System.out.println(ar2.get(4));//200
		
		ar2.add(3,1100);//3
		System.out.println(ar2.get(3));
		
		ar2.add(5,1200);//5
		System.out.println(ar2);
		
		for(int i =0 ; i<=6 ;i++ ) {
			System.out.println("Value at index "+i+ " is : "+ ar2.get(i));
		}

		System.out.println("----------------------");
		
		ArrayList prod = new ArrayList();
		prod.add("A");//0
		prod.add(null);//1
		prod.add("C");//2
		prod.add("D");//3
		prod.add("E");//4
		
		System.out.println(prod);
		System.out.println(prod.size());
		
		prod.add(1, "B");
		
		System.out.println(prod);
		System.out.println(prod.size());
		
		prod.remove(2);
		
		System.out.println(prod);
		System.out.println(prod.size());
		
		prod.add(2, "S");
		
		System.out.println(prod);
		System.out.println(prod.size());
		
		//Here adding element at any index is pushing element at that index to next index.
		System.out.println("----------------------");

		
		ArrayList ar3 = new	ArrayList(5); //vc =5
		
		ar3.add(100);//0
		ar3.add(100);//1
		ar3.add(null);//2
		ar3.add(null);//3
		
		System.out.println(ar3);
		System.out.println(ar3.size());
		
		ar3.add(4,200);//4
		System.out.println(ar3);
		System.out.println(ar3.size());
		
		ar3.add(3,1100);//3
		System.out.println(ar3);
		System.out.println(prod.size());
		
		ar3.add(5,1200);//5
		System.out.println(ar3);
	
		//int arraylist:
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
	
		ArrayList<Double> salary = new ArrayList<Double>();	
		salary.add(25000.57);
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("123");
		
		
		//name, age, gender, sal, boolean
		//Object ArrayList:
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Tom");
		empData.add(30);
		empData.add('m');
		empData.add(12.33);
		empData.add(true);
		
		//to print all from ArrayList
		
		for (Object obj : empData) {
			
			System.out.println(obj);
		}
	}

}
