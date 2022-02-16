package vutbr.feec.nodes;

public class Main {

	public static void main(String[] args) {
		Node n1 = new Node("n1");
		Node n2 = new Node("n2");
		Node n3 = new Node("n3");
		Node n4 = new Node("n4");
		Node n5 = new Node("n5");
		Node n6 = new Node("n6");
		
		n1.addNode(n5);
		n1.addNode(n4);
		n1.addNode(n2);
		n1.addNode(n6);
		
		n2.addNode(n5);
		n2.addNode(n3);
		n2.addNode(n1);		
		
		n5.addNode(n4);

		
		System.out.println("Node n1 ma: "+n1.getNodes()+" sousedních vztahù");
		System.out.println("Sousední nody: ");
		n1.printNodes();
		System.out.println("Node n2 ma: "+n2.getNodes()+" sousedních vztahù");
		System.out.println("Sousední nody: ");
		n2.printNodes();
		System.out.println("Node n3 ma: "+n3.getNodes()+" sousedních vztahù");
		System.out.println("Sousední nody: ");
		n3.printNodes();
		System.out.println("Node n4 ma: "+n4.getNodes()+" sousedních vztahù");
		System.out.println("Sousední nody: ");
		n4.printNodes();
		System.out.println("Node n5 ma: "+n5.getNodes()+" sousedních vztahù");
		System.out.println("Sousední nody: ");
		n5.printNodes();
		System.out.println("Node n6 ma: "+n6.getNodes()+" sousedních vztahù");
		System.out.println("Sousední nody: ");
		n6.printNodes();
		
		
	}

}
