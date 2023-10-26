package com.example.web3;

import java.util.ArrayList;


public class Calculation {
    private final double t = 2.2;

    private ArrayList<Double> yArrayList;
    private ArrayList<Double> xArrayList;
    private final double start;
    private final double finish;
    private final double step;

    int length;

    public Calculation(double start, double finish, double step) {
        this.start = start;
        this.finish = finish;
        this.step = step;
        length = calculateIterations(start, finish, step);
        yArrayList = new ArrayList<>(length);
        xArrayList = new ArrayList<>(length);
        calculate();
    }

    public int calculateIterations(double start, double finish, double step){
        return (int) Math.round((finish - start) / step + 1);
    }
    public void dataInputToArrays(double y, double x){
        yArrayList.add(y);
        xArrayList.add(x);
    }

    private void calculate(){
        double y;
        double x = start;
        double delta = 0.0001;

        for(int i=1; i<=length; i++){
            if (x < 0.9) {
                y = ((Math.pow(Math.log(x), 3)) + x * x) / (Math.sqrt(x + t));
                dataInputToArrays(y, x);
            }
            if(Math.abs(x-0.9) < delta){
                y = Math.sqrt(x+t) + 1/x;
                dataInputToArrays(y, x);
            }
            if(x >0.9){
                y = Math.cos(x) + t*Math.pow(Math.sin(x), 2);
                dataInputToArrays(y, x);

            }
            x+=step;

        }

    }
    public String findMax(){
        return String.format("%.3f%n", calculateMax());
    }
    public String findMin(){
        return String.format("%.3f%n", calculateMin());
    }
    public double calculateMax(){
        return yArrayList.stream().reduce(Double.MIN_VALUE, Double::max);
    }
    public double calculateMin(){
        return yArrayList.stream().reduce(Double.MIN_VALUE, Double::min);
    }
    public int findIndexOfMax(){
        return yArrayList.indexOf(calculateMax());
    }
    public int findIndexOfMin(){
        return yArrayList.indexOf(calculateMin());
    }

    public String findArgumentOfMax(){
        return  String.format("%.3f%n",xArrayList.get(findIndexOfMax()));
    }

    public String findArgumentOfMin(){

        return String.format("%.3f%n",xArrayList.get(findIndexOfMin()));
    }

    public String sumOfValue(){
        return String.format("%.3f%n", yArrayList.stream().mapToDouble(Double::valueOf).sum());
    }

    public String averageValue(){
        return  String.format("%.3f%n",yArrayList.stream().mapToDouble(Double::valueOf).average().orElse(0.0));
    }

    public double getXByIndex(int index){
        return xArrayList.get(index);
    }
    public double getYByIndex(int index){
        return yArrayList.get(index);
    }




}
