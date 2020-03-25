package com.leetcodeproblems.practice;

public class BinaryTree {

    Node root; // the starting node of our tree we will call it root
    

    // checking when it is empty
    public boolean isEmpty() {
        return root == null;
    }

    // get the size of the node
    public int getSize() {
        return getSizeRecursive(root);
    }

    // we will create a public method that will start the recursion from the root node
    // this method will be called when adding values to out root node
    public void add(int value){
        root = addRecursive(root,value);
    }


    // this method will be used to check if the values are available
    public boolean containsNode(int value){

        return containsNodeRecursive(root, value);
    }


    //this method will be used to delete elements
    public void deleteElements(int value){
        root = deleteRecursive(root, value);
    }

    // getting the size of the tree
    private int getSizeRecursive(Node current) {
        return current == null ? 0 : getSizeRecursive(current.left) + 1 + getSizeRecursive(current.right);
    }

    // we will write a method to find the elements
    private boolean containsNodeRecursive(Node current, int value){

        if(current == null){
            return false;
        }
        if(value == current.value){
            return true;
        }

        //we will be comparing the values in the current node then continue to left or right
        return value < current.value ? containsNodeRecursive(current.left,value) : containsNodeRecursive(current.right, value);

    }
    //We will create a recursive method to insert elements
    // which will take the Node and an int value

    private Node addRecursive(Node current, int value){
        //if it is null return a new node value
        if(current == null) {
            return new Node(value);
        }
        //if the nodes value is lower than the current nodes we go to the left child
        if(value < current.value){
            current.left = addRecursive(current.left,value);
        }
        // if the nodes value is greater than the current nodes we go to the right child
        if(value > current.value){
            current.right = addRecursive(current.right, value);
        }else{
            return current; // meaning it already exists
        }

        return current;
    }

    // we will create an auxiliary node class that will store an int value and
    // keep reference to each child
    class Node{

        int value; // to hold value
        Node left; // to hold left node value
        Node right; // to hold right node value

        //constructor Node which takes a int value

        Node(int value){

            this.value = value;
            left = null;
            right = null;
        }

    }


    //deleting a node from the tree
    private Node deleteRecursive(Node current, int value){
        if(current == null){
            return null;
        }
        if(value == current.value){

            //a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
            if (current.left == null && current.right == null) {
                return null;
            }

            //a node has exactly one child – in the parent node, we replace this node with its only child.
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }
            //a node has two children – this is the most complex case because it requires a tree reorganization
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if(value < current.value){
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    // find the smallest value
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

}
