package xyz.itwill10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import xyz.itwill10.dao.PointBoardDAO;
import xyz.itwill10.dao.PointUserDAO;
import xyz.itwill10.dto.PointBoard;
import xyz.itwill10.dto.PointUser;

@Service
public class PointBoardServiceImpl implements PointBoardService {
	@Autowired
	private PointBoardDAO pointBoardDAO;
	
	@Autowired
	private PointUserDAO pointUserDAO;

	//�Խñ� ������ ���޹޾� POINTBOARD ���̺� �����Ͽ� �����ϰ� �ۼ��� ������ ��ȯ�ϴ� �޼ҵ�
	// => �Խñ� �ۼ��ڸ� �����Ͽ� POINTUSER ���̺� ����� ������� ����Ʈ�� �����ǵ��� �ۼ�
	//@Transactional : �޼ҵ忡�� ���ܰ� �߻��� ��� ���� �߻��� ����� ��� SQL ����� �ѹ�
	//ó���ϴ� ������̼� 
	// => root-context ���Ͽ� tx NameSpace�� annotation-driven ������Ʈ ����
	// => INSERT, UPDATE, DELETE ��� ���� DAO Ŭ������ �޼ҵ带 ȣ���ϴ� Service Ŭ������ �޼ҵ忡 ����
	@Transactional
	@Override
	public PointUser addPointBoard(PointBoard board) {
		pointBoardDAO.insertPointBoard(board);
		
		//�Խñ� �ۼ��ڰ� POINTUSER ���̺� ����� ����ڰ� �ƴ� ��� ���� �߻� 
		if(pointUserDAO.selectPointUser(board.getWriter())==null) {
			throw new RuntimeException("�Խñ� �ۼ��ڰ� �������� �ʽ��ϴ�.");
		}
		
		pointUserDAO.updatePlusPointUser(board.getWriter());
		
		return pointUserDAO.selectPointUser(board.getWriter());
	}

	//�Խñ� ��ȣ�� ���޹޾� POINTBOARD ���̺� ����� �Խñ��� �����ϰ� �ۼ��� ������ ��ȯ�ϴ� �޼ҵ�
	// => �Խñ� �ۼ��ڸ� �����Ͽ� POINTUSER ���̺� ����� ������� ����Ʈ�� ���ҵǵ��� �ۼ�
	@Transactional
	@Override
	public PointUser erasePointBoard(int num) {
		PointBoard board=pointBoardDAO.selectPointBoard(num);
		//������ �Խñ��� �������� �ʴ� ��� ���� �߻�
		if(board==null) {
			throw new RuntimeException("�Խñ��� �������� �ʽ��ϴ�.");
		}
		
		pointBoardDAO.deletePointBoard(num);
		
		pointUserDAO.updateMinusPointUser(board.getWriter());
		
		return pointUserDAO.selectPointUser(board.getWriter());
	}

	//POINTBOARD ���̺� ����� ��� �Խñ��� �˻��Ͽ� ��ȯ�ϴ� �޼ҵ�
	@Override
	public List<PointBoard> getPointBoardList() {
		return pointBoardDAO.selectPointBoardList();
	}
}
