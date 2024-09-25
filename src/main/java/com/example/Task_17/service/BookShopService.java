package com.example.Task_17.service;

import com.example.Task_17.model.Book;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookShopService {

    private static final List<Book> books = new ArrayList<>();

    @PostConstruct
    public void addFirstBook(){
        books.add(new Book("Three Musketeers","Alexandre Dumas","Adventure",750,50.0));
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    public Book updateBook(int index, Book book) {
        if (index < books.size() && index > -1) {
            Book oldBook = books.get(index);
            oldBook.setAuthor(book.getAuthor());
            oldBook.setTitle(book.getTitle());
            oldBook.setGenre(book.getGenre());
            oldBook.setPages(book.getPages());
            oldBook.setPrice(book.getPrice());
        }
        return book;
    }

    public void removeBook(int index){
        books.remove(index);
    }
}
