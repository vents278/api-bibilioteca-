package com.jean.bibilioteca.Controller;

import com.jean.bibilioteca.Repository.BookRepository;
import com.jean.bibilioteca.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping

    public List<Book> bookList(){
        return bookRepository.findAll();
    }

    @PostMapping

    public Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @PutMapping

    public Book attBook(@PathVariable Long id ,@RequestBody Book book ){
        book.setId(id);
        return  bookRepository.save(book);

    }

    @DeleteMapping

    public void deleteBook(@PathVariable Long id){


        bookRepository.deleteById(id);
    }
}
