package ua.opnu;

public class MyOptional<T> {
    private T value;
    private boolean present;

    public MyOptional() {
        this.value = null;
        this.present = false;
    }

    public MyOptional(T value) {
        if (value == null) {
            throw new IllegalArgumentException("MyOptional не приймає null");
        }
        this.value = value;
        this.present = true;
    }

    public boolean isPresent() {
        return this.present;
    }

    public boolean isEmpty() {
        return !this.present;
    }

    public T get() {
        if (isEmpty()) {
            throw new IllegalStateException("Значення відсутнє");
        }
        return this.value;
    }

    public T orElse(T defaultValue) {
        if (isPresent()) {
            return this.value;
        }
        return defaultValue;
    }

    @Override
    public String toString() {
        if (isPresent()) {
            return "MyOptional[value=" + this.value + "]";
        }
        return "MyOptional[empty]";
    }
}
