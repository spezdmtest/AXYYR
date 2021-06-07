package Testing_List;

public class Runner {
    public static void main(String[] args) {
    List list = new List();
    list.add(10);
    list.add(20);
    list.add(30);

    list.print();
        System.out.println();
        list.remove();
        list.print();
    }
}
