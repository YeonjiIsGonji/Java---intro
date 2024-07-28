package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원 저장
    Optional<Member> findById(Long id); // 회원 Id 찾기
    Optional<Member> findByName(String name); // 회원 이름 찾기
    List<Member> findAll(); // 저장된 모든 회원 찾기
}
