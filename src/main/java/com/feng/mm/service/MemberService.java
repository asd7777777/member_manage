package com.feng.mm.service;

import com.feng.mm.domain.dto.MemberDto;
import com.feng.mm.domain.dto.SearchDto;
import com.feng.mm.domain.entity.Member;
import com.feng.mm.exception.ServiceException;

import java.util.List;

public interface MemberService {
    List<MemberDto> memberDtoList(SearchDto searchDto, int limit, int offset) throws ServiceException;

    int addMember(Member member) throws ServiceException;

    int deleteMember(int mid) throws ServiceException;

    int updateMember(Member member) throws ServiceException;

    int deleteMembers(List<Integer> mids) throws ServiceException;
}
