package com.chewy.fwd.service;

import java.util.List;

import com.chewy.fwd.vo.MemberVo;

public interface MemberService {
	
	// 이메일 유무 확인
	public List<MemberVo> selectEmail(MemberVo memberVo) throws Exception;
	
	// 비밀번호 변경
	public int changePw(MemberVo memberVo) throws Exception;
	
	// 회원 고유번호 조회
	public int selectNo(MemberVo memberVo) throws Exception;
}
