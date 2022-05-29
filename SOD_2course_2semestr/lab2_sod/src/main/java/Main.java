import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i;
        Dequeue dequeue = new Dequeue(5);
        do{
            System.out.println("Choose operation: " +
                    "1 - add to Start " +
                    "2 - add to End " +
                    "3 - delete from Start " +
                    "4 - delete from End " +
                    "5 - show Start " +
                    "6 - show Last " +
                    "7 - show dequeue ");
            i=scanner.nextInt();
            scanner.nextLine();
            switch (i){
                case (1):
                    dequeue.addFirst(scanner.nextLine());
                    break;
                case (2):
                    dequeue.addLast(scanner.nextLine());
                    break;
                case (3):
                   dequeue.removeFirst();
                    break;
                case (4):
                    dequeue.removeLast();
                    break;
                case (5):
                    System.out.println(dequeue.getFirstElement());
                    break;
                case (6):
                    System.out.println(dequeue.getLastElement());
                    break;
                case (7):
                    System.out.println(Arrays.toString(dequeue.getDequeue()));
                case (0):
                    break;
            }


        }while(i!=0);
    }
}