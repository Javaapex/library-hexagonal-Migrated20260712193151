package io.wkrzywiec.hexagonal.library.domain.user.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "library_user")
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    @Embedded
    private EmailAddress emailAddress;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    public User(EmailAddress emailAddress, String firstName, String lastName) {
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getIdentifierAsLong(){
        return id;
    }

    private User(){}
}
