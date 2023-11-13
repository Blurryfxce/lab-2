import java.util.UUID;
abstract class Item {
    private String title;
    private String uniqueID;
    private boolean isBorrowed;

    public Item(String title) {
        this.title = title;
        this.uniqueID = UUID.randomUUID().toString();
        this.isBorrowed = false;
    }

    public abstract void borrowItem();
    public abstract void returnItem();
}
