package week12.tugasjobsheet;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.addLast(new Book("P01", "Java", 2000));
        list.addLast(new Book("P02", "MySQL", 2005));
        list.addLast(new Book("P03", "Matematika", 1995));
        list.print();
        list.peek().print();
        list.search("MySQL").print();
        //list.removeLast();
        //list.print();
    }
}
