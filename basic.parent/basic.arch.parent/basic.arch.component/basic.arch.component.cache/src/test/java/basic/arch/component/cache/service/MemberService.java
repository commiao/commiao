package basic.arch.component.cache.service;

import basic.arch.component.cache.redis.bean.Member;

public interface MemberService {
    
    public void delete(Long memberId);
    
    public Member saveOrUpdateMember(Member member);
    
    public Member saveOrUpdateMemberTimeOut(Member member);
    
    public Member saveOrUpdateMemberThrowException(Member member);
    
    
    public Member findById(Long memberId);
    
    public Member findByIdNoAnnotation(Long memberId);
    
}
