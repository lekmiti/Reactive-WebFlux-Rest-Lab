package com.lekmiti.reativewebfluxlab;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@Slf4j
public class initDataConfig {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void initData() {
    log.info("initialize data in database");
        List<Book> books = Arrays.asList(
                Book.builder().title("Effective Java").build(),
                Book.builder().title("Design Pattern").build(),
                Book.builder().title("Domain Driven Design").build()
        );
        bookRepository.saveAll(new ArrayList<>(books));
    log.info("data initialized successfully");
    }
}
