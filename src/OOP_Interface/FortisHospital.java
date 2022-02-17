package OOP_Interface;

public class FortisHospital extends UNHG implements USMedical, UKMedical, IndianMedical {

	//India
	@Override
	public void dentalServices() {
		System.out.println("FH....dentalServices");
	}

	//India
	@Override
	public void pediaServices() {
		System.out.println("FH....pediaServices");
	}

	//UK
	@Override
	public void radiologyServices() {
		System.out.println("FH....radiologyServices");
	}

	//UK
	@Override
	public void entServices() {
		System.out.println("FH....entServices");
	}

	//US
	@Override
	public void physioServices() {
		System.out.println("FH....physioServices");
	}

	//US
	@Override
	public void cardioServices() {
		System.out.println("FH....cardioServices");
	}

	//US
	@Override
	public void oncologyServices() {
		System.out.println("FH....oncologyServices");
	}

	//Common
	@Override
	public void emmergencyServices() {
		System.out.println("FH....emmergencyServices");
	}
	
	//Individual
	public void medicalTraining() {
		System.out.println("FH....medicalTraining");
	}
		
	//Individual
	public void medicalServices() {
		System.out.println("FH....medicalServices");
	}

	//Medical
	@Override
	public void medicalFunds() {
		System.out.println("FH....medicalFunds");
	}
	
	//Medical
	@Override
	public void medicalFunds(int fee) {
		System.out.println("FH....medicalFunds : "+fee);
		
	}

	//WHO
	@Override
	public void covidTest() {
		System.out.println("FH....CovidTest");
	}

	//WHO
	@Override
	public void vaccination() {
		System.out.println("FH....vaccination");
	}

	//WHO
	@Override
	public void covidReport(String version) {
		
		System.out.println("Covid report.."+version);
	}
}
