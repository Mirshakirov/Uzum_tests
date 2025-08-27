package uzum.tasks;

import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private String author;
    private int totalPageCount;
    private boolean isHardCover;

    public Book(String title, String author, int totalPageCount, boolean isHardCover) {
        this.title = title;
        this.author = author;
        this.totalPageCount = totalPageCount;
        this.isHardCover = isHardCover;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalPageCount=" + totalPageCount +
                ", isHardCover=" + isHardCover +
                '}';
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }


}
