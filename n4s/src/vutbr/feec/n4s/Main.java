package vutbr.feec.n4s;

public class Main {

	public static void main(String[] args) {
		Map m1 = new Map();
		Car c1 = new Car("Aston Martin");
		Car c2 = new Car("Porsche");
		Car c3 = new Car("Mclaren");
		Car c4 = new Car("Mercedes");
		
		m1.addCarToMap(c1);
		m1.addCarToMap(c2);
		m1.addCarToMap(c3);
		m1.addCarToMap(c4);
		
		c1.setX(4);
		c1.setY(6);
		c2.setX(12);
		c2.setY(5);
		c3.setX(1);
		c3.setY(3);
		c4.setX(7);
		c4.setY(8);
		
		m1.getCars();
		

	}

}
