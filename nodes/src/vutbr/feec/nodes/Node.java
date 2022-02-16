package vutbr.feec.nodes;

import java.util.ArrayList;

public class Node {
	private String name;
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
	Node(String na){
		this.name = na;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addNode(Node n){
		nodes.add(n);
	}
	
	public int getNodes() {
		return nodes.size();
	}
	
	
	public void printNodes() {
		for(int j = 0;j<nodes.size();j++) {
			System.out.println(nodes.get(j).getName());
		}
	}
}
