package com.JPAStudy.JPA.Member;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class MemberApp {
    public static void main(String[] args) {
        final MemberRepository memberRepository;

        Member member = new Member();
        member.setAge(25);
        member.setName("bin");
        member.setId(1L);
        memberRepository.save(member);
    }
}
