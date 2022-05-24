package train;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;


public class SortingTrain {

     public static List<Train> sortByDestinationAndTime(List<Train> trainList, String destination) {
        return trainList.stream()
                .filter(train -> train.getDestination().equals(destination))
                .sorted(Comparator.comparing(Train::getDepartureTime)
                        .thenComparing(Train::getId))
                .collect(Collectors.toList());
    }
    public static List<Train> sortByDestinationAndTimeDeparture(List<Train> trainList, String destination, LocalTime timeDeparture){

         return trainList.stream()
                 .filter(train -> train.getDestination().equals(destination))
                 .filter(train -> train.getDepartureTime().isAfter(timeDeparture))
                 .collect(Collectors.toList());
    }

    public static List<Train> sortByDestinationAndAvailableGeneralPlaces(List<Train> trainList, String destination){
         return trainList.stream()
                 .filter(train -> train.getDestination().equals(destination))
                 .filter(train -> train.getGeneralPlaces()>0)
                 .collect(Collectors.toList());
    }
    public static List<Train> sortByDestinationAndAllPlacesAvailable(List<Train> trainList, String destination){

         return trainList.stream()
                 .filter(train -> train.getDestination().equals(destination))
                 .sorted(Comparator.comparing(train -> train.getPlacPlaces() + train.getCoupePlaces() + train.getGeneralPlaces() + train.getVipPlaces()))
                 .collect(Collectors.toList());
    }
}



