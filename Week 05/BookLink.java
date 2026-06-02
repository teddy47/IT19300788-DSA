public class BookLink {
    public int bookID;
    public String bookTitle;
    public int copies;
    public BookLink next;

    public BookLink(int bookID, String bookTitle, int copies) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.copies = copies;
    }

    public void displayLink() {
        System.out.println("ID: " + bookID + ", Title: " + bookTitle + ", Copies: " + copies);
    }
}
