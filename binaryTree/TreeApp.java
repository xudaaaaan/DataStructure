
public class TreeApp {
	
	public static void main(String[] args) {
		Tree newTree = new Tree();
		
		//insert
		newTree.insert(1,1);
		newTree.insert(5,2);
		newTree.insert(6,3);
		newTree.insert(3,4);
		newTree.insert(3,5);
		newTree.insert(7,6);
		newTree.insert(10,7);
		newTree.insert(15,8);
		newTree.insert(16,9);
		newTree.insert(11,10);
		newTree.insert(19,11);
		
		//find
		newTree.find(7).displayNode();
		//delete
		//newTree.delete(7);
		//inOrder
		newTree.inOrder(newTree.find(1));
		
	}

}
