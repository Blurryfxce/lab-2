import java.util.ArrayList;
import java.util.List;

class Patron {
    private String name;
    private String ID;
    private List<Item> borrowedItems;

    public Patron(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.borrowedItems = new ArrayList<>();
    }

    public void borrow(Item item) {
        borrowedItems.add(item);
        System.out.println("Предмет '" + item.getTitle() + "' взято в борг користувачу " + name + ".");
    }

    public void returnItem(Item item) {
        borrowedItems.remove(item);
        System.out.println("Предмет '" + item.getTitle() + "' повернено в бібліотеку користувачем " + name + ".");
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }
}
