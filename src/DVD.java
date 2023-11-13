class DVD extends Item {
    private int duration;

    public DVD(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed) {
            setBorrowed(true);
            System.out.println("DVD '" + getTitle() + "' взято в борг.");
        } else {
            System.out.println("Це DVD вже взято в борг.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            setBorrowed(false);
            System.out.println("DVD '" + getTitle() + "' повернуто в бібліотеку.");
        } else {
            System.out.println("Це DVD не взято в борг.");
        }
    }
}
