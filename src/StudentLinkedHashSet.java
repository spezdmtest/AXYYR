import java.util.Objects;

public class StudentLinkedHashSet {
    int id;
    String name;

    public StudentLinkedHashSet(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentLinkedHashSet that = (StudentLinkedHashSet) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
