package ua.opnu;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    public double getRating() {
        if (reviews == 0)  {
            return 0.0;
        }
        return total / reviews;
    }

    @Override
    public String toString() {
        return String.format("Книга '%s', Рейтинг: %.2f", title, getRating());
    }

    @Override
    public int compareTo(BookData other) {
        double thisRating = this.getRating();
        double otherRating = other.getRating();

        if (thisRating > otherRating) {
            return -1; // "Менша" книга (кращий рейтинг)
        }
        if (thisRating < otherRating) {
            return 1; // "Більша" книга (гірший рейтинг)
        }

        // Якщо рейтинги рівні, то порівнюємо назви
        return this.title.compareTo(other.title);
    }
}
