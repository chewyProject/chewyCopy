package com.chewy.fwd.dao;

import java.util.List;

import com.chewy.fwd.vo.MemberVo;

public interface MemberDao {

	public List<MemberVo> selectEmail(MemberVo memberVo) throws Exception;
	
	public void changePw(MemberVo memberVo) throws Exception;
	
	public List<MemberVo> selectNo(MemberVo memberVo) throws Exception;
}
