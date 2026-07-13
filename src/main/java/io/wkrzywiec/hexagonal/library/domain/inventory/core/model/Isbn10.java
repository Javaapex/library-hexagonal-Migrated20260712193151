package io.wkrzywiec.hexagonal.library.domain.inventory.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Embeddable
public class Isbn10 {
    @Column(name="isbn_10")
    private String value;

    public Isbn10(String value) {
        if (value.matches("\\d{10}")){
            this.value = value;
        } else {
            throw new IllegalArgumentException("ISBN-10 should have 10 digits only.");
        }
    }

    private Isbn10() {
    }

    public String getAsString(){
        return value;
    }
}
