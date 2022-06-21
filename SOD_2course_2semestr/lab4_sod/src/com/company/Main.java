package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(20);
        binaryTree.insertNode(18);
        binaryTree.insertNode(16);
        binaryTree.insertNode(13);
        binaryTree.insertNode(12);
        binaryTree.insertNode(14);
        binaryTree.insertNode(22);
        binaryTree.insertNode(21);
        binaryTree.insertNode(17);
        binaryTree.insertNode(19);
        binaryTree.insertNode(25);
        binaryTree.insertNode(11);
        binaryTree.contains(19).printNode();


        binaryTree.printTree();

    }
}
