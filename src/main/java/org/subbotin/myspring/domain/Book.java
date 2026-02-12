package org.subbotin.myspring.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "book")
public class Book extends Literature {

    @NotBlank
    @Column(name = "author", nullable = false)
    private String author;

    @Min(1)
    @Column(name = "pages", nullable = false)
    private int pages;

    protected Book() {
    }

    public Book(Integer id, String genre, int ageLimit, String name, String description,
                int releaseYear, String linkBook, String author, int pages) {
        super(id, genre, ageLimit, name, description, releaseYear, linkBook);
        this.author = author;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
