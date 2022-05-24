package com.company;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


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
      filterToString(trains);
    }
    private void filterToString(Train[] trains){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter destination: ");
        String destinationInput = scanner.next();
        Train[] toDestination = filterToDestination(trains, destinationInput);
        System.out.println("Filtered by destination");
        printTrain(toDestination);
        System.out.println("Enter delay time hour after specified: ");
        int timeInput = scanner.nextInt();
        Train[] toDestinationAndTime = filterToDestinationAndTime(trains, destinationInput, timeInput);
        System.out.println("Filtered by destination and time after specified");
        printTrain(toDestinationAndTime);
        System.out.println("Enter places capacity: ");
        int placesInput = scanner.nextInt();
        Train[] toDestinationAndPlaces = filterToDestinationAndPlaces(trains, destinationInput, placesInput);
        System.out.println("Filtered by destination");
        printTrain(toDestinationAndPlaces);



    }
    Train[] filterToDestination(Train[] trains, String destination){
        Train[] test = new Train[trains.length];
        int count = 0;
        for (Train train : trains) {
            if(train.getDestination().equals(destination)){
                test[count++]=train;
            }

        }
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
        return Arrays.copyOf(test,count);

    }

    void printTrain(Train[] trains){
        for (Train train : trains) {
            System.out.println(train);
        }
        System.out.println();

    }

}

