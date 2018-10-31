package back.practise.practise0816.course_generic;

public class Colour implements Comparable<Colour>{
    protected int count;

    public Colour(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Colour o) {
        return this.count-o.count;
    }

}
