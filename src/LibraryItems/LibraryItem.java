package LibraryItems;

import java.time.LocalDate;

abstract class LibraryItem {
    private String title;
    private String author;
    private LocalDate publicationDate;
    private int itemID;

    protected boolean isIssued;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    LibraryItem(String title, String author, LocalDate publicationDate, int itemID, boolean isIssued) {
        this.title = author;
        this.author = author;
        this.publicationDate = publicationDate;
        this.itemID = itemID;
        this.isIssued=isIssued;

    }

    abstract void issueItem();


}

