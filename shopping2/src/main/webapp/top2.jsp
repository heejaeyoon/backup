<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: SF Pro KR, SF Pro Display, SF Pro Icons, AOS Icons, Apple Gothic, HY Gulim, MalgunGothic, HY Dotum, Lexi Gulim, Helvetica Neue, Helvetica, Arial, sans-serif;
}

body {
  padding-top: 6em;
}

/*헤더 이미지*/
#header img {
  width: 200px;
  height: 50px;
  margin-top: 20px;
}
#header {
  -moz-align-items: center;
  -webkit-align-items: center;
  -ms-align-items: center;
  align-items: center;
  background: #fff;
  cursor: default;
  height: 6em;
  left: 0;
  line-height: 6em;
  position: fixed;
  top: 0;
  width: 100%;
  z-index: 10001;
  box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.075);
  text-align: center;
}

#header nav {
      position: absolute;
      top: 0;
      height: inherit;
      line-height: inherit;
  }

#header nav.left {
      left: 2em;
   }

#header nav.right {
        right: 0.5em;
      }

#header nav .button {
        padding: 0 2em;
        height: 3.25em;
        line-height: 3.25em;
      }

#header nav a {
        text-decoration: none;
          display: inline-block;
      }

@media screen and (max-width: 980px) {
  body {
      padding-top: 44px;
  }

  #header {
      height: 44px;
      line-height: 44px;
  }   
}

@media screen and (max-width: 480px) {

  #header {
      min-width: 320px;
  }
}
#header .menubar input[type=button]{
	border : white;
	background-color : white;
	cursor : pointer;
  font-weight: 700;
  width : 100px;
  height:50px;
  font-size : 1rem;
}

#header .right input:hover{
  color: white;
  background-color: black;
	}


/*헤더 검색바*/
#header .searchbar{
  margin-left: 20px;
}

#header .search-form{
  display: inline-block;
  margin-left: 20px;
}
#header .left button{
  background-color: white;
  border: white;
  height: 40px;
  width: 50px;
  background-color: black;
  color: white;
  font-size: 1rem;
}
#header .left button:hover{
  color: black;
  background-color: white;
  cursor: pointer;
}

#header .left input{
  border: black;
  width: 200px;
  border-bottom: black solid 1px;
  border-radius: 0;
  font-size: 1rem;
  text-align: center;
  height: 34px;
}
.menubar>li{
	display:inline-block;
}
/*dropdown*/

.menubar li ul { 
display:none; /* 평상시에는 서브메뉴가 안보이게 하기 */ 
position:absolute; 
background : white;
width : 110px;
  }

.menubar li:hover ul{ 
	display:block;
	
 /* 마우스 커서 올리면 서브메뉴 보이게 하기 */ }

.menubar>li>a:hover{
	background : black;
	color:white;
} 
.menubar a{
	color : black;
  font-weight: 700;
}

.menubar ul>a{
	color : black;
	transition: 0.5s; 
	
}

 .menubar ul:hover a{        /*메인효과1*/
            opacity: 0.3;   
        }
        
.menubar ul>a:hover {        /*메인효과2 : 특정 a만 밝게*/
            opacity: 1;
        }
 </style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<link rel="stylesheet" href="top2.css">
<nav class="left">
   
           <div class="search_bar">
                 <form  name="frm_search" role="search" method="get" class="search-form" >
                     <input type="search" class="search-field" placeholder="상품명" value="${param.findStr }" name="findStr" />
                    <button type="submit"  name="btnFind" class="search-submit" onClick="openPop();">검색</button>
               <input type="hidden" name="search" value="select">
               
               <a href ="<%=request.getContextPath() %>/main.jsp"><img src="<%=request.getContextPath() %>/image/mama.png"/></a>
                 </form>
            </div> 
  
        </nav>
        
          <nav class="right">
         <div class = "menubar">
               <li>
                  <a href="<%=request.getContextPath() %>/intro/intro.jsp" class="button alt">소개</a>
                  <ul>
                     <a href="<%=request.getContextPath() %>/intro/intro.jsp" >회사소개</a>
                     <a href="<%=request.getContextPath() %>/intro/vision.jsp" >회사비전</a>
                  </ul>
               </li>
               <li>
                  <a href="<%=request.getContextPath() %>/notice/notice.jsp" class="button alt">커뮤니티</a>
                  <ul>
                     <a href="<%=request.getContextPath() %>/notice/notice.jsp" >공지사항</a>
                     <a href="<%=request.getContextPath() %>/event/event.jsp" >이벤트</a>
                     <a href="<%=request.getContextPath() %>/review.do?job=select" >리뷰 게시판</a>
                  </ul>
               </li>
               <li>
                  <a href="<%=request.getContextPath() %>/inquiry.do?job=select" class="button alt">고객지원</a>
                  <ul>
                     <a href="<%=request.getContextPath() %>/inquiry.do?job=select">QnA게시판</a>
                     <a href="<%=request.getContextPath() %>/faqbook.do?qa=selectFaq">FAQ</a></br>
                     <a href="<%=request.getContextPath() %>/cs_center/cs_func_page.jsp?func=../cs_center/cs_map.jsp" >오시는 길</a>
                  </ul>
               </li>
               
              
               
              	<%
				String admin = (String)session.getAttribute("adminOk");
				if(admin !=null){
				%> 
               <li><a href="<%=request.getContextPath() %>/admin/admin_index.jsp" class="button alt">관리자</a></li>  
                <li><input type='button' id='btnLogout' value='로그아웃' /></li>         
               <%}else if( session.getAttribute("member_mid")== null){ //mid의 속성이 없으면 로그인 이전화면
               %>            
               <li>
                  <a href="<%=request.getContextPath() %>/UsersJoin/agree.jsp" class="button alt">회원가입</a>     
               </li>
               <li><a href="<%=request.getContextPath() %>/login/loginfo.jsp" class="button alt">로그인</a></li>  
               <%} else {%>
                <li>
                  <a href="<%=request.getContextPath() %>/mypage/mypage" class="button alt">마이룸</a>
                  <ul>
                     <a href="<%=request.getContextPath() %>/mypage/cart.jsp" >장바구니</a>
                     <a href="<%=request.getContextPath() %>/mypage/orderlist.jsp" >주문내역</a>
                     <a href="<%=request.getContextPath() %>/mypage/coupon.jsp" >쿠폰함</a>
                  </ul>
               </li>
                <li><input type='button' id='btnLogout' value='로그아웃' /></li>         
                <%} %>         
           </div>
        </nav>
</body>
</html>