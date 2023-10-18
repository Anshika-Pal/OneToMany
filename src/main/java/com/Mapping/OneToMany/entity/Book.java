package com.Mapping.OneToMany.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int book_no;
    private String book_name;
    private String author_name;

    public Book(int book_no, String book_name, String author_name) {
        this.book_no = book_no;
        this.book_name = book_name;
        this.author_name = author_name;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Library{" +
                "book_no=" + book_no +
                ", book_name='" + book_name + '\'' +
                ", author_name='" + author_name + '\'' +
                '}';
    }

    public int getBook_no() {
        return book_no;
    }

    public void setBook_no(int book_no) {
        this.book_no = book_no;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }
}
