package methods;

public class Book {
// Attributes
  private String title;
  private String author;
  private int pages;

  // Constructor
    public Book(String t, String a, int p) {
      this.title = t;
      this.author = a;
      this.pages = p;
    }

    // Getters and Setters

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

    public int getPages() {
      return pages;
    }

    public void setPages(int pages) {
      this.pages = pages;
    }

    // toString method

  @Override
  public String toString() {
    return "Book{" +
        "title:'" + title + '\'' +
        ", author:'" + author + '\'' +
        ", pages:" + pages +
        '}';
  }

  // Other Methods
  public void printBookInfo(){
    System.out.println("Title: "+ title);
    System.out.println("Author: "+ author);
    System.out.println("Pages: "+ pages);
  }
}
