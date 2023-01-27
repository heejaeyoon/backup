/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-01-10 02:23:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class top2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("* {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("  font-family: SF Pro KR, SF Pro Display, SF Pro Icons, AOS Icons, Apple Gothic, HY Gulim, MalgunGothic, HY Dotum, Lexi Gulim, Helvetica Neue, Helvetica, Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  padding-top: 6em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/*헤더 이미지*/\r\n");
      out.write("#header img {\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  height: 50px;\r\n");
      out.write("  margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("#header {\r\n");
      out.write("  -moz-align-items: center;\r\n");
      out.write("  -webkit-align-items: center;\r\n");
      out.write("  -ms-align-items: center;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  background: #fff;\r\n");
      out.write("  cursor: default;\r\n");
      out.write("  height: 6em;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  line-height: 6em;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  z-index: 10001;\r\n");
      out.write("  box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.075);\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header nav {\r\n");
      out.write("      position: absolute;\r\n");
      out.write("      top: 0;\r\n");
      out.write("      height: inherit;\r\n");
      out.write("      line-height: inherit;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("#header nav.left {\r\n");
      out.write("      left: 2em;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("#header nav.right {\r\n");
      out.write("        right: 0.5em;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("#header nav .button {\r\n");
      out.write("        padding: 0 2em;\r\n");
      out.write("        height: 3.25em;\r\n");
      out.write("        line-height: 3.25em;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("#header nav a {\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("          display: inline-block;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 980px) {\r\n");
      out.write("  body {\r\n");
      out.write("      padding-top: 44px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #header {\r\n");
      out.write("      height: 44px;\r\n");
      out.write("      line-height: 44px;\r\n");
      out.write("  }   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 480px) {\r\n");
      out.write("\r\n");
      out.write("  #header {\r\n");
      out.write("      min-width: 320px;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("#header .menubar input[type=button]{\r\n");
      out.write("	border : white;\r\n");
      out.write("	background-color : white;\r\n");
      out.write("	cursor : pointer;\r\n");
      out.write("  font-weight: 700;\r\n");
      out.write("  width : 100px;\r\n");
      out.write("  height:50px;\r\n");
      out.write("  font-size : 1rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header .right input:hover{\r\n");
      out.write("  color: white;\r\n");
      out.write("  background-color: black;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/*헤더 검색바*/\r\n");
      out.write("#header .searchbar{\r\n");
      out.write("  margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header .search-form{\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("#header .left button{\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  border: white;\r\n");
      out.write("  height: 40px;\r\n");
      out.write("  width: 50px;\r\n");
      out.write("  background-color: black;\r\n");
      out.write("  color: white;\r\n");
      out.write("  font-size: 1rem;\r\n");
      out.write("}\r\n");
      out.write("#header .left button:hover{\r\n");
      out.write("  color: black;\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#header .left input{\r\n");
      out.write("  border: black;\r\n");
      out.write("  width: 200px;\r\n");
      out.write("  border-bottom: black solid 1px;\r\n");
      out.write("  border-radius: 0;\r\n");
      out.write("  font-size: 1rem;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  height: 34px;\r\n");
      out.write("}\r\n");
      out.write(".menubar>li{\r\n");
      out.write("	display:inline-block;\r\n");
      out.write("}\r\n");
      out.write("/*dropdown*/\r\n");
      out.write("\r\n");
      out.write(".menubar li ul { \r\n");
      out.write("display:none; /* 평상시에는 서브메뉴가 안보이게 하기 */ \r\n");
      out.write("position:absolute; \r\n");
      out.write("background : white;\r\n");
      out.write("width : 110px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(".menubar li:hover ul{ \r\n");
      out.write("	display:block;\r\n");
      out.write("	\r\n");
      out.write(" /* 마우스 커서 올리면 서브메뉴 보이게 하기 */ }\r\n");
      out.write("\r\n");
      out.write(".menubar>li>a:hover{\r\n");
      out.write("	background : black;\r\n");
      out.write("	color:white;\r\n");
      out.write("} \r\n");
      out.write(".menubar a{\r\n");
      out.write("	color : black;\r\n");
      out.write("  font-weight: 700;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".menubar ul>a{\r\n");
      out.write("	color : black;\r\n");
      out.write("	transition: 0.5s; \r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" .menubar ul:hover a{        /*메인효과1*/\r\n");
      out.write("            opacity: 0.3;   \r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write(".menubar ul>a:hover {        /*메인효과2 : 특정 a만 밝게*/\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("        }\r\n");
      out.write(" </style>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"top2.css\">\r\n");
      out.write("<nav class=\"left\">\r\n");
      out.write("   \r\n");
      out.write("           <div class=\"search_bar\">\r\n");
      out.write("                 <form  name=\"frm_search\" role=\"search\" method=\"get\" class=\"search-form\" >\r\n");
      out.write("                     <input type=\"search\" class=\"search-field\" placeholder=\"상품명\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.findStr }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"findStr\" />\r\n");
      out.write("                    <button type=\"submit\"  name=\"btnFind\" class=\"search-submit\" onClick=\"openPop();\">검색</button>\r\n");
      out.write("               <input type=\"hidden\" name=\"search\" value=\"select\">\r\n");
      out.write("               \r\n");
      out.write("               <a href =\"");
      out.print(request.getContextPath() );
      out.write("/main.jsp\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/image/mama.png\"/></a>\r\n");
      out.write("                 </form>\r\n");
      out.write("            </div> \r\n");
      out.write("  \r\n");
      out.write("        </nav>\r\n");
      out.write("        \r\n");
      out.write("          <nav class=\"right\">\r\n");
      out.write("         <div class = \"menubar\">\r\n");
      out.write("               <li>\r\n");
      out.write("                  <a href=\"");
      out.print(request.getContextPath() );
      out.write("/intro/intro.jsp\" class=\"button alt\">소개</a>\r\n");
      out.write("                  <ul>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/intro/intro.jsp\" >회사소개</a>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/intro/vision.jsp\" >회사비전</a>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                  <a href=\"");
      out.print(request.getContextPath() );
      out.write("/notice/notice.jsp\" class=\"button alt\">커뮤니티</a>\r\n");
      out.write("                  <ul>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/notice/notice.jsp\" >공지사항</a>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/event/event.jsp\" >이벤트</a>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/review.do?job=select\" >리뷰 게시판</a>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                  <a href=\"");
      out.print(request.getContextPath() );
      out.write("/inquiry.do?job=select\" class=\"button alt\">고객지원</a>\r\n");
      out.write("                  <ul>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/inquiry.do?job=select\">QnA게시판</a>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/faqbook.do?qa=selectFaq\">FAQ</a></br>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/cs_center/cs_func_page.jsp?func=../cs_center/cs_map.jsp\" >오시는 길</a>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </li>\r\n");
      out.write("               \r\n");
      out.write("              \r\n");
      out.write("               \r\n");
      out.write("              	");

				String admin = (String)session.getAttribute("adminOk");
				if(admin !=null){
				
      out.write(" \r\n");
      out.write("               <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/admin/admin_index.jsp\" class=\"button alt\">관리자</a></li>  \r\n");
      out.write("                <li><input type='button' id='btnLogout' value='로그아웃' /></li>         \r\n");
      out.write("               ");
}else if( session.getAttribute("member_mid")== null){ //mid의 속성이 없으면 로그인 이전화면
               
      out.write("            \r\n");
      out.write("               <li>\r\n");
      out.write("                  <a href=\"");
      out.print(request.getContextPath() );
      out.write("/UsersJoin/agree.jsp\" class=\"button alt\">회원가입</a>     \r\n");
      out.write("               </li>\r\n");
      out.write("               <li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/login/loginfo.jsp\" class=\"button alt\">로그인</a></li>  \r\n");
      out.write("               ");
} else {
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("                  <a href=\"");
      out.print(request.getContextPath() );
      out.write("/mypage/mypage\" class=\"button alt\">마이룸</a>\r\n");
      out.write("                  <ul>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/mypage/cart.jsp\" >장바구니</a>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/mypage/orderlist.jsp\" >주문내역</a>\r\n");
      out.write("                     <a href=\"");
      out.print(request.getContextPath() );
      out.write("/mypage/coupon.jsp\" >쿠폰함</a>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </li>\r\n");
      out.write("                <li><input type='button' id='btnLogout' value='로그아웃' /></li>         \r\n");
      out.write("                ");
} 
      out.write("         \r\n");
      out.write("           </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
