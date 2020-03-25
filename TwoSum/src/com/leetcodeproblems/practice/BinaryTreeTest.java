package com.leetcodeproblems.practice;

public class BinaryTreeTest {

    public static void main(String arg[]){

        BinaryTree tree = new BinaryTree();
        tree.add(6);
        tree.add(4);
        tree.add(3);
        tree.add(5);
        tree.add(8);
        tree.add(7);
        tree.add(9);

        System.out.println(tree.getSize()); // getting the size of the tree
        System.out.println(tree.containsNode(6)); // checking if the value is available
        System.out.println(tree.containsNode(10)); // should return false since 10 is not inserted


    }
}
