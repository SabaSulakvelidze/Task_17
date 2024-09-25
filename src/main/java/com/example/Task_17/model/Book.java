package com.example.Task_17.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = {"price","genre"})
public class Book {
    private String author;
    private String title;
    private String genre;
    private Integer pages;
    private Double price;
}
