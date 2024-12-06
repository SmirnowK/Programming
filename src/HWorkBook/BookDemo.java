package HWorkBook;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Djuma", "Tri muwketjora", 547, "457-564-954",true);

        System.out.println(book1);

        Book book2 = new Book("Zhull Vern", "Deit");

        System.out.println(book2);

        BookUtil util = new BookUtil();

        util.editBookCatalogNumber("545-655-245",book2);
        util.editBookPageNumber(250, book2);
        util.editBookIsInstorage(true,book2);

        System.out.println("============");

        System.out.println(book2);
        System.out.println(book1);

        System.out.println("=========");

        Book book3 = book1;  // ne rabotaet, a kopiruetsja ssylka!!!
        System.out.println(book3);

        book3.name = "Dartnajn";
        System.out.println(book3);

        // kaka ranotaet naw metod copy

        Book book4 = util.copyBook(book2);

        System.out.println(book4);

    }
}
