package kr.co.dao;

import java.util.List;

import kr.co.vo.ReplyVO;

public interface ReplyDAO {

	// 댓글조회
	public List<ReplyVO> readReply(int bno) throws Exception;
	
	// 댓글 작성
	public void writeReply(ReplyVO vo) throws Exception;
}
