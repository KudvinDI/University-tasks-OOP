package main;

import fileWork.Reader;
import fileWork.Writer;
import lombok.AllArgsConstructor;
import lombok.Data;
import train.SortingTrain;
import train.Train;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class UserInterface {

    public static void interact(){
        List<Train> trainList = new ArrayList<>();
        int input;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("""
                Enter a number of operation:\s
                 1 - Adding new train to list\s
                 2 - Remove train by index\s
                 3 - Read from file\s
                 4 - Write to file\s
                 5 - sortByDestinationAndTimeDeparture\s
                 6 - sortByDestinationAndTime \s
                 7 - sortByDestinationAndAvailableGeneralPlaces\s
                 8 - sortByDestinationAndAllPlacesAvailable\s
                 9 - Show list\s
                 0 - Exit""");
           input = scanner.nextInt();
        switch (input) {
            case (1):
                trainList.add(Train.of(scanner.next()));
                break;

            case (2):
                System.out.println("Input index: ");
                trainList.remove(scanner.nextInt());
                break;
            case (3):
                trainList = Reader.getTrainsFromFile("input.txt");
                break;
            case (4):
                Writer.writeObjectToFile("output.txt", trainList);
                break;
            case (5):
                trainList = SortingTrain.sortByDestinationAndTimeDeparture(trainList, "Lisabon", LocalTime.of(9, 0));
                break;
            case (6):
                trainList = SortingTrain.sortByDestinationAndTime(trainList, "London");
                break;
            case (7):
                trainList = SortingTrain.sortByDestinationAndAvailableGeneralPlaces(trainList, "Praga");
                break;
            case (8):
                trainList = SortingTrain.sortByDestinationAndAllPlacesAvailable(trainList, "Paris");
                break;
            case (9):
                System.out.println(trainList);
                break;
            case (0):
                break;
        }

        }while (input!=0);

    }




}
