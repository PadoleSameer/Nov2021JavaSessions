package BuilderPattern;

public class EcommApp {
	
	int orderId;
	
	public EcommApp login() {
		
		System.out.println("login to app");
		return this;
	}

	public EcommApp login( String userName, String password) {
		
		System.out.println("Login with uername :"+userName+" Passsword :"+password);
		return this;
	}
	 public EcommApp search(String product) {
		 
		 System.out.println("Searching the product : "+product);
		 return this;
	 }
	 
	 public EcommApp search(String product, int price) {
		 System.out.println("Searching the product : "+product+" at price"+price);
		 return this;
	 }
	 
	 public EcommApp clickOnProduct(String productName) {
		 
		 System.out.println("Clicked on the product : "+productName);
		 return this;
	 }
	 
	 public EcommApp addToCart() {
		 
		 System.out.println("Product added to cart");
		 return this;
	 }
	 
	 public EcommApp doPayment(String cc , int cvv)
	 {
		 System.out.println("Do Payment: "+cc+":"+cvv);
		 return this;
	 }
	 
	 public EcommApp doPayment(String cc , int cvv, int otp)
	 {
		 System.out.println("Do Payment: "+cc+":"+cvv+":"+otp);
		 return this;
	 }
	 
	 public EcommApp doPayment(String upi)
	 {
		 System.out.println("Do payment :"+upi);
		 return this;
	 }
	 
	 public EcommApp generateOrder()
	 {
		 System.out.println("Your order is : "+12345);
		 this.orderId=12345;
		 return this;
	 }
	 
	 public EcommApp sendOverEmail()
	 {
		 System.out.println("Send order via email ad your order is : "+12345);
		 return this;
	 }
	 
	 public EcommApp logout()
	 {
		 System.out.println("Logging out");
		 return this;
	 }
	 
	 public int getOrderId()
	 {
		 System.out.println("Order Is :"+12345);
		 return this.orderId;
	 }
}

