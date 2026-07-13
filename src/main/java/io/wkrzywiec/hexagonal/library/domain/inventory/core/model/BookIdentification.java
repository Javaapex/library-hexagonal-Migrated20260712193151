package io.wkrzywiec.hexagonal.library.domain.inventory.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class BookIdentification {

    @Column(name="book_external_id")
    private String bookExternalId;

    @Embedded
    private Isbn10 isbn10;

    @Embedded
    private Isbn13 isbn13;

    public BookIdentification(String bookExternalId, Isbn10 isbn10, Isbn13 isbn13) {
        this.bookExternalId = bookExternalId;
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
    }

    private BookIdentification() {
    }
}
