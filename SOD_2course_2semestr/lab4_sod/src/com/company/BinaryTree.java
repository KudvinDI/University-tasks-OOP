package com.company;

import java.util.Stack;

public class BinaryTree {   // Comporator usage


    private Node rootNode;

    public void insertNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (rootNode == null) {  //root node
            rootNode = newNode;
        } else {
            Node currentNode = rootNode;

            if (value % 2 == 0) { // to left

                if(value == currentNode.getValue()){ //value exists
                    return;
                }
                if (rootNode.getLeft() == null) { // first left element
                    rootNode.setLeft(newNode);
                    newNode.setParent(rootNode);
                    newNode.setValue(value);
                    return;
                }
                currentNode = rootNode.getLeft();
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
                if (rootNode.getRight() == null) { // first right element
                    rootNode.setRight(newNode);
                    newNode.setParent(rootNode);
                    newNode.setValue(value);
                    return;
                }
                currentNode = rootNode.getRight();
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
    public void deleteNode(int value){
        Node currentNode = rootNode;
        boolean isLeft = true;
        if(value % 2 == 0){
            currentNode = currentNode.getLeft();
            while (currentNode.getValue() != value){
                if (value < currentNode.getValue()) { // Определяем, нужно ли движение влево?
                    isLeft = true;
                    currentNode = currentNode.getLeft();
                }
                else { // или движение вправо?
                    isLeft = false;
                    currentNode = currentNode.getRight();
                }
                if (currentNode == null)
                    System.out.println("Node not found");
                    return;
            }

            if (currentNode.getLeft() == null && currentNode.getRight() == null) { // case 1
                if (currentNode == rootNode) // value is rootNode
                    rootNode = null;
                else if (isLeft)
                    currentNode.getParent().setLeft(null); // for left Parent
                else
                    currentNode.getParent().setRight(null); // for right Parent
            }
            else if (currentNode.getRight() == null) { // case 2
                if (currentNode == rootNode) // value is rootNode
                    rootNode = currentNode.getLeft();
                else if (isLeft)
                    currentNode.getParent().setLeft(currentNode.getLeft());
                else
                    currentNode.getParent().setRight(currentNode.getLeft());
            }
            else if (currentNode.getLeft() == null) { //case 3
                if (currentNode == rootNode) // value is rootNode
                    rootNode = currentNode.getRight();
                else if (isLeft)
                    currentNode.getParent().setLeft(currentNode.getRight());
                else
                    currentNode.getParent().setRight(currentNode.getRight());
//            }
//            else { // если есть два потомка, узел заменяется преемником
//                Node heir = receiveHeir(currentNode);// поиск преемника для удаляемого узла
//                if (currentNode == rootNode)
//                    rootNode = heir;
//                else if (isLeft)
//                    currentNode.getParent().setLeft(heir);
//                else
//                    currentNode.getParent().setRight(heir);
//            }
//            return; // элемент успешно удалён
        }
        }


    }

    public void printTree() { // метод для вывода дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева
        globalStack.push(rootNode);
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
