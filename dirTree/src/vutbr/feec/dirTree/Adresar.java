package vutbr.feec.dirTree;

public class Adresar {
	private Adresar pravy;
	private Adresar levy;
	private String name;
	
	Adresar(String name){
		this.name = name;
	}
	
	public Adresar getPravy() {
		return pravy;
	}

	public void setPravy(Adresar pravy) {
		this.pravy = pravy;
	}

	public Adresar getLevy() {
		return levy;
	}

	public void setLevy(Adresar levy) {
		this.levy = levy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
