/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-10-01 08:05:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.mypage.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/mypage/index/../../header.jsp", Long.valueOf(1474106208000L));
    _jspx_dependants.put("/mypage/index/../../footer.jsp", Long.valueOf(1475225419000L));
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
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->\n");
      out.write("<title>mono</title>\n");
      out.write("\n");
      out.write("<!-- 합쳐지고 최소화된 최신 CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- 부가적인 테마 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">\n");
      out.write("<!-- 글꼴 -->\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- 합쳐지고 최소화된 최신 자바스크립트 -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"../../js/registerCheck.js\"></script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("label{\n");
      out.write("\tcolor: #454545;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-register{\n");
      out.write("max-width: 330px;\n");
      out.write("padding: 15px;\n");
      out.write("margin: 0 auto;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<div class=\"container\">\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write("\n");
      out.write("<!-- 메인 메뉴바 가운데 정렬 -->\n");
      out.write("<style>\n");
      out.write(".nav-tabs>li, .nav-pills>li {\n");
      out.write("\tfloat: none;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("}\n");
      out.write(".nav-tabs, .nav-pills {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("body {\n");
      out.write("\tfont-family: 'Montserrat', sans-serif;\n");
      out.write("}\n");
      out.write("a{\n");
      out.write(" color: #454545;\n");
      out.write("}\n");
      out.write("</style>    \n");
      out.write("    \n");
      out.write("<!-- 상단 아이콘 -->\n");
      out.write("<article>\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\t<div class=\"pull-right\">\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<a href=\"http://localhost:8080/mono/index.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span></a>&nbsp;\n");
      out.write("\t\t<a href=\"#\"><span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span></a>&nbsp;\n");
      out.write("\t\t<a href=\"../../shop/cart/cart.jsp\"><span class=\"glyphicon glyphicon-shopping-cart\" aria-hidden=\"true\"></span></a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</article>\n");
      out.write("<!-- //상단 아이콘 -->\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<!-- 메인이미지 -->\n");
      out.write("<div class=\"container\">\n");
      out.write("\t <!-- 가운데 정렬 center-block 크기를 지정해줘야한다 -->\n");
      out.write("\t<a href=\"http://localhost:8080/mono/index.jsp\"><img src=\"../../images/logo.png\" class=\"img-responsive center-block\" alt=\"Responsive image\"></a>\n");
      out.write("</div>\n");
      out.write("<!-- //메인이미지 -->\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<!-- 메인메뉴 -->\n");
      out.write("<div class=\"container\">\n");
      out.write("  <ul class=\"nav nav-tabs\" style=\"border-top: solid 1px; border-top-color: #dddddd;\">\n");
      out.write("    <li><a href=\"../../index.jsp\">HOME</a></li>\n");
      out.write("    <li><a href=\"../../shop/deck/deck.jsp\">SHOP</a></li>\n");
      out.write("    <li><a href=\"../../board/qna/qnaList.jsp\">Q&A</a></li>\n");
      out.write("    <li><a href=\"../../mypage/index/mypageindex.jsp\">MYPAGE</a></li>\n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("<!-- //메인메뉴 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- //header -->\n");
      out.write("\n");
      out.write("<!-- 회원가입 폼 -->\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("\t<form class=\"form-register\" name=\"register\" action=\"registerOk.jsp\" method=\"post\">\n");
      out.write("\t\t<h2 class=\"form-signin-heading\">User Profile</h2>\n");
      out.write("\t\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<label>Email address</label>\n");
      out.write("\t\t<input type=\"email\" name=\"inputEmail\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required autofocus>\n");
      out.write("\t\t<input type=\"hidden\" name=\"inputEmailOk\" id=\"inputEmailOk\">\n");
      out.write("\t\t<input type=\"button\" id=\"emailCheck\" value=\"Email Check\" class=\"form-control\"><br>\n");
      out.write("\t\t\n");
      out.write("\t\t<label>Name</label>\n");
      out.write("\t\t<input type=\"text\" name=\"inputName\" id=\"inputName\" class=\"form-control\" placeholder=\"Name\" required autofocus>\n");
      out.write("\t\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<label>Passwrod</label> \n");
      out.write("\t\t<input type=\"password\" name=\"inputPassword\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("\t\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<label>Confirm Passwrod</label> \n");
      out.write("\t\t<input type=\"password\" name=\"inputPasswordOk\" id=\"inputPasswordOk\" class=\"form-control\" placeholder=\"Confirm Password\" required>\n");
      out.write("\t\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<label>address</label> \n");
      out.write("\t\t<input type=\"text\" name=\"postcode\" id=\"postcode\" class=\"form-control\" placeholder=\"PostCode\" readonly=\"readonly\" required>\n");
      out.write("\t\t<input type=\"button\" onclick=\"daumPostcode()\" value=\"PostCode Search\" class=\"form-control\"><br>\n");
      out.write("\t\t<input type=\"text\" name=\"address1\" id=\"address1\" placeholder=\"address\" class=\"form-control\" readonly=\"readonly\">\n");
      out.write("\t\t<input type=\"text\" name=\"address2\" id=\"address2\" placeholder=\"address\" class=\"form-control\">\n");
      out.write("\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<label>Tel</label> \n");
      out.write("\t\t<input type=\"text\" name=\"inputTel\" id=\"inputTel\" class=\"form-control\" placeholder=\"Tel\" required>\n");
      out.write("\t\t\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<button class=\"btn btn-lg btn-default btn-block\" type=\"submit\" id=\"btnJoin\">Join</button><br>\n");
      out.write("\t</form>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("<!-- //회원가입 폼 -->\n");
      out.write("\n");
      out.write("<!-- 우편번호 찾기 폼 \n");
      out.write("<input type=\"text\" id=\"postcode\" placeholder=\"우편번호\">\n");
      out.write("<input type=\"button\" onclick=\"daumPostcode()\" value=\"우편번호 찾기\"><br>\n");
      out.write("<input type=\"text\" id=\"address\" placeholder=\"주소\">\n");
      out.write("<input type=\"text\" id=\"address2\" placeholder=\"상세주소\">\n");
      out.write(" -->\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!-- 우편번호 검색 -->\n");
      out.write("\n");
      out.write("<!-- iOS에서는 position:fixed 버그가 있음, 적용하는 사이트에 맞게 position:absolute 등을 이용하여 top,left값 조정 필요 -->\n");
      out.write("<div id=\"layer\" style=\"display:none;position:fixed;overflow:hidden;z-index:1;-webkit-overflow-scrolling:touch;\">\n");
      out.write("<img src=\"//i1.daumcdn.net/localimg/localimages/07/postcode/320/close.png\" id=\"btnCloseLayer\" style=\"cursor:pointer;position:absolute;right:-3px;top:-3px;z-index:1\" onclick=\"closeDaumPostcode()\" alt=\"닫기 버튼\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\n");
      out.write("<script src=\"../../js/address.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- //우편번호 검색 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Hind\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<!-- 하단 이미지 -->\n");
      out.write("<div class=\"container\">\n");
      out.write("<a href=\"http://localhost:8080/mono/index.jsp\"><img src=\"../../images/logo.png\" class=\"img-responsive center-block\" alt=\"Responsive image\"></a>\n");
      out.write("<br><br>\n");
      out.write("</div>\n");
      out.write("<!-- //하단 이미지 -->\n");
      out.write("\n");
      out.write("<!-- 제작자표시 -->\n");
      out.write("<div class=\"container text-center\" style=\"font-family: 'Hind', sans-serif;\">\n");
      out.write("<label style=\"color: #949494;\">Copyright © 2016 NYC •</label>\n");
      out.write("<label> JangHyunJin</label>\n");
      out.write("<label style=\"color: #949494;\">by Underground Media •</label> \n");
      out.write("<label> Shopping Cart by JangHyunJin</label>\n");
      out.write("</div>\n");
      out.write("<!-- //제작자표시 -->\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<!-- //footer -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</div>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
