/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-01-11 06:58:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import oracle.security.o3logon.a;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("oracle.security.o3logon.a");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\" , initial-scale=\"1\">\r\n");
      out.write("<title>마켓퀄리 로그인</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Login.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

		String userId = null;
		if (session.getAttribute("userId") != null ){ 
			userId = (String)session.getAttribute("userId");
		}
	
      out.write("\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<form method=\"post\" action=\"loginAction.jsp\">\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"logo image\">\r\n");
      out.write("			<img src=\"image/mama.png\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form-group\">\r\n");
      out.write("			<input type=\"text\" class=\"form-control\" name=\"userId\"\r\n");
      out.write("				placeholder=\"아이디\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form-group\">\r\n");
      out.write("			<input type=\"password\" class=\"form-control\" name=\"userPw\"\r\n");
      out.write("				placeholder=\"비밀번호\">\r\n");
      out.write("		</div>\r\n");
      out.write("		");

			if(userId == null) {
		
      out.write("\r\n");
      out.write("		<div class=\"login-button\">\r\n");
      out.write("			<input type=\"submit\" class=\"btn btn-primary form-control\" value=\"로그인\">\r\n");
      out.write("			</button>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		");

			}
		
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"form-check2\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\r\n");
      out.write("				<label class=\"form-check-label\" for=\"exampleCheck1\">로그인 상태\r\n");
      out.write("					유지</label>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
      out.write("	<div class=\"button-login\" align=\"center\">\r\n");
      out.write("		<a id=\"kakao-login-btn\"> </a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<a href=\"javascript:void(0)\" onclick=\"kakaoLogin();\"> <img\r\n");
      out.write("		src=\"//k.kakaocdn.net/14/dn/btqbjxsO6vP/KPiGpdnsubSq3a0PHEGUK1/o.jpg\"\r\n");
      out.write("		width=\"100%\" height=\"100%\" />\r\n");
      out.write("	</a>\r\n");
      out.write("\r\n");
      out.write("	<a href=\"javascript:void(0)\" onclick=\"kakaoLogout();\"> <span>카카오\r\n");
      out.write("			로그아웃</span>\r\n");
      out.write("	</a>\r\n");
      out.write("	<br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<footer class=\"footer\">\r\n");
      out.write("		<div class=\"footer-info\">\r\n");
      out.write("			아이디 찾기 | 비밀번호 찾기 | <a href=\"register.jsp\">회원가입</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<script src=\"https://developers.kakao.com/sdk/js/kakao.min.js\"></script>\r\n");
      out.write("	<!--카카오 qr 스크립트  -->\r\n");
      out.write("	<script>\r\n");
      out.write("		Kakao.init('490b24c14cba053c7a8956d1837ee10e'); //발급받은 키 중 javascript키를 사용해준다.\r\n");
      out.write("		console.log(Kakao.isInitialized()); // sdk초기화여부판단\r\n");
      out.write("		//카카오로그인\r\n");
      out.write("		function kakaoLogin() {\r\n");
      out.write("			Kakao.Auth.login({\r\n");
      out.write("				success : function(response) {\r\n");
      out.write("					Kakao.API.request({\r\n");
      out.write("						url : '/v2/user/me',\r\n");
      out.write("						success : function(response) {\r\n");
      out.write("							console.log(response)\r\n");
      out.write("\r\n");
      out.write("						},\r\n");
      out.write("						fail : function(error) {\r\n");
      out.write("							console.log(error)\r\n");
      out.write("						},\r\n");
      out.write("					})\r\n");
      out.write("				},\r\n");
      out.write("				fail : function(error) {\r\n");
      out.write("					console.log(error)\r\n");
      out.write("				},\r\n");
      out.write("			})\r\n");
      out.write("		}\r\n");
      out.write("		//카카오로그아웃  \r\n");
      out.write("		function kakaoLogout() {\r\n");
      out.write("			if (Kakao.Auth.getAccessToken()) {\r\n");
      out.write("				Kakao.API.request({\r\n");
      out.write("					url : '/v1/user/unlink',\r\n");
      out.write("					success : function(response) {\r\n");
      out.write("						console.log(response)\r\n");
      out.write("					},\r\n");
      out.write("					fail : function(error) {\r\n");
      out.write("						console.log(error)\r\n");
      out.write("					},\r\n");
      out.write("				})\r\n");
      out.write("				Kakao.Auth.setAccessToken(undefined)\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
