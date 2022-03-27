import java.util.Scanner;
//Вариант 10

public class Main {
    private static final double t =2.2;
    private static final double EPS  = 1e-9;
    public static void main(String[] args){
        Main main = new Main();
        main.run();

    }
    void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input start: ");
        double start= scanner.nextDouble();
        System.out.println("Input finish: ");
        double finish=scanner.nextDouble();
        System.out.println("Input step: ");
        double step =scanner.nextDouble();
        double[] yArray = fillY(fillx(start, finish, step));
        printArrayMax(yArray);
        printArrayMin(yArray);


    }
    public double[] fillx(double start, double finish, double step){
        int count = countSteps(start, finish, step);
        double[] result = new double[count];
        for(int i=0; i<count; i++){
            result[i] = start + i*step;
        }
        return result;
    }
    public int countSteps(double start, double finish, double step){
        return (int) Math.round((finish-start)/step + 1);
    }
    public double calcY(double x){
        double y;
        if(x<=0.9+EPS){
            double i = Math.log(x);
            y = (i*i*i+x*x)/(Math.sqrt(x+t));
        }
        else {
            y = Math.cos(x) + t*Math.sin(x)*Math.sin(x);
        }
        return y;
    }
    public double[] fillY(double[] xArr){
        double[] yArray = new double[xArr.length];
        for (int i = 0; i < xArr.length; i++) {
            yArray[i] = calcY(xArr[i]);

        }
        return yArray;
    }

    public int findIndexOfMax(double[] yArray) {
        double max=yArray[0];
        int maxIndex = 0;
        for (int i = 0; i < yArray.length; i++) {
            if(yArray[i]>max){
                max=yArray[i];
                maxIndex=i;
            }

        }
        return maxIndex;
    }
    public int findIndexOfMin(double[] yArray) {
        double min=yArray[0];
        int minIndex = 0;
        for (int i = 0; i < yArray.length; i++) {
            if(yArray[i]<min){
                min=yArray[i];
                minIndex=i;
            }

        }
        return minIndex;
    }
    public double findMax(double[] yArray) {
        double max=yArray[0];
        for (int i = 0; i < yArray.length; i++) {
            if(yArray[i]>max){
                max=yArray[i];

            }

        }
        return max;
    }
    public double findMin(double[] yArray) {
        double min=yArray[0];
        for (int i = 0; i < yArray.length; i++) {
            if(yArray[i]<min){
                min=yArray[i];
            }

        }
        return min;
    }
    public double calculateSumOfArray(double[] yArray){
        double sum=0;
        for (double i : yArray) {
            sum += i;

        }
        return sum;
    }
    public double calculateAverageOfArray(double[] yArray){
        double sum = 0;
        for (double i : yArray) {
            sum += i;

        }
        return sum/ yArray.length;

    }
    public void printArrayMax(double[] yArray){
        System.out.println("Max element:" +  String.format("%.3f", findMax(yArray)) + "\nIndex of element: " + findIndexOfMax(yArray));
    }
    public void printArrayMin(double[] yArray){
        System.out.println("Min element:" + String.format("%.3f", findMin(yArray)) + "\nIndex of element: " + findIndexOfMin(yArray));
    }
}
