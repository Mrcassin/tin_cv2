package vutbr.feec.hra;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HraciPole h = new HraciPole();
		Scanner sc = new Scanner(System.in);
		String volba;
		
		h.vypis();
		
		do {
			System.out.println("Zadej smìr pohybu (w/a/s/d): ");
			volba = sc.next();
			switch(volba) {
			case "w":
				h.tN();
				break;
			case "s":
				h.tD();
				break;
			case "a":
				h.tL();
				break;
			case "d":
				h.tP();
				break;
			}
		}while(true);

	}

}
