package com.bridgelabz.binarysearch;

public class BinarySearchTree {

    int size = 0;

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
        size += 1;
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

    public int size() {
        return size;
    }

    public boolean search(Node node, int data) {
        if (node == null) {
            return false;
        }

        boolean isPresent = false;
        while (node != null) {
            if (data < node.data) {
                node = node.left;
            } else if (data > node.data) {
                node = node.right;
            } else {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }
}
