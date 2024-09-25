package com.example.Task_17.controller;

import com.example.Task_17.model.Book;
import com.example.Task_17.outsourcedServices.IEvaluationService;
import com.example.Task_17.service.BookShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookShopController {

    @Autowired
    BookShopService bookShopService;

    @Autowired
    @Qualifier("firstEvaluationService")
    IEvaluationService evaluationService;

    /*public BookShopController(BookShopService bookShopService, @Qualifier("firstEvaluationService") IEvaluationService evaluationService) {
        this.bookShopService = bookShopService;
        this.evaluationService = evaluationService;
    }*/

    @GetMapping("/book/{index}")
    public Book getSingleBook(@PathVariable("index") int index) {
        return bookShopService.getBook(index);
    }

    @GetMapping("/book/totalPrice")
    public Double getBooksTotalPrice() {
        return evaluationService.calculateTotalPrice(bookShopService.getAllBooks());
    }

    @GetMapping("/book")
    public List<Book> getAllBook() {
        return bookShopService.getAllBooks();
    }

    @PostMapping("/book")
    public Book addBook(@RequestBody Book book) {
        return bookShopService.addBook(book);
    }

    @PutMapping("/book/{index}")
    public Book updateBook(@PathVariable("index") int index, @RequestBody Book book) {
        return bookShopService.updateBook(index, book);
    }

    @DeleteMapping("/book/{index}")
    public void removeBook(@PathVariable("index") int index) {
        bookShopService.removeBook(index);
    }
}
