package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {


    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    // 테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

//    @Autowired
//    public void init(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
//        this.memberRepository = memberRepository;
//        this.discountPolicy = discountPolicy;
//    }

    @Autowired(required = false)
    public void setNoBean1(Member member) {
        System.out.println("setNoBean1 = " + member);
    }

//    @Autowired
//    public void setNoBean2(@Nullable Member member) {
//        System.out.println("setNoBean2 = " + member);
//    }

    @Autowired(required = false)
    public void setNoBean3(Optional<Member> member) {
        System.out.println("setNoBean3 = " + member);
    }
}
