package com.feng.mm.mapper;

import com.feng.mm.domain.dto.MemberDto;
import com.feng.mm.domain.dto.SearchDto;
import com.feng.mm.domain.entity.Member;
import com.feng.mm.exception.DaoException;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface MemberMapper {
    List<Member> selectAll(@Param("keyword") String keyword,@Param("createDate") String createDate, @Param("limit") int limit, @Param("offset") int offset) throws DaoException;

    int insertMember(@Param("member") Member member) throws DaoException;

    int deleteMember(@Param("mid") int mid) throws DaoException;

    int updateMember(@Param("member") Member member) throws DaoException;

    int deleteMemberBatch(@Param("mids") List<Integer> mids) throws DaoException;
}
