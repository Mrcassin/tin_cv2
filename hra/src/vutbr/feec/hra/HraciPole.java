package vutbr.feec.hra;

public class HraciPole {
	private int[][]pole={ {7, 2, 4}, {5, 0, 6},{8, 3, 1}};
	private int [] pozP = {1,1};
	private int pom;
	
	public void tN() {
		if(pozP[0]>0) {
			pom = pole[pozP[0]-1][pozP[1]];
			pole[pozP[0]-1][pozP[1]]=pole[pozP[0]][pozP[1]];
			pole[pozP[0]][pozP[1]]=pom;
			pozP[0]--;
			//System.out.println(pozP[0]+":"+pozP[1]);
			vypis();
		}else {
			System.out.println("nelze se pohybovat mimo pole");
		}
		
		
	}
	
	public void tD() {
		if(pozP[0]<2) {
			pom = pole[pozP[0]+1][pozP[1]];
			pole[pozP[0]+1][pozP[1]]=pole[pozP[0]][pozP[1]];
			pole[pozP[0]][pozP[1]]=pom;
			pozP[0]++;
			//System.out.println(pozP[0]+":"+pozP[1]);
			vypis();
		}else {
			System.out.println("nelze se pohybovat mimo pole");
		}
		
	}
	
	public void tP() {
		if(pozP[1]<2) {
			pom = pole[pozP[0]][pozP[1]+1];
			pole[pozP[0]][pozP[1]+1]=pole[pozP[0]][pozP[1]];
			pole[pozP[0]][pozP[1]]=pom;
			pozP[1]++;
			//System.out.println(pozP[0]+":"+pozP[1]);
			vypis();
		}else {
			System.out.println("nelze se pohybovat mimo pole");
		}
	}
	
	public void tL() {
		if(pozP[1]>0) {
			pom = pole[pozP[0]][pozP[1]-1];
			pole[pozP[0]][pozP[1]-1]=pole[pozP[0]][pozP[1]];
			pole[pozP[0]][pozP[1]]=pom;
			pozP[1]--;
			//System.out.println(pozP[0]+":"+pozP[1]);
			vypis();
		}else {
			System.out.println("nelze se pohybovat mimo pole");
		}
	}
	
	public void vypis() {
		for (int i =0; i <3;i++) {
			for (int j = 0 ; j < 3; j++) {
				System.out.print(pole[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("\n");
	}
	
	
}
