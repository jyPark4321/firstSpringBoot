package com.example.hellospring.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>(); //store 생성
    @Override
    public void save(Member member) {
        store.put(member.getId(),member); //저장기능 구현
    }

    @Override
    public Member findById(Long memberId) {

        return store.get(memberId); //값 가져오기 구현
    }
}
