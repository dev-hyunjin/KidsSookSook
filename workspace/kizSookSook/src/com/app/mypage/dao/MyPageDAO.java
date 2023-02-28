package com.app.mypage.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.app.member.domain.MemberDTO;
import com.app.mybatis.config.MyBatisConfig;

public class MyPageDAO {
	public SqlSession sqlSession;
	
	public MyPageDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

//	체험학습 구매 목록 조회
//	public findPurchaseList() {
//		sqlSession.selectOne(null)
//	}
	
//	내정보 불러오기
	public MemberDTO myInfoAllSelect(Long userId) {
		return sqlSession.selectOne("member.myInfoAllSelect", userId);
	}
	
	/*
	 * public BoardDTO select(Long boardId) { return
	 * sqlSession.selectOne("board.select", boardId); }
	 */
}