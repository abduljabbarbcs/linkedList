import java.util.LinkedList;

public class MyLinkedList {

    private LinkedList<Integer> list;
    //create linked list integer object
    public MyLinkedList () {
        this.list = new LinkedList<Integer>();
    }
    //append a number to linked list
    public void append(int number){
        this.list.addLast(number);
    }
    //remove last number
    public void removeTail(){
        this.list.removeLast();
    }
    //remove all numbers in linked list
    public void removeAll(){
        this.list.removeAll(this.list);
    }
    //return string representation of object
    @Override
    public String toString() {
        return list.toString();
    }
}
