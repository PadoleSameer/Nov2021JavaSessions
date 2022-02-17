package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.entServices();
		fh.medicalServices();
		fh.medicalTraining();
		fh.oncologyServices();
		fh.pediaServices();
		fh.physioServices();
		fh.radiologyServices();
		fh.emmergencyServices();
		fh.medicalFunds();
		fh.covidTest();
		fh.vaccination();
		fh.covidReport("OMicron");
		fh.medicalFunds(100);
		System.out.println(USMedical.min_fee);
		
		//Top casting
		//child class object can be referred by parent interface reference variable.
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.oncologyServices();
		us.physioServices();
		us.emmergencyServices();
		us.medicalFunds();
		us.covidTest();
		us.vaccination();
		us.medicalFunds(200);
		
		IndianMedical in = new FortisHospital();
		in.dentalServices();
		in.pediaServices();
		in.emmergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.entServices();
		uk.radiologyServices();
		uk.emmergencyServices();
		
		//downcasting
		//Parent interface object can NOT be referred by child class reference variable. 
		//FortisHospital ft = new USMedical();
	}

}
