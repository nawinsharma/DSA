package LinkedList;

public class LinkedList {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.display();
        list.insertFirst(60);
        list.display();
        list.insertFirst(70);
        list.display();
        list.insertLast(80);
        list.display();
        list.insertLast(90);
        list.display();
        list.insertAtIndex(100, 3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAtIndex(2);
        list.display();
        System.out.println(list.find(30));

    }
}
