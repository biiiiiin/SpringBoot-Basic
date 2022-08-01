package com.JPAStudy.JPA.Member;

import javax.persistence.*;

@Entity
@DiscriminatorValue("M")
public class Movie extends Item{
    private String director;
    private String author;
}
