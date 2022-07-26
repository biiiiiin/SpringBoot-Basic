package com.JPAStudy.JPA.Member;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "MEMBER")
@Entity
public class Member {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Integer age;
}
