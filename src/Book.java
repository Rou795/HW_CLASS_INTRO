public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (this.pages > 500) {
            return true;
        }
        return false;
    }

    public boolean matches(String word) {
        if (this.title.contains(word) | this.author.name.contains(word) |
                this.author.surname.contains(word)) {
            return true;
        }
        return false;
    }

    public int estimatePrice() {
        int price = (int) Math.floor((3 * this.pages) * Math.sqrt(author.rating));
        if (price < 250) {
            return 250;
        } else {
            return price;
        }
    }
}
