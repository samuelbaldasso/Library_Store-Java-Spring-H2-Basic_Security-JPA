package com.sbaldasso.library_store.repository;

import com.sbaldasso.library_store.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
