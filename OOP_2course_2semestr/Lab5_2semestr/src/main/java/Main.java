import java.io.File;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();

    }
    void run() {
        ArrayReader arrayReader = new ArrayReader();
        ArrayTasks arrayTasks = new ArrayTasks();
        arrayTasks.processArray(arrayReader.readTwoDimensionalArray("lab52.txt"));
        arrayTasks.processArray(arrayReader.readOneDimensionalArray("lab5.txt"));


    }


}

