/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-01-24 05:54:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aside_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\n");
      out.write("<aside class=\"main-sidebar\">\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("    <section class=\"sidebar\">\n");
      out.write("        <!-- Sidebar user panel -->\n");
      out.write("        <div class=\"user-panel\">\n");
      out.write("            <div class=\"pull-left image\">\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/user2-160x160.jpg\"\n");
      out.write("                     class=\"img-circle\" alt=\"User Image\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"pull-left info\">\n");
      out.write("                <p>\n");
      out.write("                    ");
      if (_jspx_meth_security_005fauthentication_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> 在线</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("        <ul class=\"sidebar-menu\">\n");
      out.write("            <li class=\"header\">菜单</li>\n");
      out.write("            <li id=\"admin-index\"><a\n");
      out.write("                    href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/main.jsp\"><i\n");
      out.write("                    class=\"fa fa-dashboard\"></i> <span>首页</span></a></li>\n");
      out.write("\n");
      out.write("            <li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cogs\"></i>\n");
      out.write("                <span>系统管理</span> <span class=\"pull-right-container\"> <i\n");
      out.write("                        class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("                    <li id=\"system-setting1\">\n");
      out.write("                        ");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"system-setting2\"><a\n");
      out.write("                            href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/role/findAll.do\"> <i\n");
      out.write("                            class=\"fa fa-circle-o\"></i> 角色管理\n");
      out.write("                    </a></li>\n");
      out.write("                    <li id=\"system-setting3\"><a\n");
      out.write("                            href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/permission/findAll.do\">\n");
      out.write("                        <i class=\"fa fa-circle-o\"></i> 资源权限管理\n");
      out.write("                    </a></li>\n");
      out.write("                    <li id=\"system-setting4\">\n");
      out.write("                        <a\n");
      out.write("                                href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/sysLog/findAll.do\"> <i\n");
      out.write("                                class=\"fa fa-circle-o\"></i> 访问日志\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </li>\n");
      out.write("            <li class=\"treeview\"><a href=\"#\"> <i class=\"fa fa-cube\"></i>\n");
      out.write("                <span>基础数据</span> <span class=\"pull-right-container\"> <i\n");
      out.write("                        class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("            </a>\n");
      out.write("                <ul class=\"treeview-menu\">\n");
      out.write("\n");
      out.write("                    <li id=\"system-setting5\"><a\n");
      out.write("                            href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/product/findAll.do\">\n");
      out.write("                        <i class=\"fa fa-circle-o\"></i> 产品管理\n");
      out.write("                    </a></li>\n");
      out.write("                    <li id=\"system-setting6\"><a\n");
      out.write("                            href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/orders/findAll.do?page=1&size=4\"> <i\n");
      out.write("                            class=\"fa fa-circle-o\"></i> 订单管理\n");
      out.write("                    </a></li>\n");
      out.write("\n");
      out.write("                </ul></li>\n");
      out.write("        </ul>\n");
      out.write("    </section>\n");
      out.write("    <!-- /.sidebar -->\n");
      out.write("</aside>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_security_005fauthentication_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_security_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_security_005fauthentication_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthentication_005f0.setParent(null);
    // /pages/aside.jsp(15,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthentication_005f0.setProperty("principal.username");
    int _jspx_eval_security_005fauthentication_005f0 = _jspx_th_security_005fauthentication_005f0.doStartTag();
    if (_jspx_th_security_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_security_005fauthentication_005f0);
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f0.setParent(null);
    // /pages/aside.jsp(39,24) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setAccess("hasRole('ADMIN')");
    int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("                            <a\n");
      out.write("                                    href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/findAll.do\"> <i\n");
      out.write("                                    class=\"fa fa-circle-o\"></i> 用户管理\n");
      out.write("                            </a>\n");
      out.write("                        ");
    }
    if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
    return false;
  }
}
