package LibraryItems;

import java.time.LocalDate;

public class Magazine extends LibraryItem implements Searchable{
    private int issueNumber;
	private String genre;

    public Magazine(String title, String author, LocalDate publicationDate, int itemID, int issueNumber, String genre, boolean isIssued) {
        super(title, author, publicationDate, itemID, isIssued);
        this.issueNumber=issueNumber;
        this.genre=genre;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    void issueItem() {
        if (isIssued()){
            System.out.println("The Magazine is already issued.");
        }
        else {
            System.out.println("Magazine issued.");
            setIssued(true);
        }
    }


    @Override
    public boolean matchesKeyword(String keyword) {
        return getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                getAuthor().toLowerCase().contains(keyword.toLowerCase());
    }


}
