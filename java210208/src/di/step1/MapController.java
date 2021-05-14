package di.step1;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MapController extends AbstractController{
	private Map<String,String> mapBean = null;
	//myBatis의 경우 java가 아니고 자바코드는 jar의 형태로 주입되므로 constructor주입법으로 처리해야한다.
	//DBConnection pull도 자바 표준에서 제공하는 것이 아니기 떄문에 constructor 주입법으로 처리해야할 것이다.(xml에서 처리하는 것)
	//setter 객체 주입법 - java에 코딩하는 법.
	public void setMapBean(Map<String,String> mapBean) {
		this.mapBean = mapBean;
	}

	public ModelAndView handleRequestInternal(
			HttpServletRequest req,
			HttpServletResponse rep) {
		ModelAndView mav = new ModelAndView();
		return mav;
	}
}
