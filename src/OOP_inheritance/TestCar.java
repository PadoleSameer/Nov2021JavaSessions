package OOP_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.start();
		c1.refuel();
		c1.stop();
		c1.engine();

		BMW b1 = new BMW();
		b1.start();//BMW- overridden
		b1.refuel();//CAR - inherited
		b1.autoParking();//BMW - individual
		b1.stop();//CAR - inherited
		b1.engine();//Vehicle - inherited
		b1.name = "520d";
		System.out.println(b1.name);
		System.out.println(Car.wheels);
		System.out.println(BMW.wheels);
		
		Audi a = new Audi();
		
		BMW.price();
		c1.price();
		
		//TOP Casting
		//child class object can be referenced by parent class reference variable.
		Car c2= new BMW();
		c2.start();
		c2.stop();
		c2.refuel();
		c2.engine();
		Car.price();
		
		//child clas object can be referenced by grand parent class reference variable.
		Vehicle v1 = new BMW();
		v1.engine();//inherited
		
		
		//Down Casting
		//parent class object can be referred by child class reference variable.
		//BMW b2 = (BMW) new Car();//Class cast exception

		
		
	}

}
