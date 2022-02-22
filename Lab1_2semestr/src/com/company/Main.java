package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {

    double x=1.825, y=18.225, z=-3.298;
    double c = calcC(x, y);
    double f = calcF(x, y, z);

    public static void main(String[] args) {
     Main main = new Main();
        main.run();

    }
    private void run(){
        printData(x, y, z, c, f);
        printDateTime();
        inputData();
        c = calcC(x, y);
        f = calcF(x, y, z);
        printData(x, y, z, c, f);
        printDateTime();

    }
    private double calcC(double x, double y) {
        return Math.abs(Math.pow(x, y / x) - Math.cbrt(y/x));
    }

    private double calcF(double x, double y, double z) {
        return ((y - x) * (y - z) / (y - x)) / (1 +(y-x)*(y-x));
    }

    private void printDateTime(){

        System.out.print(LocalDateTime.now().format(DateTimeFormatter.ofPattern("'Time:' hh:mm 'Date:' dd:MM:yy")));
        System.out.println();

    }
    private void printData(double x, double y, double z, double c, double f){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.printf("c = %.3f%n", c );
        System.out.printf("f = %.3f%n", f);



    }
    private void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        x = scanner.nextDouble();
        System.out.print("y = ");
        y = scanner.nextDouble();
        System.out.print("z = ");
        z = scanner.nextDouble();
    }


}
