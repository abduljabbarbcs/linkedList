public class Main {

    public static void main(String[] args) {

        System.out.println("Integer Linked List");
        //append linked list elements
        MyLinkedList list = new MyLinkedList();
        list.append(0);
        list.append(2);
        list.append(4);
        //print linked list
        System.out.println(list.toString());
        //remove last element
        list.removeTail();
        //print linked list
        System.out.println(list.toString());
        //remove last element
        list.removeTail();
        //print linked list
        System.out.println(list.toString());
        //append linked list elements
        list.append(2);
        list.append(4);
        //remove all elements from linkedlist
        list.removeAll();
        //print linked list
        System.out.println(list.toString());
    }
}
