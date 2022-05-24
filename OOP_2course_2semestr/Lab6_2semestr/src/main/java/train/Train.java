package train;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalTime;


@Data
@AllArgsConstructor
public class Train {
    int id;
    String destination;
    int trainNumber;
    LocalTime departureTime;
    int generalPlaces;
    int coupePlaces;
    int placPlaces;
    int vipPlaces;

    public static Train of(String s) {
        String[] split = s.split(" ");
        return new Train(Integer.parseInt(split[0]), split[1], Integer.parseInt(split[2]), LocalTime.of(Integer.parseInt(split[3]), Integer.parseInt(split[4])),
                 Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]) );

    }
    @Override
    public String toString() {
        return "Train  " +
                "destination='" + destination + '\'' +
                ", numberOfTrain='" + id + '\'' +
                ", timeOfDelation=" + departureTime +
                ", generalPlaces=" + generalPlaces +
                ", coupePlaces=" + coupePlaces +
                ", placPlaces=" + placPlaces +
                ", vipPlaces=" + vipPlaces + "\n";
                }
    }

