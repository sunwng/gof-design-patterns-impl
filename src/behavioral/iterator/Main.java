package behavioral.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("aaaa"));
        bookShelf.appendBook(new Book("bbbbbb"));
        bookShelf.appendBook(new Book("cc"));
        bookShelf.appendBook(new Book("dddddddddddd"));

        // 명시적으로 Iterator 사용
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
        System.out.println("====================");

        // 확장 for문 사용
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }

}
