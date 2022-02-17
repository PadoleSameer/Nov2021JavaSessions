package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		//array:
			//used to store multiple similar type of data/values
			//limitations:
			//1. size is fixed/static: to overcome this, we need to use dynamic array
			//2. stores only similar types of data: to overcome this, we use Object static array
			
			//1. int array:
			int a[] = new int[4];
			//li = 0
			//len = 4
			//hi = len-1 -> 3
			//len = hi+1--> 4
			
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			a[3] = 40;
			//a[4] = 50;//ArrayIndexOutOfBoundsException
			
			System.out.println(a[0]);
			System.out.println(a[3]);
			//System.out.println(a[4]);//ArrayIndexOutOfBoundsException
			//System.out.println(a[-1]);

			System.out.println(a[0]+a[2]);
			System.out.println("---");

			System.out.println(a.length);//4
			int len = a.length;//4
			
			System.out.println("---");
			
			//to print all the values of array: index based for loop:
			for(int i=0; i<=len-1; i++) {
				System.out.println(a[i]);//10 20 30 40 
			}
			
			System.out.println("---");
			
			//for each loop: enhanced loop:
			for( int e : a)
			{
				System.out.println(e);
			}
			System.out.println("---");
			
			System.out.println(a); //hashcode number/address
			
			System.out.println(Arrays.toString(a));
	
			//2. double array:
			double d1[] = new double[2];
			d1[0] = 22.23;
			d1[1] = 45.44;
			
			for(double d : d1)
			{
				System.out.println(d);
			}
			
			System.out.println(Arrays.toString(d1));
			
			//3. char array:
			char c[] = new char[3];
			c[0] = 'a';
			c[1] = 'b';
			c[2]= '1';
			
			System.out.println(c[0]+c[1]);
		
			System.out.println("---");

			//4. string array
			String s1[] = new String[3];
			s1[0]="Sameer";
			s1[1] = "Dhruv";
			s1[2]="Rushi";
			
			for (String s : s1) {
				
				System.out.println(s);
			}
			System.out.println(Arrays.toString(s1));

			//5. Objects array
			
			Object obj[] = new Object[6];
			obj[0]= 30;
			obj[1]= "Testing";
			obj[2]= 3.51;
			obj[3] = 'c';
			obj[4] = true;
			System.out.println(obj[5]);
			
			for( Object o : obj) {
				System.out.println(o);
			}
			
			//default values:
			//int : 0
			//double: 0.0
			//boolean: false
			//char: space
			//String: null
			//Object: null
	}
}
