public class Book implements Comparable<Book> {
  public String name;

  public Book(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Book o) {
    return this.name.compareTo(o.name);
  }
}
