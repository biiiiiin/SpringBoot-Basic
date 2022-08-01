package com.JPAStudy.JPA.Member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Long itemId;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Long orderId;

    private int orderPrice;
    private int count;

    @ManyToOne
    @JoinColumn(name = "order_order_id")
    private Order order;

}
