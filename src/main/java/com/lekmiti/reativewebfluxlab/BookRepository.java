package com.lekmiti.reativewebfluxlab;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
