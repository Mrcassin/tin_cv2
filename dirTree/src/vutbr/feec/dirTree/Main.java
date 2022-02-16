package vutbr.feec.dirTree;

public class Main {

	public static void main(String[] args) {
		Adresar a1 = new Adresar("a1");
		Adresar a2 = new Adresar("a2");
		Adresar a3 = new Adresar("a3");
		Adresar a4 = new Adresar("a4");
		Adresar a5 = new Adresar("a5");
		
		a1.setLevy(a4);
		a1.setPravy(a2);
		a2.setLevy(a5);
		a2.setPravy(a3);
		
		System.out.println("A1");
		System.out.println("|_ "+a1.getLevy().getName());
		System.out.println("|_ "+a1.getPravy().getName());
		System.out.println("    |_"+a2.getLevy().getName());
		System.out.println("    |_"+a2.getPravy().getName());
		
	}
}
