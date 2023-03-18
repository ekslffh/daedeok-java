package controller;

import java.util.List;
import dao.MemberDAO;
import dto.MemberDTO;

public class MemberController {
	
	private MemberDAO dao = new MemberDAO();
	
	public void selectList() {
		List<MemberDTO> list = dao.selectList();
		for (MemberDTO dto : list) {
			System.out.println(dto);
		}
	}

}
