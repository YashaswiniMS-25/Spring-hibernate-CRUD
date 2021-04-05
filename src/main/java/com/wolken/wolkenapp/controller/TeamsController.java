package com.wolken.wolkenapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.Service.IplService;
import com.wolken.wolkenapp.Service.IplServiceImpl;
import com.wolken.wolkenapp.TeamsDAO.TeamsDAO;
import com.wolken.wolkenapp.dto.TeamsDTO;

@Component
@RequestMapping("/")
public class TeamsController {
Logger logger=Logger.getLogger("TeamsController");
	
	@Autowired
	TeamsDAO teamsdao;
	@Autowired
	IplService iplservice ;

	@RequestMapping("/teams.do")
	
	public String save(@ModelAttribute TeamsDTO teamsdto,HttpServletRequest req) {
		logger.info("Inside Save");
		
		String msg=iplservice.ValidateAndSave(teamsdto);
		req.setAttribute("message", msg);
		return "home.jsp";
		
	}


	@RequestMapping("/delete.do")
	
	public String delete(String teamName,HttpServletRequest req) {
	//	logger.info("inside delete");
		
		//String msg=iplservice.ValidateAndDelete(teamName);
		String msg=iplservice.ValidateAndDelete(teamName);
		req.setAttribute("message", msg);
		return "home.jsp";
		
	}
	
	
	@RequestMapping("/update.do")
	public String update(String teamName, String teamCaptain, HttpServletRequest req) {
    logger.info("inside update");
		
		String msg=iplservice.ValidateAndUpdate(teamName, teamCaptain);
		
		req.setAttribute("message", msg);
		
		return "home.jsp";
		
	}
	@RequestMapping("/ok.do")
	public String getall( HttpServletRequest req) {
		
		//List<TeamsDTO> teams=iplservice.getAllValues();
		List<TeamsDTO> teams=iplservice.getAllValues();
		
		req.setAttribute("teams",teams);
		return "display.jsp";
	}
}

