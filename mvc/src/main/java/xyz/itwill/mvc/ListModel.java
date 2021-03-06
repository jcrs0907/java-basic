package xyz.itwill.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import xyz.itwill.dto.UserinfoDTO;
import xyz.itwill.service.UserinfoService;

//클라이언트가 [/list.do]를 요청한 경우 동작되는 모델 클래스
// => 로그인 사용자만 요청 가능하도록 권한 설정
// => USERINFO 테이블에 저장된 모든 회원정보를 검색하여 Request Scope의 속성값으로 저장
// => [user_list.jsp]로 포워드 이동하기 위한 정보 반환
public class ListModel implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ActionForward actionForward=new ActionForward();
		try {
			HttpSession session=request.getSession();
			UserinfoDTO loginUserinfo=(UserinfoDTO)session.getAttribute("loginUserinfo");
			if(loginUserinfo==null) {
				throw new Exception();
			}
			
			//USERINFO 테이블에 저장된 모든 회원정보를 검색하여 반환하는 Service 클래스의 메소드 호출
			// => 반환받아 결과(회원목록)를 뷰(JSP)에서 출력하도록 Request Scope의 속성값으로 저장
			request.setAttribute("userinfoList", UserinfoService.getService().getUserinfoList());
			
			actionForward.setForward(true);
			actionForward.setPath("model_two/user_list.jsp");
		} catch (Exception e) {
			System.out.println("[예외]메세지 = "+e.getMessage());
			actionForward.setForward(false);
			actionForward.setPath("error.do");
		}
		return actionForward;
	}
}
