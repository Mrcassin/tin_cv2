package vutbr.feec.n4s;

import java.util.ArrayList;


public class Map {

	private ArrayList<Car> auta = new ArrayList<Car>();
	
	public void addCarToMap(Car c){
		auta.add(c);
	}
	
	public void getCars() {
		for(int j = 0; j < auta.size();j++) {
			System.out.println(auta.get(j).getNazev()+" -> SOURADNICE: ["+auta.get(j).getX()+";"+auta.get(j).getY()+"]");
		}
		
	}
}
