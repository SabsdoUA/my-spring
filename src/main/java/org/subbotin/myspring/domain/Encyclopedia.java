package org.subbotin.myspring.domain;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "encyclopedia")

public class Encyclopedia extends Literature {

    @NotBlank
    @Column(nullable = false)
    private String edition;

    protected Encyclopedia() {
    }

    public Encyclopedia(Integer id, String genre, int ageLimit, String name, String description, int releaseYear, String linkBook, String edition) {
        super(id, genre, ageLimit, name, description, releaseYear, linkBook);
        this.edition = edition;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
