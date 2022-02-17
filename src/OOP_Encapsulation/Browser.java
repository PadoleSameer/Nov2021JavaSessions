package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		
		System.out.println("Trying to launch the browser");
		checkOSCompatible();
		checkBrowserVersion();
		enoughRAM();
		isBrowserUpgraded();
		System.out.println("Chrome is launched sucessfully");
	}

	private void  checkOSCompatible() {
		
		System.out.println("CheckOSCompatible");
	}
	
	private void checkBrowserVersion() {
		
		System.out.println("CheckBrowserVesion");
	}

	private void enoughRAM() {
		
		System.out.println("Enough RAM");
	}
	private void isBrowserUpgraded() {
		
		System.out.println("isBrowserUpgraded");
	}
}
