/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-01-10 00:52:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import my.shop.CategoryBean2;
import my.shop.CategoryDao2;
import my.shop.CategoryBean;
import java.util.ArrayList;
import my.shop.CategoryDao;
import my.member.MemberBean;
import my.member.MemberDao;

public final class main_005ftop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("my.shop.CategoryDao");
    _jspx_imports_classes.add("my.member.MemberBean");
    _jspx_imports_classes.add("my.shop.CategoryBean");
    _jspx_imports_classes.add("my.member.MemberDao");
    _jspx_imports_classes.add("my.shop.CategoryDao2");
    _jspx_imports_classes.add("my.shop.CategoryBean2");
    _jspx_imports_classes.add("java.util.ArrayList");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(" /* select */\n");
      out.write(".pl{\n");
      out.write("    width: 200px;\n");
      out.write("    border: 1px solid #C4C4C4;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    padding: 12px 13px;\n");
      out.write("    font-family: 'Roboto';\n");
      out.write("    font-style: normal;\n");
      out.write("    font-weight: 400;\n");
      out.write("    font-size: 14px;\n");
      out.write("    line-height: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".pl:focus{\n");
      out.write("    border: 1px solid #e8f4db;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    outline: 3px solid #e8f4db;\n");
      out.write("    border-radius: 10px;\n");
      out.write("}\n");
      out.write(" /* select */\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("hr{\n");
      out.write("		border-bottom: none;\n");
      out.write("		border-left: none;\n");
      out.write("		border-right: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav input{ /* 검색어 */\n");
      out.write("	border-color: #565656;\n");
      out.write("	background-image: url(\"");
      out.print(request.getContextPath());
      out.write("/images/search.jpg\");\n");
      out.write("	background-repeat: no-repeat;\n");
      out.write("	background-position: right;\n");
      out.write("	border-radius: 15px;\n");
      out.write("	background-size: 25px;\n");
      out.write("	outline: none;\n");
      out.write("}  \n");
      out.write("\n");
      out.write(".top ul { /* 로그인 칸*/\n");
      out.write("	list-style-type: none;\n");
      out.write("	/* 좌측 여백 없애기 */\n");
      out.write("	padding-left: 0px;\n");
      out.write("	/* 우측 정렬 하기 */\n");
      out.write("	float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top ul li { /* 로그인칸 */\n");
      out.write("	display: inline;\n");
      out.write("	border-left: 1px solid;\n");
      out.write("	padding: 0px 10px 0px 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".top ul li:first-child { /* 로그인버튼 */\n");
      out.write("	border-left: none;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write("	text-decoration: none;\n");
      out.write("	color: #565656; /* #5d5d5d */\n");
      out.write("}\n");
      out.write(".top{\n");
      out.write("	font-size:12px;\n");
      out.write("	width: 300px;\n");
      out.write("	height: 30px;\n");
      out.write("}\n");
      out.write(".newlogin{\n");
      out.write("	color: #72aa37;\n");
      out.write("} \n");
      out.write("body {	/* 전체 글꼴 */\n");
      out.write("	font-family: 'Noto Sans KR', sans-serif;\n");
      out.write("	color: #5d5d5d;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bottom{\n");
      out.write("	color: #5d5d5d;\n");
      out.write("}\n");
      out.write("/*====================================  */ \n");
      out.write("\n");
      out.write("*{ \n");
      out.write("  list-style: none;\n");
      out.write("}\n");
      out.write("a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  color: #57523E;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#menu{\n");
      out.write("  position:relative; \n");
      out.write("  z-index: 99; \n");
      out.write("  background-color: white;\n");
      out.write("  height: 50px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("[class*=\"main\"] {\n");
      out.write("  background-color: white;\n");
      out.write("  border-radius: 5px 5px 5px 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("[class*=\"main\"] ul {\n");
      out.write("  border-radius: 5px 5px 5px 5px;\n");
      out.write("  border: 1px solid #57523E;\n");
      out.write("}\n");
      out.write(".main1{\n");
      out.write("  padding-left: 0px;\n");
      out.write("   height: 100%;\n");
      out.write("  width: 1000px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write(".main1>li {\n");
      out.write("  float: left;\n");
      out.write("  width: 13%;\n");
      out.write("  line-height: 50px;\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write(".main1>li:hover .main2 {\n");
      out.write("  left: 0;\n");
      out.write("}\n");
      out.write(".main1>li a {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write(".main1>li a:hover {\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write(".main2 {\n");
      out.write("	text-align:left;\n");
      out.write("  width:170%;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50px;\n");
      out.write("  left: -9999px;\n");
      out.write("  padding: 0px;\n");
      out.write("}\n");
      out.write(".main1>li:hover {\n");
      out.write("  border-bottom: 3px solid #8ca86e;\n");
      out.write("}\n");
      out.write(".main2 li:hover {\n");
      out.write("  border-left: 4px solid #8ca86e;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main2>li {\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write(".main2>li:hover .main3 {\n");
      out.write("  left: 100%;\n");
      out.write("}\n");
      out.write(".main2>li a, .main3>li a {\n");
      out.write("  border-radius: 10px;\n");
      out.write("  margin: 10px;\n");
      out.write("}  \n");
      out.write(".main3 {\n");
      out.write("  position: absolute;\n");
      out.write("  top: -10px;\n");
      out.write("  width: 100%;\n");
      out.write("  left: -9999px;\n");
      out.write("  padding: 0px;\n");
      out.write("}\n");
      out.write(".main3>li a:hover {\n");
      out.write("  color: #5d5d5d;\n");
      out.write("}\n");
      out.write("nav {\n");
      out.write("  margin-top: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("</script>\n");
      out.write(" <head> <!-- notosans 폰트 적용 -->\n");
      out.write(" 	 <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");

	String id = request.getParameter("id");
	/*id 에 해당하는 이름 가져오기  */
	session.setAttribute("id", id);
	MemberDao mdao = MemberDao.getinstance();
	MemberBean mb = mdao.getMemberById(id); 
	String Path = request.getContextPath();

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"top\" align=\"right\">\n");
      out.write("	<ul>\n");
      out.write("		\n");
      out.write("			<li><a class=\"newlogin\" href=\"mypage.jsp?id=admin\"><font color=\"#8ca86e\">관리자님</font> <font color=\"#5d5d5d\">마이페이지</font></a></li>\n");
      out.write("			<li><a href=\"");
      out.print(request.getContextPath());
      out.write("/logout.jsp\">로그아웃</a></li>\n");
      out.write("		\n");
      out.write("	</ul>\n");
      out.write("		\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- 로고  -->\n");
      out.write("\n");
      out.write("<div align=\"center\" class=\"logo\">\n");
      out.write("	<a href=\"");
      out.print(Path );
      out.write("/admin/orderList.jsp\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/images/logo.jpg\" width=400 height=150></a>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"menu\">\n");
      out.write("  <ul class=\"main1\">\n");
      out.write("    <li style=\"border: none;\"><a href=\"#\">카테고리</a>\n");
      out.write("       <ul class=\"main2\">\n");
      out.write("        <li><a href=\"");
      out.print(Path);
      out.write("/admin/Category/outCategory.jsp\">대분류 카테고리</a></li>\n");
      out.write("        <li><a href=\"");
      out.print(Path);
      out.write("/admin/Category/inCategory.jsp\">소분류 카테고리</</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <li style=\"border: none;\"><a href=\"");
      out.print(Path);
      out.write("/admin/Product/ProductAllList.jsp\">상품</a>\n");
      out.write("       <ul class=\"main2\">\n");
      out.write("        <li><a href=\"");
      out.print(Path);
      out.write("/admin/Product/addProduct.jsp\">상품 등록</a></li>\n");
      out.write("        <li><a href=\"");
      out.print(Path);
      out.write("/admin/Product/ProductList.jsp\">상품내역</a></li>\n");
      out.write("      </ul>\n");
      out.write("     </li>\n");
      out.write("    <li><a href=\"");
      out.print(Path );
      out.write("/admin/orderList.jsp\">주문 내역</a></li>\n");
      out.write("    <li><a href=\"");
      out.print(Path );
      out.write("/admin/MemberList.jsp\">회원 관리</a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
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