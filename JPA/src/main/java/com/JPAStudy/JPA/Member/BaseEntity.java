package com.JPAStudy.JPA.Member;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    private Date createDate;
    private Date lastModifiedDate;
}
