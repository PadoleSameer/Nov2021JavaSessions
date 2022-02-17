package javasessions;

public class Browser {

	//launch a browser
	//input param : name (string): FF/CH/SF/IE
	//return boolean
	public boolean launchBrowser(String name) {
		
//			boolean flag = false;
//			
//			System.out.println("Broswre Name is "+ name);
//	
//			if(name.equals("chrome")) {
//				System.out.println("launch chrome");
//				flag = true;
//			} else if ( name.equals("firfox")) {
//				System.out.println("launch firefox");
//				flag = true;
//			} else if ( name.equals("IE")) {
//				System.out.println("launch IE");
//				flag = true;
//			} else if ( name.equals("safari")) {
//				System.out.println("launch safari");
//				flag = true;
//			}
//			else {
//				System.out.println("please pass the right broswer");
//			}

			switch (name) {
			case "chrome":
				System.out.println("launch chrome");
				return true;
			case "firefox":
				System.out.println("launch firefox");
				return true;
			case "safari":
				System.out.println("launch safari");
				return true;
			case "IE":
				System.out.println("launch IE");
				return true;
			default:
				System.out.println("please pass the right broswer");
				return false;
			}
}
	
	// main method will never return anything
	public static void main(String[] args) {
		
		Browser br = new Browser();
		if(br.launchBrowser("firefo"))
			System.out.println("Chrome broswer is lanunched sucessfully");
		else
			System.out.println("Your tc failed");
	}
}