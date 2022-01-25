package mes.com.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.AbstractView;

//@Service("msgView")
public class MessageViewResolver extends AbstractView {

	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String msg = (String)model.get("msg");
		String url = (String)model.get("url");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('" + msg + "');");
		out.println("location.href='" + url + "';");
		out.println("</script>");
		
	}

}
