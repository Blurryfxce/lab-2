import java.util.UUID;
abstract class Item {
    private String title;
    private String uniqueID;
    public boolean isBorrowed;

    public Item(String title) {
        this.title = title;
        this.uniqueID = UUID.randomUUID().toString();
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public abstract void borrowItem();
    public abstract void returnItem();
}
