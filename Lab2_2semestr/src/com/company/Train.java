package com.company;


import java.time.LocalTime;

public class Train {
   private String destination;
   private String numberOfTrain;
   private LocalTime timeOfDelation;
   private int generalPlaces;
   private int coupePlaces;
   private int placPlaces;
   private int vipPlaces;

    public Train(String destination, String numberOfTrain, LocalTime timeOfDelation, int generalPlaces, int coupePlaces, int placPlaces, int vipPlaces) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.timeOfDelation = timeOfDelation;
        this.generalPlaces = generalPlaces;
        this.coupePlaces = coupePlaces;
        this.placPlaces = placPlaces;
        this.vipPlaces = vipPlaces;
    }
//    public Train(){
//
//    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(String numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public LocalTime getTimeOfDelation() {
        return timeOfDelation;
    }

    public void setTimeOfDelation(LocalTime timeOfDelation) {
        this.timeOfDelation = timeOfDelation;
    }

    public int getGeneralPlaces() {
        return generalPlaces;
    }

    public void setGeneralPlaces(int generalPlaces) {
        this.generalPlaces = generalPlaces;
    }

    public int getCoupePlaces() {
        return coupePlaces;
    }

    public void setCoupePlaces(int coupePlaces) {
        this.coupePlaces = coupePlaces;
    }

    public int getPlacPlaces() {
        return placPlaces;
    }

    public void setPlacPlaces(int placPlaces) {
        this.placPlaces = placPlaces;
    }

    public int getVipPlaces() {
        return vipPlaces;
    }

    public void setVipPlaces(int vipPlaces) {
        this.vipPlaces = vipPlaces;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberOfTrain='" + numberOfTrain + '\'' +
                ", timeOfDelation=" + timeOfDelation +
                ", generalPlaces=" + generalPlaces +
                ", coupePlaces=" + coupePlaces +
                ", placPlaces=" + placPlaces +
                ", vipPlaces=" + vipPlaces +
                '}';
    }
}
