package Collections;

public class Student implements Comparable {
    int id;
    String name;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        return ((Student) o).id - id;
    }
}
