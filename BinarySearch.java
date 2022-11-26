package com.bridgelabz.binarysearch;

public class BinarySearch {

	public class Node {

	    int data;
	    Node left;
	    Node right;
	    
	    public Node(int data) {
	        this.data = data;
	        Node left = null;
	        Node right = null;
	    }
	}
	
    public static void main(String[] args) {
    	BinarySearch tree = new BinarySearch();
        Node root = null;
        root = tree.insertData(root, 56);
        root = tree.insertData(root, 30);
        root = tree.insertData(root, 70);
        tree.printInorder(root);
        }
    
    public Node insertData(Node node, int data) {

        if (node == null) {
            node = createNewNode(data);
        }

        if (data < node.data) {
            node.left = insertData(node.left, data);
        } else if (data > node.data) {
            node.right = insertData(node.right, data);
        }
        return node;
    }

    public Node createNewNode(int data) {
        Node node = new Node(data);
        return node;
    }

    public void printInorder(Node node) {
        if (node == null) {
            return;
            
        }
        printInorder(node.left);
        System.out.print(node.data + "->");
        printInorder(node.right);

    }
}