package com.springboot.main;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CORSFilter implements Filter {

	public static final String SMUNIVERSALID = "sm_universalid";
	public static final String GUID = "GUID";
	public static final String REFERRER_HEADER = "Referer";

	// CORS
	public static final String PUBLIC_GUID_COOKIE_NAME = "blueboxpublic";
	public static final String WEB_URL_ORIGIN_HEADER = "Origin";
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		response.addHeader("Access-Control-Allow-Origin", "*"); //Any external website can access resources in GMIP.
        // CORS "pre-flight" request
		response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
		response.addHeader("Access-Control-Allow-Headers", "GUID, Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
		response.addHeader("Access-Control-Allow-Credentials", "true");
		response.addHeader("Access-Control-Max-Age", "600");
		filterChain.doFilter(req, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		//Method Auto-generated
	}
	
	@Override
	public void destroy() {
		//Method Auto-generated
	}
}