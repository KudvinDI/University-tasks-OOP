

public class Dequeue {

    private final Node[] dequeue;
    private final int size;
    private int indexOfLastElement;

    public Dequeue(int size) {
        this.size = size;
        dequeue = new Node[size];
        indexOfLastElement = -1;
    }

    public void addFirst(String element){
        if(indexOfLastElement < size) {
            if(indexOfLastElement >= 0){
                for(int i=size-1; i>0; i--){
                    dequeue[i]=dequeue[i-1];
                }
                dequeue[0] = new Node(element);
                indexOfLastElement++;

            }
            else {
                firstElement(new Node(element));
            }

        }
        else
            System.out.println("Capacity of dequeue met");

    }
    public void addLast(String element){
        if(indexOfLastElement < size){
            if(indexOfLastElement >= 0){
                dequeue[indexOfLastElement+1] = new Node(element);
                indexOfLastElement++;
            }
            else {
                firstElement(new Node(element));
            }

        }
       else
            System.out.println("Capacity of dequeue met");

    }
    public void removeFirst(){
        if(indexOfLastElement >= 0){
            for(int i=0;i<indexOfLastElement;i++)
            {
                dequeue[i]=dequeue[i+1];
            }
            dequeue[indexOfLastElement] = null;
            indexOfLastElement--;
        }
        else
            System.out.println("Dequeue is empty");

    }
    public void removeLast(){
        if(indexOfLastElement >= 0){
            dequeue[indexOfLastElement] = null;
            indexOfLastElement--;

        }
        else {
            System.out.println("Dequeue is empty");
        }

    }
    private void firstElement(Node element){
         dequeue[0] = element;
         indexOfLastElement=0;

        }

    public String getFirstElement(){
        return dequeue[0].getValue();
    }
    public String getLastElement(){
        return dequeue[indexOfLastElement].getValue();
    }
    public Node[] getDequeue() {
        return dequeue;
    }
}

