package com.JPAStudy.JPA.Member;

import javax.persistence.*;

@Entity
@DiscriminatorValue("B")
public class Book extends Item{
    private String author;
    private String isbn;
}
