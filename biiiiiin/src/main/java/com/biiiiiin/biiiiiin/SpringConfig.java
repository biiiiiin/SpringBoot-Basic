package com.biiiiiin.biiiiiin;

import com.biiiiiin.biiiiiin.repository.JdbcTemplateMemberRepository;
import com.biiiiiin.biiiiiin.repository.MemberRepository;
import com.biiiiiin.biiiiiin.repository.MemoryMemberRepository;
import com.biiiiiin.biiiiiin.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


//이렇게 bean에 서비스와 레포를 넣어 둔다.
@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        //return new MemoryMemberRepository();
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
