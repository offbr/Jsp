/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-09-24 09:58:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.guide.guidelist;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guideindex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/guide/guidelist/../../header.jsp", Long.valueOf(1473658189000L));
    _jspx_dependants.put("/guide/guidelist/../../footer.jsp", Long.valueOf(1473405622000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>해피레고</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/common.css\"  media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/content.css\"  media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/base.css\" media=\"screen\">\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Play:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<link rel=\"shortcut icon\" href=\"../../images/lego_32.ico\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write('\n');
 String idkey = (String)session.getAttribute("idkey"); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- wrap -->\n");
      out.write("<section id=\"wrap\">\n");
      out.write("    <!-- header -->\n");
      out.write("    <header id=\"header\" >\n");
      out.write("\t\t<!-- <h1><a href=\"http://localhost/happylego\"><img src=\"../../images/lego_128.png\" alt=\"해피레고\" /></a></h1>  -->\n");
      out.write("\t\t<h1><a href=\"http://localhost:8080/happylego\"><img src=\"../../images/lego_128.png\" alt=\"해피레고\" /></a></h1>\n");
      out.write("        <!-- header_wrap -->\n");
      out.write("        <section class=\"header_wrap\">            \n");
      out.write("            <!-- gnb -->\n");
      out.write("            <nav class=\"gnb\" style=\"background-color: white; box-shadow: none;\">\n");
      out.write("                <ul>\n");
      out.write("                    <li ><a href=\"../../service/product/product.jsp\" title=\"서비스 신청\">서비스 신청</a></li>\n");
      out.write("                    <li ><a href=\"../../company/happy/companyindex.jsp\" title=\"해피레고\">해피레고</a></li>\n");
      out.write("                    <li ><a href=\"../../guide/guidelist/guideindex.jsp\" title=\"이용가이드\"> 이용안내</a></li>\n");
      out.write("                    <li ><a href=\"../../community/qna/qnaList.jsp\" title=\"커뮤니티\">커뮤니티</a></li>\n");
      out.write("                    ");
if(idkey == null){
      out.write("\n");
      out.write("                    <li ><a href=\"../../mypage/member/login.jsp\" title=\"마이페이지\">마이페이지</a></li>\n");
      out.write("                    ");
}else if(idkey.equals("manager")){
      out.write("\n");
      out.write("                    <li ><a href=\"../../mypage/admin/manager.jsp\" title=\"마이페이지\">관리자</a></li>\n");
      out.write("\t\t\t\t\t");
}else if(idkey != null){
      out.write("\n");
      out.write("\t\t\t\t\t<li ><a href=\"../../mypage/member/myinfo.jsp\" title=\"마이페이지\">마이페이지</a></li>\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <!-- //gnb -->\n");
      out.write("            <!--<p class=\"top_tel\"><span class=\"title\">고객센터</span><span class=\"num f_play_R\">(064)746-0700</span></p>-->           \n");
      out.write("        </section>\n");
      out.write("        <!-- //header_wrap -->\n");
      out.write("\t\t<!-- global_menu -->\n");
      out.write("            <ul class=\"global_menu\">\n");
      out.write("      \t\t\t");
if(idkey == null){
      out.write("\n");
      out.write("               \t<li><a href=\"../../mypage/member/login.jsp\" title=\"로그인\">로그인</a></li>\n");
      out.write("\t\t\t\t");
}else if(idkey != null){
      out.write("\n");
      out.write("\t\t\t\t<li ><a href=\"../../mypage/member/logout.jsp\" title=\"로그아웃\">로그아웃</a></li>\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("               \n");
      out.write("\t\t\t   <li class=\"last\"><a href=\"../../company/happy/companyindex.jsp\" title=\"찾아오시는길\">찾아오시는길</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <!-- //global_menu -->\n");
      out.write("    </header>\n");
      out.write("    <!-- //header -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  <!-- //footer -->\n");
      out.write("    <aside id=\"pop\" style=\"display:none;\">\n");
      out.write("        <!-- pop_table -->\n");
      out.write("        <section class=\"pop_table\">\n");
      out.write("            <!-- pop_cell -->\n");
      out.write("            <div class=\"pop_cell\" id=\"popdetail\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </aside>\n");
      out.write("    <div id=\"commonLayer\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!-- //wrap -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--   -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<!-- //header -->\n");
      out.write("\n");
      out.write("<article class=\"sub_visual sub01\">\n");
      out.write("    <h3 class=\"big_title\">이용안내</h3>\n");
      out.write("    <h4 class=\"sub_title\">해피레고를 찾아주셔서 감사합니다.</h4>\n");
      out.write("</article>\n");
      out.write("\n");
      out.write("<img src=\"../../guideimage/guide01.png\" alt=\"해피레고\" />\n");
      out.write("<img src=\"../../guideimage/guide02.png\" alt=\"해피레고\" />\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- footer -->\n");
      out.write("<footer id=\"footer\">\n");
      out.write("\t<section class=\"footer_wrap\">\n");
      out.write("\t\t<h2>\n");
      out.write("\t\t\t<img src=\"../../images/lego_128.png\" alt=\"해피레고\" width=\"5%\" />\n");
      out.write("\t\t</h2>\n");
      out.write("\t\t<address>\n");
      out.write("\t\t\t해피레고&nbsp;&nbsp;|&nbsp;&nbsp; 프로젝트\n");
      out.write("\t\t\t&nbsp;&nbsp;|&nbsp;&nbsp;팀 : 장현진, 이연남, 이동규, 오현은\n");
      out.write("\t\t\t&nbsp;&nbsp;|&nbsp;&nbsp;주소지 : 서울특별시 강남 에이콘아카데미<br>\n");
      out.write("\t\t\t사업자등록번호 : 000-0000-0000&nbsp;&nbsp;|&nbsp;&nbsp;통신판매신고번호 : 제\n");
      out.write("\t\t\t0000-서울강남-0000호&nbsp;&nbsp;|&nbsp;&nbsp;<span class=\"letter\">TEL\n");
      out.write("\t\t\t: 1004-1004</span>&nbsp;&nbsp;|&nbsp;&nbsp;<span class=\"letter\">Fax\n");
      out.write("\t\t\t: 000-000-0000</span><br> <span class=\"letter\">COPYRIGHT©2016\n");
      out.write("\t\t\tHAPPY LEGO. ALL RIGHTS RESERVED.</span>\n");
      out.write("\t\t</address>\n");
      out.write("\t</section>\n");
      out.write("</footer>\n");
      out.write("<!-- //footer -->\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<!-- //footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
