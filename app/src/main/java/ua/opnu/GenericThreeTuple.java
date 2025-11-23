package ua.opnu;

public class GenericThreeTuple<T, V, S> {
    public final T first;
    public final V second;
    public final S third;
    private final GenericTwoTuple<T, V> twoTuple;

    public GenericThreeTuple(T first, V second, S third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.twoTuple = new GenericTwoTuple<>(first, second); // Композиція
    }

    public T getFirst() {
        return twoTuple.first;
    }

    public V getSecond() {
        return twoTuple.second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ')';
    }
}

