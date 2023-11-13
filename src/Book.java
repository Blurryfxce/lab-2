class Book extends Item {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed) {
            setBorrowed(true);
            System.out.println("Книгу '" + getTitle() + "' взято в борг.");
        } else {
            System.out.println("Ця книга вже взята в борг.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            setBorrowed(false);
            System.out.println("Книгу '" + getTitle() + "' повернуто в бібліотеку.");
        } else {
            System.out.println("Ця книга не взята в борг.");
        }
    }
}
