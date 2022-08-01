package com.JPAStudy.JPA.Member;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberGenerateTest {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void 회원생성(){
        Member member = new Member();
        member.setName("BIN");
        member.setId(1L);
        member.setCity("BUNDANG");
        member.setStreet("수내로 206");
        member.setZipCode("13600");

        memberRepository.save(member);

        Date now = new Date();

        Order order = new Order();
        order.setId(1L);
        order.setMemberId(member.getId());
        order.setOrderDate(now);
        order.setStatus(OrderStatus.ORDER);

        orderRepository.save(order);

        Item item1 = new Item();
        item1.setId(1L);
        item1.setName("Bread");
        item1.setPrice(10000);
        item1.setStockQuantity(1000);

        Item item2 = new Item();
        item2.setId(1L);
        item2.setName("Bread");
        item2.setPrice(10000);
        item2.setStockQuantity(1000);

        itemRepository.save(item1);
        itemRepository.save(item2);

        OrderItem orderItem1 = new OrderItem();
        orderItem1.setId(1L);
        orderItem1.setOrderId(order.getId());
        orderItem1.setItemId(item1.getId());
        orderItem1.setOrderPrice(10000);
        orderItem1.setCount(10);

        OrderItem orderItem2 = new OrderItem();
        orderItem2.setId(1L);
        orderItem2.setOrderId(order.getId());
        orderItem2.setItemId(item1.getId());
        orderItem2.setOrderPrice(10000);
        orderItem2.setCount(10);

        orderItemRepository.save(orderItem1);
        orderItemRepository.save(orderItem2);


//        List<Item> itemList = itemRepository.findAll();
//        for(Item item : itemList){
//            System.out.println("[QWER] item = " + item);
//        }
//
//        List<OrderItem> orderItemList = orderItemRepository.findAll();
//        for(OrderItem orderItem : orderItemList){
//            System.out.println("[QWER] orderItem = " + orderItem);
//        }
    }
}
