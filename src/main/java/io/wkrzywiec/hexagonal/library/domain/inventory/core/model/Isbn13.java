package io.wkrzywiec.hexagonal.library.domain.inventory.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Embeddable
public class Isbn13 {

    @Column(name="isbn_13")
    private String value;

    public Isbn13(String value) {
        if (value.matches("\\d{13}")){
            this.value = value;
        } else {
            throw new IllegalArgumentException("ISBN-13 should have 10 digits only.");
        }
    }

    private Isbn13() {
    }

    public String getAsString(){
        return value;
    }
}
