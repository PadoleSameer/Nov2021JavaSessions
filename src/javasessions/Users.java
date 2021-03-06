package javasessions;

public class Users {

	//methods: class data member
	//method should be parallel to each other
	//method can not be created inside a method
	//can not create a duplicate method - but I can overload
			
			
	//1. no input and no return:
	//void: can not return anything
	//return type: void

	public void test() {
		System.out.println("test method...");
	}
	
	//2. no input and some return
	//return type : int
	public int getNumber() {
	
		System.out.println("getNumber method ....");
		return 100;
	}
	
	public String getTrainerName() {
		System.out.println("getTrainerMethod ....");
		return "Sameer";
	}
	
	public boolean isForgotPasswordLinkExist() {
		System.out.println("isForgotPasswordExist...");
		return true;
	}
	
	//3. some input and some return:
		public int add(int a, int b) {//parameters
			System.out.println("add method");
			int c = a+b;
			System.out.println(c);//30
			return c;
		}
	
	public static void main(String[] args) {
	
		Users obj = new Users();
		obj.test();
		System.out.println(obj.getNumber());
		System.out.println(obj.getTrainerName());
		System.out.println(obj.isForgotPasswordLinkExist());
		
		boolean flag = obj.isForgotPasswordLinkExist();
		System.out.println(flag);
		if(flag) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		int sum = obj.add(10, 20);//arguments
		System.out.println(sum+(5/100));
		
		int s = obj.add(30, 40);
		System.out.println(s+40);
	
	
	}

	
}
