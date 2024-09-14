package jpabook.jpashop;

import jpabook.jpashop.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

  @Test
  @Transactional
  @Rollback(false) //@Rollback 어노테이션을 사용하면 값을 롤백하지 않는다.
  public void testMember() throws Exception{
      //given
//      Member member = new Member();
//      member.setUsername("membetA");
//
//      //when
//      Long saveId = memberRepository.save(member);
//      Member findMember = memberRepository.find(saveId);
//
//      //then
//
//      Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//      Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//
//      //같은 영속성에서 가져오므로 TRUE 반환
//      Assertions.assertThat(findMember).isEqualTo(member);
//      System.out.println("findMember == member : " + (findMember == member));
  }

}