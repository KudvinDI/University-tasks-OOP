package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Main main = new Main();
        main.run();

    }
    void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String textInput = scanner.next();
        StrFilter strFilter = new StrFilter(textInput);





    }
}
