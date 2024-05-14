package week12.tugasjobsheet;

public class Book {
    String id, title;
    int year;
    public Book(String i, String t, int y){
        id = i;
        title = t;
        year = y;
    }
    void print(){
        System.out.println("Book ID = "+id);
        System.out.println("Title = "+title);
        System.out.println("Prod year = "+year);
    }
}
