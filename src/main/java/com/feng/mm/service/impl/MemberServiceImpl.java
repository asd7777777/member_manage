package com.feng.mm.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.feng.mm.domain.dto.MemberDto;
import com.feng.mm.domain.dto.SearchDto;
import com.feng.mm.domain.entity.Level;
import com.feng.mm.domain.entity.Member;
import com.feng.mm.exception.ServiceException;
import com.feng.mm.mapper.LevelMapper;
import com.feng.mm.mapper.MemberMapper;
import com.feng.mm.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;

    @Resource
    LevelMapper levelMapper;

    @Override
    public List<MemberDto> memberDtoList(SearchDto searchDto, int limit, int offset) {
        List<Member> members = memberMapper.selectAll(searchDto.getKeyword(), searchDto.getCreateDate(), limit, offset);
        List<MemberDto> memberDtos = new ArrayList<>();

        //填充MemberDto
        for (Member member : members) {
            //获取会员的等级名称
            Integer lid = member.getLid();
            Level level = levelMapper.selectById(lid);
            String lname = level.getLname();

            MemberDto memberDto = new MemberDto();
            memberDto.setLname(lname);
            BeanUtils.copyProperties(member, memberDto);

            memberDtos.add(memberDto);
        }
        return memberDtos;
    }

    @Override
    public int addMember(Member member) {
        int count = memberMapper.insertMember(member);
        return count;
    }

    @Override
    public int deleteMember(int mid) {
        int count = memberMapper.deleteMember(mid);
        return count;
    }

    @Override
    public int updateMember(Member member) {
        int count = memberMapper.updateMember(member);
        return count;
    }

    public int deleteMembers(List<Integer> mids) {
        int count = memberMapper.deleteMemberBatch(mids);
        return count;
    }
}
