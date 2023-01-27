/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-01-09 02:59:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class kakao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://developers.kakao.com/sdk/js/kakao.min.js\"></script>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<a id=\"kakao-login-btn\"></a>\r\n");
      out.write("	<button class=\"api-btn\" onclick=\"unlinkApp()\">앱 탈퇴하기</button>\r\n");
      out.write("	<div id=\"result\"></div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  function unlinkApp() {\r\n");
      out.write("    Kakao.API.request({\r\n");
      out.write("      url: '/v1/user/unlink',\r\n");
      out.write("      success: function(res) {\r\n");
      out.write("        alert('success: ' + JSON.stringify(res))\r\n");
      out.write("      },\r\n");
      out.write("      fail: function(err) {\r\n");
      out.write("        alert('fail: ' + JSON.stringify(err))\r\n");
      out.write("      },\r\n");
      out.write("    })\r\n");
      out.write("  }\r\n");
      out.write("</script>\r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("Kakao.init('490b24c14cba053c7a8956d1837ee10e');\r\n");
      out.write("console.log(Kakao.isInitialized());\r\n");
      out.write(" \r\n");
      out.write("  Kakao.Auth.createLoginButton({\r\n");
      out.write("    container: '#kakao-login-btn',\r\n");
      out.write("    success: function(authObj) {\r\n");
      out.write("      Kakao.API.request({\r\n");
      out.write("        url: '/v2/user/me',\r\n");
      out.write("        success: function(result) {\r\n");
      out.write("          $('#result').append(result);\r\n");
      out.write("          id = result.id\r\n");
      out.write("          connected_at = result.connected_at\r\n");
      out.write("          kakao_account = result.kakao_account\r\n");
      out.write("          $('#result').append(kakao_account);\r\n");
      out.write("          resultdiv=\"<h2>로그인 성공 !!\"\r\n");
      out.write("          resultdiv += '<h4>id: '+id+'<h4>'\r\n");
      out.write("          resultdiv += '<h4>connected_at: '+connected_at+'<h4>'\r\n");
      out.write("          email =\"\";\r\n");
      out.write("          gender = \"\";\r\n");
      out.write("          if(typeof kakao_account != 'undefined'){\r\n");
      out.write("        	  email = kakao_account.email;\r\n");
      out.write("        	  gender = kakao_account.gender;\r\n");
      out.write("          }\r\n");
      out.write("          resultdiv += '<h4>email: '+email+'<h4>'\r\n");
      out.write("          resultdiv += '<h4>gender: '+gender+'<h4>'\r\n");
      out.write("          $('#result').append(resultdiv);\r\n");
      out.write("          \r\n");
      out.write("        },\r\n");
      out.write("        fail: function(error) {\r\n");
      out.write("          alert(\r\n");
      out.write("            'login success, but failed to request user information: ' +\r\n");
      out.write("              JSON.stringify(error)\r\n");
      out.write("          )\r\n");
      out.write("        },\r\n");
      out.write("      })\r\n");
      out.write("    },\r\n");
      out.write("    fail: function(err) {\r\n");
      out.write("      alert('failed to login: ' + JSON.stringify(err))\r\n");
      out.write("    },\r\n");
      out.write("  })\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
