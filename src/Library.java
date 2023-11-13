import java.util.ArrayList;
import java.util.List;

class Library implements IManageable {
    private List<Item> items;
    private List<Patron> patrons;

    // Конструктор
    public Library() {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Реалізація методів інтерфейсу IManageable

    @Override
    public void add(Item item) {
        items.add(item);
        System.out.println("Предмет '" + item.getTitle() + "' додано до бібліотеки.");
    }

    @Override
    public void remove(Item item) {
        items.remove(item);
        System.out.println("Предмет '" + item.getTitle() + "' видалено з бібліотеки.");
    }

    @Override
    public void listAvailable() {
        System.out.println("Доступні предмети в бібліотеці:");
        for (Item item : items) {
            if (!item.isBorrowed) {
                System.out.println(item.getTitle());
            }
        }
    }

    @Override
    public void listBorrowed() {
        System.out.println("Взяті в борг предмети:");
        for (Patron patron : patrons) {
            List<Item> borrowedItems = patron.getBorrowedItems();
            for (Item item : borrowedItems) {
                System.out.println(item.getTitle() + " (взято в борг користувачем " + patron.getName() + ")");
            }
        }
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Користувача " + patron.getName() + " зареєстровано в бібліотеці.");
    }

    public void lendItem(Patron patron, Item item) {
        if (items.contains(item) && !item.isBorrowed) {
            item.borrowItem();
            patron.borrow(item);
        } else {
            System.out.println("Предмет '" + item.getTitle() + "' недоступний для взяття в борг.");
        }
    }

    public void returnItem(Patron patron, Item item) {
        if (items.contains(item) && item.isBorrowed && patron.getBorrowedItems().contains(item)) {
            item.returnItem();
            patron.returnItem(item);
        } else {
            System.out.println("Предмет '" + item.getTitle() + "' не може бути повернутий.");
        }
    }
}
