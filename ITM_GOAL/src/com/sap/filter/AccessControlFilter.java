/**
 * Servlet Filter
 */
package com.sap.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Access Control Header added
 * @author C5078697
 *
 */
public class AccessControlFilter implements Filter {

  public void doFilter(ServletRequest req, ServletResponse res, FilterChain fc) throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse) res;
    response.setHeader("Access-Control-Allow-Headers", "value, accept, key, Authorization, content-type");
    response.setHeader("Access-Control-Allow-Origin", "*");
    fc.doFilter(req, res);
  }

  public void destroy() {

  }

  @Override
  public void init(FilterConfig arg0) throws ServletException {
  }
}