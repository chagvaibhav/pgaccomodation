package com.jalaram.pgaccomodation.interceptors;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeBasedAccessInterceptors extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
	 
		SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss.SSS");
		// Pass date object
		String formatted = formatter.format(date );
		
		System.out.println(formatted + " :: " +date.getTime());
		
		if (Integer.parseInt(formatted.split(":")[0]) >= 20 ){
			response.getWriter().write("Please try Accessing this website between 8 AM to 8 PM. sorry for the inconvenience.");
			return false;
		}
		
		return true;
	}

}
