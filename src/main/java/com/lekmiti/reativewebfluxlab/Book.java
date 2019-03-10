package com.lekmiti.reativewebfluxlab;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Builder
@Entity
public class Book {
    @Id
    private String title;
    private String author;
    private int year;
    private float cost;

    @Tolerate
    public Book() {
    }
}
