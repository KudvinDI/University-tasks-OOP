package com.company;

import java.util.Scanner;

public class StrFilter {
    Scanner scanner = new Scanner(System.in);
    private String filteredString;

    StrFilter(String stringInput){
        System.out.println("Enter from witch element we start and end to delete. \nStart:");
        int startingPoint = scanner.nextInt()-1;
        System.out.println("End:");
        int endPoint = scanner.nextInt()-1;
        filteredString = stringInput.substring(startingPoint, endPoint);

    }

    StrFilter(){

    }

    public String getFilteredString() {
        return filteredString;
    }
    public int getFilteredStringLength(){
        return filteredString.length();
    }
}
