package com;

import java.util.HashMap;
import java.util.Map;


class Book {
    String author;
    String name;
}

class Ticket {
    int number;
    String libraryName;
    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ticket ticket = (Ticket) obj;
        return number == ticket.number;
    }
}

public class Main extends Object {
    public static void main(String[] args) {
        Book book = new Book();
        Ticket ticket = new Ticket();
        ticket.number = 123;

        book.author = "Karnegi";
        book.name = "How to get friends";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 123;

        Book karnegiBook = library.get(ticket2);
        System.out.println(karnegiBook.author);
       /* System.out.println(book.hashCode());
        System.out.println(new Book().hashCode());*/

    }


}
