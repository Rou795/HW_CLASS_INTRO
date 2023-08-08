import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author author1 = new Author("Фёдор", "Достоевский", 9);
        Book book1 = new Book("Преступление и наказание", 1866, author1, 574);

        System.out.println("Книга " + book1.title + " стоит: " + book1.estimatePrice());
        System.out.println("Данная книга большая?");
        System.out.println(book1.isBig());
        System.out.println("Введите слово.");
        String word = scanner.next();
        if (book1.matches(word)) {
            System.out.println("Данное слово содержится в этой книге.");
        } else {
            System.out.println("Данное слово не содержится в этой книге.");
        }
    }
}
