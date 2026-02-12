package org.subbotin.myspring.domain;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "manga")
public class Manga extends Literature {

    @NotBlank
    @Column(nullable = false)
    private String illustrator;

    @Min(1)
    @Column(nullable = false)
    private int volumes;

    protected Manga() {
    }

    public Manga(Long id, String genre, int ageLimit, String name, String description, int releaseYear, String linkBook, String illustrator, int volumes) {
        super(id, genre, ageLimit, name, description, releaseYear, linkBook);
        this.illustrator = illustrator;
        this.volumes = volumes;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }
}