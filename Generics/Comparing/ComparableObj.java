package Generics.Comparing;

class ComparableObj implements Comparable<ComparableObj> {
    int roll;
    float marks;

    ComparableObj(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(ComparableObj o) {
        int diff = (int) (this.marks = o.marks);

        return diff;
    }
}
