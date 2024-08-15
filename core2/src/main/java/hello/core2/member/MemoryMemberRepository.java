package hello.core2.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        // store 는 Long 타입의 memberId를 키로 사용하고, Member 객체를 값으로 저장합니다.
        // store.get(memberId)는 memberId라는 키에 해당하는 값을 반환합니다.
        return store.get(memberId);
    }
}
