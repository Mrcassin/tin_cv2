package vutbr.feec.pakety;

public class Main {

	public static void main(String[] args) {
		Paket p1 = new Paket();
		Paket p2 = new Paket();
		Paket p3 = new Paket();
		Paket p4 = new Paket();
		Paket p5 = new Paket();

		p1.setDalsiPaket(p2);
		p2.setDalsiPaket(p3);
		p3.setDalsiPaket(p4);
		p4.setDalsiPaket(p5);
	}

}
