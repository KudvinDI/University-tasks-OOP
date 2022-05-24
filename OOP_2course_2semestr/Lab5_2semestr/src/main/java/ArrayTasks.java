public class ArrayTasks implements ArrayProcessor {
    private static final double EPS = 1e-9;
    @Override
    public double calculate(double[] array) {
        double firstPositiveNumber=0;
        double lastPositiveNumber=0;
        for (double i : array) {
            if (i > 0) {
                firstPositiveNumber = i;
                break;
            }
        }
        for (double i : array) {
            if(i>0) {
                lastPositiveNumber=i;
            }

        }
        return firstPositiveNumber-lastPositiveNumber;
    }


    @Override
    public double calculate(double[][] array) {
        double sum=0;
        for(int i =0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if((i>=j & i>= array.length-j) | (i<=j & i<= array.length-j)){
                    if(array[i][j] %3 ==0)
                        sum+=array[i][j];
                }
            }
        }
        return sum;

    }

    @Override
    public void processArray(double[] array) {
        System.out.println("Difference between first and last positive number " + calculate(array));

    }

    @Override
    public void processArray(double[][] array) {
        System.out.println("Sum of painted numbers equals " + calculate(array));

    }
}


