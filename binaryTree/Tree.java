//搜索树，树的左子节点<根结点<=右子节点

public class Tree {
	public Node root;
	public Tree(){
		root = null;
	}
	
	//find a certain node
	public Node find(int key){
		Node present = root;
		while(present.key != key){
			if(present.key > key){
				present = present.leftChild;
			}else{
				present = present.rightChild;
			}
			if(present == null){
				return null;
			}
		}
		return present;
		
	}
	
	//insert a node
	public void insert(int key, double value){
		Node newNode = new Node();
		newNode.key = key;
		newNode.data = value;
		
		if(root == null){
			root = newNode;
		}else{
			Node present = root;
			Node father;
			while(true){
				father = present;
				if(key < present.key){
					present = present.leftChild;
					if(present == null){
						father.leftChild = newNode;
						return;
					}
				}else{
					present = present.rightChild;
					if(present == null){
						father.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	//find the successor of the node to be deleted
	private Node getSuccessor(Node delNode){
		Node successor = delNode;
		Node current = delNode.rightChild;
		Node sucFather = delNode;
		while(current != null){
			sucFather = successor;
			successor = current;
			current = current.leftChild;
		}
		if(successor != delNode.rightChild){
			sucFather.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	
	//delete a node
	public boolean delete(int key){
		//find the node to be deleted
		Node present = root; //the node to be deleted
		Node father = root; // father of the node to be deleted
		boolean isLeftChild = true;
		while(key != present.key){
			father = present;
			if(key < present.key){
				present = present.leftChild;
				isLeftChild = true;
			}else{
				present = present.rightChild;
				isLeftChild = false;
			}
			if(present == null){
				return false;
			}
		}
		//the node to be deleted has no children
		if(present.leftChild == null && present.rightChild == null){
			if(present == root){
				root = null;
			}else{
				if(isLeftChild){
					father.leftChild = null;
				}else{
					father.rightChild = null;
				}
			}
			return true;
		}
		//the node to be deleted has one child
		else if(present.leftChild == null){
			if(present == root){
				root = present.rightChild;
			}else{
				if(isLeftChild){
					father.leftChild = present.rightChild;
				}else{
					father.rightChild = present.rightChild;
				}
			}
		}
		else if(present.rightChild == null){
			if(present == root){
				root = present.leftChild;
			}else{
				if(isLeftChild){
					father.leftChild = present.leftChild;
				}else{
					father.rightChild = present.leftChild;
				}
			}
		}
		//the node to be deleted has two children
		else{
			Node successor = getSuccessor(present);
			if(present == root){
				root = successor;
			}else if(isLeftChild){
				father.leftChild = successor;
			}else{
				father.rightChild = successor;
			}
			successor.leftChild = present.leftChild;
		}
		return true;
	}
	
	//前序遍历
	public void preOrder(Node localRoot){
		if(localRoot != null){
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
		System.out.print("\n");
		
	}
	
	//中序遍历
	public void inOrder(Node localRoot){
		if(localRoot != null){
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
			
		}
		System.out.print("\n");
	}
	
	//后序遍历
	public void postOrder(Node localRoot){
		if(localRoot != null){
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
		System.out.print("\n");
	}

}
