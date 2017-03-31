package tree_programs;

import java.util.ArrayList;
import java.util.List;


public class PrintAllMatching {
	
	 Node root;
	 
	 public void getNodes(Node node, List<Node> nodelist, int val){
		 
		 if(node == null){
			 return;
		 }
		 
		 if(node.value == val){
			 nodelist.add(node);
		 }
		 
		 getNodes(node.left, nodelist, val);
		 getNodes(node.right, nodelist, val);
		 
		 
	 }
	 
	 
	 public static void main(String[] args){
		 PrintAllMatching tree = new PrintAllMatching();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(2);
	        tree.root.right.right = new Node(1);
	        
	        List<Node> nodelist = new ArrayList<Node>();
	        tree.getNodes(tree.root, nodelist, 1);
	        
	        for(Node node: nodelist){
	        	System.out.println(node.value);
	        }
	        
	        
	 }

}
