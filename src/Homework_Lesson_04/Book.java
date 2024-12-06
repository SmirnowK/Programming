package Homework_Lesson_04;

public class Book {

     String author;
     String name;
     int page;
     String catalog;
     boolean storageHands;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public Book(String author, String name, int page, String catalog, boolean storageHands) {
        this.author = author;
        this.name = name;
        this.page = page;
        this.catalog = catalog;
        this.storageHands = storageHands;
    }

    public String isOnStorageHands() {
        if (storageHands) {
            return "On hands";
        } else {
            return "In storage";
        }
    }
    @Override
    public String toString() {
        return "entity.Book{" +
                "Author:" + author +
                ", Name:" + name +
                ", Page:" + page +
                ", Catalognummber:" + catalog +
                ", " + isOnStorageHands() +
                '}';
    }
}

