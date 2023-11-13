import java.util.List;

interface IManageable {
    void add(Item item);
    void remove(Item item);
    void listAvailable();
    void listBorrowed();
}

