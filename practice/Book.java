package practice;

public class Book {
    String title;
    String author;

    public Book(String t) {
        title = t;
        author = "작자미상";
    }
    public Book(String t, String a) {
        title = t;
        author = a;
    }


    public static void main(String [] args) {
        Book loveStory = new Book("춘향전","남동현");
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}