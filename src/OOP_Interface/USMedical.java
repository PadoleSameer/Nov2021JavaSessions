package OOP_Interface;

public interface USMedical extends Medical{

	int min_fee = 10;
	//static and final
	
	//No Method Body//only method declaration
	// Only Method Prototype
	// only abstract method: no body
	// can not create the Object of Interface
	// can not have static abstract method
	
	public void physioServices();
	public void cardioServices();
	public void oncologyServices();
	public void emmergencyServices();
}
