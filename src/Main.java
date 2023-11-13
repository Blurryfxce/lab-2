
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів Book та DVD
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        DVD dvd1 = new DVD("Inception", 148);

        // Створення об'єкта Patron
        Patron patron1 = new Patron("John Doe", "ID001");

        // Створення об'єкта Library
        Library library = new Library();

        // Додавання предметів до бібліотеки
        library.add(book1);
        library.add(dvd1);

        // Реєстрація читача
        library.registerPatron(patron1);

        // Виведення доступних предметів
        System.out.println("Доступні предмети:");
        library.listAvailable();

        // Взяття в борг та повернення предметів
        library.lendItem(patron1, book1);
        library.lendItem(patron1, dvd1);

        // Виведення взятих в борг предметів
        System.out.println("Взяті в борг предмети:");
        library.listBorrowed();

        // Повернення предмету
        library.returnItem(patron1, book1);

        // Виведення взятих в борг предметів після повернення
        System.out.println("Взяті в борг предмети після повернення:");
        library.listBorrowed();

    }
}