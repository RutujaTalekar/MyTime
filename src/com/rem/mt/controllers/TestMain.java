package com.rem.mt.controllers;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.rem.mt.entities.ReopenRequest;
import com.rem.mt.services.ReopenRequestServices;


@Controller
public class TestMain {
	
	@Resource
	private ReopenRequestServices reopenrequestServices;
		
		//Temporary Manager login page to fetch resp. emps under given managerId
		@RequestMapping("/loginManager.mt")
		public ModelAndView logInManager() {
			ModelAndView mv = new ModelAndView("LoginManager");
			return mv;
		}
		
		//Would fetch mid(eid) from session
		@RequestMapping("/displayReopenRequests.mt")
		public ModelAndView getAllReopenRequests(HttpServletRequest request) {
			int eid = Integer.parseInt(request.getParameter("eid"));
			List<ReopenRequest> reopenRequestList = reopenrequestServices.displayReopenRequestList(eid);
			
			for(ReopenRequest reopenRequesti: reopenRequestList) { 
				System.out.println(reopenRequesti);
			}
			ModelAndView mv = new ModelAndView("DisplayReopenRequests");
			mv.addObject("list",reopenRequestList);
			return mv;
		}
		
		//Displays request form
		@RequestMapping("/sendRequestPage.mt")
		public ModelAndView getRegistrationPage()  {
			ModelAndView mv=new ModelAndView("SendRequest");
				return mv;
		}
		
		//Inserts request in DB
		@RequestMapping("/sendRequest.mt")
		public String sendRequest(HttpServletRequest request) throws ParseException {
			ReopenRequest reopen = new ReopenRequest();

			//Eid will be taken using session
			int eid = Integer.parseInt(request.getParameter("eid"));
			reopen.seteId(eid);
		
			String r = request.getParameter("rdate");
			Date rdate = Date.valueOf(r);
			reopen.setReopenDate(rdate);
			
			String rReason = request.getParameter("reason");
			reopen.setReopenReason(rReason);
			
			//By default it would be pending
			reopen.setReopenStatus("Pending");
			
			reopenrequestServices.addReopenRequest(reopen);
			
			return "SendRequest";	
		}
		
		//To Approve request
		@RequestMapping("/updateAprrove.mt")
		public ModelAndView updateApprove(@RequestParam("id") int rid) {
			ModelAndView mv = new ModelAndView("LoginManager");
			System.out.println(rid);
	
			boolean status = reopenrequestServices.findReopenRequestApprove(rid);
			if(status==true)
			{
				System.out.println("True");
			}
			return mv;
		}
		
		//To Reject request
		@RequestMapping("/updateReject.mt")
		public ModelAndView updateReject(@RequestParam("id") int rid) {
			ModelAndView mv = new ModelAndView("LoginManager");
	
			boolean status = reopenrequestServices.findReopenRequestReject(rid);
			if(status==true)
			{
				System.out.println("True");
			}
			return mv;
		}
}
