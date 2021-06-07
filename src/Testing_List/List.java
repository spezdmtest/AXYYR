package Testing_List;

public class List {
    private Node head;

    public List () {
        head = null;
    }

    private boolean isEmpty() {
         return head == null;
    }

    public void add (int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void remove() {
        head = head.next;
    }


    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
