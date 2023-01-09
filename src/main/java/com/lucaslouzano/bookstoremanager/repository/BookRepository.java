package com.lucaslouzano.bookstoremanager.repository;

import com.lucaslouzano.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
