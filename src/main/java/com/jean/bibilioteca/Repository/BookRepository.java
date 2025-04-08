package com.jean.bibilioteca.Repository;

import com.jean.bibilioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long> {
}
