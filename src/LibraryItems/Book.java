package LibraryItems;

import java.time.LocalDate;

abstract class Book extends LibraryItem implements Searchable{
    private int pageCount;
    private String ISBN;


    public Book(String title, String author, LocalDate publicationDate, int itemID, int pageCount, String ISBN, boolean issued) {
        super(title, author, publicationDate, itemID, issued);
        this.pageCount = pageCount;
        this.ISBN = ISBN;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    @Override
    void issueItem() {
        if (isIssued()) {
            System.out.println("The Book is already issued.");
        } else {
            System.out.println("Book issued.");
            setIssued(true);
        }
    }

    @Override
    public boolean matchesKeyword(String keyword) {
        return getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                getAuthor().toLowerCase().contains(keyword.toLowerCase());
    }



}
