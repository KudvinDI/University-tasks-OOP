package com.company;

public class Node {
    private int value;
    private Node left;
    private Node right;
    private Node parent;

    public Node(int value) {
        this.value = value;
    }
    public Node(){

    }

    public void printNode(){
        System.out.println("Value: " + value);
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
