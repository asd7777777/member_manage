package com.feng.mm.controller;

import com.feng.mm.domain.dto.MemberDto;
import com.feng.mm.domain.dto.SearchDto;
import com.feng.mm.domain.entity.Member;
import com.feng.mm.exception.ServiceException;
import com.feng.mm.service.MemberService;
import com.feng.mm.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Resource
    MemberService memberService;

    @GetMapping("/list")
    public ResponseEntity<List<MemberDto>> list(SearchDto searchDto, int limit, int offset) throws ServiceException {
        List<MemberDto> memberDtos = memberService.memberDtoList(searchDto, limit, offset);
        return ResponseEntity.success(memberDtos);
    }

    @PostMapping("/add")
    public ResponseEntity<Integer> add(Member member)  throws ServiceException{
        int count = memberService.addMember(member);
        return ResponseEntity.success(count);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Integer> delete(int mid)  throws ServiceException{
        int count = memberService.deleteMember(mid);
        return ResponseEntity.success(count);
    }

    @PutMapping("/update")
    public ResponseEntity<Integer> update(Member member)  throws ServiceException{
        int count = memberService.updateMember(member);
        return ResponseEntity.success(count);
    }

    @DeleteMapping("/batch_del")
    public ResponseEntity<Integer> deleteBatch(@RequestParam List<Integer> mids)  throws ServiceException{
        int count = memberService.deleteMembers(mids);
        return ResponseEntity.success(count);
    }
}
