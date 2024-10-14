package A0.연습장;

public class ZFA_Product<T,M> {
    private T name;
    private M year;

    public void setName(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setYear(M year) {
        this.year = year;
    }

    public M getYear() {
        return year;
    }
}
