package org.subbotin.myspring.domain;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;

@MappedSuperclass
public abstract class Literature {

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank
    @Column(nullable = false)
    private String genre;

    @Min(0)
    @Max(18)
    @Column(nullable = false)
    private int ageLimit;

    @NotBlank
    @Column(nullable = false)
    private String name;

    @NotBlank
    @Column(nullable = false)
    private String description;

    @Min(1)
    @Column(nullable = false)
    private int releaseYear;

    @NotBlank
    @Column(nullable = false)
    private String linkBook;

    protected Literature() {
    }

    public Literature(Integer id, String genre, int ageLimit, String name, String description, int releaseYear, String linkBook) {
        this.id = id;
        this.genre = genre;
        this.ageLimit = ageLimit;
        this.name = name;
        this.description = description;
        this.releaseYear = releaseYear;
        this.linkBook = linkBook;
    }

    public Integer getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLinkBook() {
        return linkBook;
    }

    public void setLinkBook(String linkBook) {
        this.linkBook = linkBook;
    }
}