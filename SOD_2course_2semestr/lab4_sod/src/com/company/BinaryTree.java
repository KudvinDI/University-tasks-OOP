package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {   // Comporator usage
    MyComparator myComparator = new MyComparator();

    private Node root;


    public boolean insertNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (root == null) {  //root node
            root = newNode;
        }
        return addInSubTree(value, root);
    }

    private boolean addInSubTree(int value, Node rootNode) {
        if (value == rootNode.getValue()) {
            return false;
        }
        if (value % 2 ==0) { // left
            if(value > rootNode.getValue()){
                if (rootNode.getLeft()==null) { // Left
                    rootNode.setLeft(new Node(value));
                    return true;
                } else {
                    return addInSubTree(value, rootNode.getLeft());
                }
            }
            else {
                if (rootNode.getRight() == null) { //Right
                    rootNode.setRight(new Node(value));
                    return true;
                } else {
                    return addInSubTree(value, rootNode.getRight());
                }
            }

        } else {
            if (rootNode.getRight() == null) { //Right
                rootNode.setRight(new Node(value));
                return true;
            } else {
                return addInSubTree(value, rootNode.getRight());
            }
        }
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

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 != 0) {
            return -1;
        }
        if (o2 % 2 == 0 && o1 % 2 != 0) {
            return +1;
        }
        if (o1 % 2 == 0) {
            return -Integer.compare(o1, o2);
        }
        return Integer.compare(o1, o2);
    }

}


