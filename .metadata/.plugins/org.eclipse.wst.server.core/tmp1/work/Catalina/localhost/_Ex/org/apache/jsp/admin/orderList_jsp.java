/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.27
 * Generated at: 2023-01-10 00:52:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.text.DecimalFormat;
import my.shop.mall.OrdersBean;
import my.shop.mall.OrdersDao;
import my.shop.ProductBean;
import my.shop.ProductDao;
import my.shop.CategoryBean2;
import my.shop.CategoryDao2;
import my.shop.CategoryBean;
import java.util.ArrayList;
import my.shop.CategoryDao;
import my.member.MemberBean;
import my.member.MemberDao;

public final class orderList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/main_bottom.jsp", Long.valueOf(1671338957000L));
    _jspx_dependants.put("/admin/main_top.jsp", Long.valueOf(1671338957000L));
  }

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
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("my.shop.ProductBean");
    _jspx_imports_classes.add("my.shop.mall.OrdersDao");
    _jspx_imports_classes.add("my.shop.mall.OrdersBean");
    _jspx_imports_classes.add("my.shop.CategoryBean");
    _jspx_imports_classes.add("my.member.MemberDao");
    _jspx_imports_classes.add("my.shop.CategoryDao2");
    _jspx_imports_classes.add("my.shop.ProductDao");
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
      out.write("<style>\n");
      out.write(" 	.idtext{\n");
      out.write("	width: 200px;\n");
      out.write("    height: 50px; \n");
      out.write("    border-radius: 4px;\n");
      out.write(" 	border:1px solid #e1e1e1;\n");
      out.write("    outline: none;\n");
      out.write(" }\n");
      out.write(" .firstTr{\n");
      out.write(" 	background-color: #f3f6ef;\n");
      out.write(" 	border-radius: 20px;\n");
      out.write(" 	height: 60px;\n");
      out.write(" 	width:300px;\n");
      out.write(" 	font-weight: bold;\n");
      out.write(" }\n");
      out.write(" .contents{\n");
      out.write(" 	height: 50px;\n");
      out.write(" }\n");
      out.write("   .search{\n");
      out.write("    border-radius: 4px;\n");
      out.write("	width: 300px;\n");
      out.write("    height: 50px; \n");
      out.write("	border:none;\n");
      out.write("	font-weight:bold; \n");
      out.write("	color:white; \n");
      out.write("	background-color: #8ca86e;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".inCategoryTable{\n");
      out.write("	border:2px solid #8ca86e;\n");
      out.write("	border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style> \n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery.js\"></script>\n");
      out.write("<script>\n");
      out.write("function idCheck(){\n");
      out.write("	\n");
      out.write("	if($('input[name=\"id\"]').val().length==0){\n");
      out.write("		alert(\"아이디를 입력해주세요\");\n");
      out.write("	}\n");
      out.write("	else{\n");
      out.write("		f.submit();\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function delete1(onum,pnum){\n");
      out.write("	var result = confirm(\"정말 삭제하시겠습니까?\")\n");
      out.write("	if(result)\n");
      out.write("	location.href=\"deleteOrder.jsp?onum=\"+onum+\"&pnum=\"+pnum;\n");
      out.write("}\n");
      out.write("\n");
      out.write("	\n");
      out.write("</script>\n");
      out.write("\n");
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
      out.write('\n');

request.setCharacterEncoding("UTF-8");
id = (String)session.getAttribute("id");

OrdersDao odao = OrdersDao.getinstance();


ArrayList<OrdersBean>lists = odao.getAllOrder();


      out.write("\n");
      out.write("<div align=\"center\">\n");
      out.write("<br><br>\n");
      out.write("	<h2>주문 내역</h2><br>\n");
      out.write("	\n");
      out.write("<form name=\"f\" action=\"OrderSearchById.jsp\">\n");
      out.write("	<table align=\"center\">\n");
      out.write("	<tr height=\"200px\">\n");
      out.write("		<th width=150px align=\"left\">회원 아이디</th>\n");
      out.write("		<td align=\"left\">\n");
      out.write("			<input class=\"idtext\" type=\"text\" name=\"id\" placeholder=\"  아이디를 입력해주세요\">\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("	<tr height=\"100px\">\n");
      out.write("		<td colspan=\"4\" align=\"center\">\n");
      out.write("			<input class=\"search\" type=\"button\" value=\"검색\" onClick=\"idCheck()\"><br>\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("	</table>\n");
      out.write("	\n");
      out.write("</form>	\n");
      out.write("<!-- 상품 내역들 세부카테고리별로 다 보기 -->	\n");
      out.write("	<table align=\"center\" width=50% class=\"inCategoryTable\" >\n");
      out.write("		<tr class=\"firstTr\">\n");
      out.write("			<td align=\"center\">주문번호</td>\n");
      out.write("			<td align=\"center\">회원아이디</td>\n");
      out.write("			<td align=\"center\">상품이미지</td>\n");
      out.write("			<td align=\"center\">상품명</td>\n");
      out.write("			<td align=\"center\">주소지</td>\n");
      out.write("			<td align=\"center\">수량</td>\n");
      out.write("			<td align=\"center\">결제금액</td>\n");
      out.write("			<td align=\"center\">구매일</td>\n");
      out.write("			<td>수정</td>\n");
      out.write("			<td>삭제</td>\n");
      out.write("		</tr>\n");
      out.write("	");

		if(lists.size()==0){
		
      out.write("\n");
      out.write("			<tr class=\"contents\">\n");
      out.write("			<td align=\"center\" colspan=\"9\">주문 내역이 없습니다.</td>\n");
      out.write("			</tr>\n");
      out.write("		");
 
		}
		else{
		for(OrdersBean ob : lists){
		
      out.write("\n");
      out.write("		<tr class=\"contents\">\n");
      out.write("			<td align=\"center\">");
      out.print(ob.getOnum() );
      out.write("</td>\n");
      out.write("			<td align=\"center\">");
      out.print(ob.getMid() );
      out.write("</td>\n");
      out.write("			<td align=\"center\">\n");
      out.write("			");
 
				
				ProductDao pdao = ProductDao.getinstance();
				ProductBean pb = pdao.getProductByPnum(String.valueOf(ob.getPnum()));
				String rContext = request.getContextPath() + "/admin/images/";
				String fullPath = rContext + pb.getPimage();
				System.out.println(rContext);
				System.out.println(fullPath);
				DecimalFormat df = new DecimalFormat("###,###");
			
      out.write("\n");
      out.write("			<img width=80px height=80px src=\"");
      out.print(fullPath );
      out.write("\">\n");
      out.write("			</td>\n");
      out.write("			<td align=\"center\">");
      out.print(pb.getPname());
      out.write("</td>\n");
      out.write("			<td align=\"center\">");
      out.print(ob.getAddress());
      out.write("</td>\n");
      out.write("			<td align=\"center\">");
      out.print(ob.getQty());
      out.write("</td>\n");
      out.write("			<td align=\"center\">");
      out.print(df.format(ob.getAmount()));
      out.write("원</td>\n");
      out.write("			<td align=\"center\">");
      out.print(ob.getOrderDate());
      out.write("</td>\n");
      out.write("			<td><a href=\"updateOrder.jsp?onum=");
      out.print(ob.getOnum());
      out.write("&pnum=");
      out.print(pb.getPnum());
      out.write("\">[수정]</a></td>\n");
      out.write("			<td><a href=\"javascript:delete1(");
      out.print(ob.getOnum());
      out.write(',');
      out.print(pb.getPnum());
      out.write(")\">[삭제]</a></td>\n");
      out.write("		</tr>\n");
      out.write("		");

		}//else
	}//for
		
      out.write("\n");
      out.write("		\n");
      out.write("	</table>\n");
      out.write("	\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	.bottomtop{\n");
      out.write("		font-size: 15px;\n");
      out.write("	}\n");
      out.write("	.bottombt{\n");
      out.write("		font-size: 12px;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("<!-- bottom -->\n");
      out.write("<br>\n");
      out.write("<hr width=80% class=\"categoryhr\">\n");
      out.write("<br>\n");
      out.write("<table  width=80% align=\"center\">\n");
      out.write("	<tr>\n");
      out.write("		<th width=\"30%\" align=\"left\" class=\"bottomtop\">Yelmiya(주)</th>\n");
      out.write("		<th width=\"30%\" align=\"left\" class=\"bottomtop\">고객센터</th>\n");
      out.write("		<th width=\"30%\" align=\"left\" class=\"bottomtop\">전자금융가레 분쟁처리</th>\n");
      out.write("	</tr>\n");
      out.write("	<tr>\n");
      out.write("		<td>\n");
      out.write("			<table>\n");
      out.write("				<tr align=\"left\">\n");
      out.write("					<td width=\"80%\" class=\"bottombt\">사업자등록번호 123-456-00000 통신판매업신고번호 0000-인천-0123호\n");
      out.write("						대표이사 박찬호 인천시 95, NAVER 0000, 12345\n");
      out.write("						전화 1588-0000이메일 chanho159@naver.com사업자등록정보 확인\n");
      out.write("					<td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</td>\n");
      out.write("		<td>\n");
      out.write("			<table>\n");
      out.write("				<tr align=\"left\">\n");
      out.write("					<td width=\"80%\" class=\"bottombt\">\n");
      out.write("					인천시 계양구 중앙길 12 중앙회관\n");
      out.write("					전화 1588-0000\n");
      out.write("					결제도용신고 1588-0000\n");
      out.write("					<td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</td>\n");
      out.write("		<td>\n");
      out.write("			<table>\n");
      out.write("				<tr align=\"left\">\n");
      out.write("					<td width=\"80%\" class=\"bottombt\">\n");
      out.write("					전화 1589-0000\n");
      out.write("					<td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</td>\n");
      out.write("	</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
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
