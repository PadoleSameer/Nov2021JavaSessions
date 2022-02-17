package OOP_Encapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer("Tom", 21, "Nagpur");
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());
		
		c1.setCity("Bombay");
		
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());
	}
}
