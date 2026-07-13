package io.wkrzywiec.hexagonal.library.domain.inventory.core.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

import java.util.Set;


@Entity
@Table(name = "book")
@EqualsAndHashCode
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private BookIdentification identification;

    @Column(name="title")
    private String title;

    @ManyToMany(fetch = FetchType.EAGER, cascade= {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name="book_author",
            joinColumns=@JoinColumn(name="book_id"),
            inverseJoinColumns=@JoinColumn(name="author_id"))
    private Set<Author> authors;

    @Column(name="publisher")
    private String publisher;

    @Column(name="publishedDate")
    private String publishedDate;

    @Column(name="description", columnDefinition="TEXT")
    private String description;

    @Column(name="page_count")
    private int pages;

    @Column(name="imageLink", columnDefinition="TEXT")
    @EqualsAndHashCode.Exclude
    private String imageLink;

    public Book(BookIdentification identification, String title, Set<Author> authors, String publisher, String publishedDate, String description, int pages, String imageLink) {
        this.identification = identification;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.description = description;
        this.pages = pages;
        this.imageLink = imageLink;
    }

    public Long getIdAsLong(){
        return id;
    }

    private Book() {
    }
}
