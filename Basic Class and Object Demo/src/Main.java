class book{
    String title;
    String author;
    int price;
    void display(){
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        book b1 = new book();
        book b2 = new book();

        b1.title = "C programming ";
        b1.author = "Rafee ";
        b1.price = 2000;
        b1.display();
        b2.title = "JAVA";
        b2.author = "Rahad";
        b2.price = 1000;
        b2.display();
    }

}