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
        String stringInput = scanner.next();
        StrFilter filter = new StrFilter(stringInput);
        System.out.println(stringInput);
        System.out.println(filter.getFilteredString());
        System.out.println("Amount of symbols:" + filter.getFilteredStringLength());


    }
}
