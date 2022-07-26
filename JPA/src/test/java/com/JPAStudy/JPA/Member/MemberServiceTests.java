package com.JPAStudy.JPA.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void saveMemberTest(){
        //given
        Member member1 = new Member();
        member1.setName("bin");
        member1.setAge(25);
        member1.setId(1L);
        memberRepository.save(member1);
        member1.setAge(27);

        Member member2 = new Member();
        member2.setName("jin");
        member2.setAge(20);
        member2.setId(2L);
        memberRepository.save(member2);



//        //when
        List<Member> memberList = memberRepository.findAll();
//
//        //then
        for(Member member : memberList){
            System.out.println("[QWER]" + member);
        }

        Member findMember = memberRepository.findById(2L).get();
        System.out.println(findMember);
    }
}
