package com.company;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private String destinationInput;
    private int timeInput;
    private int placesInput;
    public static void main(String[] args) {

        Main main = new Main();
        main.run();
    }
    void run(){
        Train[]trains = new Train[]{
                new Train("Moscow", "Ms1231241", LocalTime.of(23, 12), 200, 123, 32, 13),
                new Train("Kiev", "Mk1231424", LocalTime.of(12, 34), 300, 159, 54, 23),
                new Train("London", "Mz083441", LocalTime.of(20, 54), 400, 234, 32, 33),
                new Train("Moscow", "Kl123865", LocalTime.of(16, 14), 500, 231, 62, 53),
        };
       printTrain(trains);
       userInput();
       printTrain(filterToDestination(trains, destinationInput));
       printTrain(filterToDestinationAndTime(trains, destinationInput, timeInput));
       printTrain(filterToDestinationAndPlaces(trains, destinationInput, placesInput));
    }
    Train[] filterToDestination(Train[] trains, String destination){
        Train[] test = new Train[trains.length];
        int count = 0;
        for (Train train : trains) {
            if(train.getDestination().equals(destination)){
                test[count++]=train;
            }

        }
        System.out.println("Filtered by destination");
        return Arrays.copyOf(test,count);

    }
    Train[] filterToDestinationAndTime(Train[] trains, String destination, int time){
        Train[] test = new Train[trains.length];
        int count = 0;
        for (Train train : trains) {
            if(train.getDestination().equals(destination) &&(train.getTimeOfDelation().isAfter(LocalTime.of(time, 0))) ){
                test[count++]=train;
            }

        }
        System.out.println("Filtered by destination and time after specified");
        return Arrays.copyOf(test,count);

    }
    Train[] filterToDestinationAndPlaces(Train[] trains, String destination, int places){
        Train[] test = new Train[trains.length];
        int count = 0;
        for (Train train : trains) {
            if(train.getDestination().equals(destination) && (train.getGeneralPlaces()>places)){
                test[count++]=train;
            }

        }
        System.out.println("Filtered by destination");
        return Arrays.copyOf(test,count);

    }

    void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter destination: ");
        destinationInput = scanner.next();
        System.out.println("Enter delay time hour after specified: ");
        timeInput = scanner.nextInt();
        System.out.println("Enter places capacity: ");
        placesInput = scanner.nextInt();


    }
    void printTrain(Train[] trains){
        for (Train train : trains) {
            System.out.println(train);
        }
        System.out.println();

    }

}

