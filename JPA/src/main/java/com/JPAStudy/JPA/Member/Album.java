package com.JPAStudy.JPA.Member;

import javax.persistence.*;

@Entity
@DiscriminatorValue("A")
public class Album extends Item{
    private String artist;
    private String etc;
}
