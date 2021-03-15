package Collections;

import java.util.Objects;

class StudentHashSet implements Comparable {
    int id;
    String name;
    public StudentHashSet(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentHashSet that = (StudentHashSet) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Object o) {
        return id - ((StudentHashSet)o).id;
    }

}
