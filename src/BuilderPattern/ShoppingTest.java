package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		EcommApp e1 = new EcommApp();
		
		//UC1
		e1.login("naveem@gmail.com", "test123")
		.search("iMac")
		.clickOnProduct("iMac")
		.addToCart()
		.doPayment("test@okicici.com")
		.generateOrder()
		.sendOverEmail()
		.logout()
		.getOrderId();
		
		//uc2:
		e1.login()
		.search("nike shoes")
		.logout();
				
		//uc3;
		e1.login("admin", "admin123")
		.logout();//UC2

	}

}
