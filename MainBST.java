package com.bridgelabz.binarysearch;

public class MainBST {
	
	    public static void main(String[] args) {
	        BinarySearchTree tree = new BinarySearchTree();
	        Node root = null;
	        root = tree.insertData(root, 56);
	        root = tree.insertData(root, 30);
	        root = tree.insertData(root, 70);
	        root = tree.insertData(root, 22);
	        root = tree.insertData(root, 40);
	        root = tree.insertData(root, 60);
	        root = tree.insertData(root, 95);
	        root = tree.insertData(root, 11);
	        root = tree.insertData(root, 65);
	        root = tree.insertData(root, 3);
	        root = tree.insertData(root, 16);
	        root = tree.insertData(root, 63);
	        root = tree.insertData(root, 67);

	        tree.printInorder(root);
	        System.out.println();
	        System.out.println("Number of Nodes in binary tree :" + tree.size());
	        System.out.println("Search 63 in binary tree: " + tree.search(root, 63));
	    }
	}
