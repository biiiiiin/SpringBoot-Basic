package com.biiiiiin.biiiiiin.service;

import com.biiiiiin.biiiiiin.domain.Member;
import com.biiiiiin.biiiiiin.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {
    MemberService memberService;
    MemoryMemberRepository memberRepository;

    @BeforeEach
    public void beforeEach(){
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
    }


    @AfterEach
    public void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void 회원가입() {
        //given
        Member member = new Member();
        member.setName("spring");

        //when
        memberService.join(member);

        //then
        Member findMember = memberService.findOne(member.getId()).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    void 회원_중복_확인(){
        //given
        Member member1 = new Member();
        member1.setName("spring");

        Member member2 = new Member();
        member2.setName("spring");

        //when

        memberService.join(member1);
        assertThrows(IllegalStateException.class, ()->memberService.join(member2));


//        try{
//            memberService.join(member2);
//        }catch (IllegalStateException e){
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//        }
        //then

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}