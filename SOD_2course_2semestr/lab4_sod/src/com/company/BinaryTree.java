package com.company;

import java.util.Stack;

public class BinaryTree {   // Comporator usage


    private Node root;

    public void insertNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (root == null) {  //root node
            root = newNode;
        } else {
            Node currentNode = root;

            if (value % 2 == 0) { // to left

                if(value == currentNode.getValue()){ //value exists
                    return;
                }
                if (root.getLeft() == null) { // first left element
                    root.setLeft(newNode);
                    newNode.setParent(root);
                    newNode.setValue(value);
                    return;
                }
                currentNode = root.getLeft();
                while (true) {
                    if(value == currentNode.getValue()){ //value exists
                        return;
                    }
                    if (value < currentNode.getValue()) {   // left
                        if (currentNode.getLeft() == null) {
                            currentNode.setLeft(newNode);
                            newNode.setParent(currentNode);
                            return;
                        }
                        currentNode = currentNode.getLeft();
                    }
                    else { // right
                        if (currentNode.getRight() == null) {
                            currentNode.setRight(newNode);
                            newNode.setParent(currentNode);
                            return;
                        }
                        currentNode = currentNode.getRight();
                    }
                }
            } else { // to right
                if(value == currentNode.getValue()){ //value exists
                    return;
                }
                if (root.getRight() == null) { // first right element
                    root.setRight(newNode);
                    newNode.setParent(root);
                    newNode.setValue(value);
                    return;
                }
                currentNode = root.getRight();
                while (true) {
                    if(value == currentNode.getValue()){ //value exists
                        return;
                    }
                    if (value > currentNode.getValue()) {   // left
                        if (currentNode.getLeft() == null) {
                            currentNode.setLeft(newNode);
                            newNode.setParent(currentNode);
                            return;
                        }
                        currentNode = currentNode.getLeft();
                    }
                    else { // right
                        if (currentNode.getRight() == null) {
                            currentNode.setRight(newNode);
                            newNode.setParent(currentNode);
                            return;
                        }
                        currentNode = currentNode.getRight();
                    }
                }
            }
        }
    }

    private Node find(int key){
        if(root == null){
            return null;
        }
        if (root.getValue() == key) {
            return root;
        }
        if(key % 2 ==0){
            if(root.getLeft().getValue() == key){
                return root.getLeft();
            }
           return findInSubTreeLeft(key, root.getLeft());
        }
        else {
            if (root.getRight().getValue() == key){
                return root.getRight();
            }
          return findInSubTreeRight(key, root.getRight());

        }

    }

    private Node findInSubTreeLeft(int key, Node root) {
        if (root==null || key == root.getValue()) {
            return root;
        }
        if (key<root.getValue()) {
            return findInSubTreeLeft(key, root.getLeft());
        } else {
            return findInSubTreeLeft(key, root.getRight());
        }
    }
    private Node findInSubTreeRight(int key, Node root) {
        if (root==null || key == root.getValue()) {
            return root;
        }
        if (key<root.getValue()) {
            return findInSubTreeRight(key, root.getRight());
        } else {
            return findInSubTreeRight(key, root.getLeft());
        }
    }

    public Node contains(int key) {
        return find(key);
    }




    public void printTree() { // метод для вывода дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева
        globalStack.push(root);
        int gaps = 32; // начальное значение расстояния между элементами
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);// черта для указания начала нового дерева
        while (isRowEmpty == false) {
            Stack localStack = new Stack(); // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) { // покуда в общем стеке есть элементы
                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getValue()); // выводим его значение в консоли
                    localStack.push(temp.getLeft()); // соохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null ||
                            temp.getRight() != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        System.out.println(separator);// подводим черту
    }



}