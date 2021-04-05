package com.wolken.wolkenapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.Exception.IplException;
import com.wolken.wolkenapp.TeamsDAO.TeamsDAO;
import com.wolken.wolkenapp.dto.TeamsDTO;
@Component
public class IplServiceImpl implements IplService {
	@Autowired
	TeamsDAO teamsdao;

	@Override
	public String ValidateAndSave(TeamsDTO teamsdto) {
		try {
			if(teamsdto!=null) {
				if(teamsdto.getTeamName().length()<20) {
					if(teamsdto.getHomeGround().length()<20) {
						if(teamsdto.getTeamCaptain().length()<20) {
							return teamsdao.save(teamsdto);
							
							
						}
					}
				}
			}
			
			
	
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		
		return "failed";
	}

	@Override
	public String ValidateAndDelete(String teamName) {
		try {
			
			if(teamName!=null) {
				
				return teamsdao.deleteTeam(teamName);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}


		return "failed";
	}

	
	
	
	
	
	
	@Override
	public String ValidateAndUpdate(String teamName, String teamCaptain) {
		try {
		if(teamName!=null && teamCaptain!=null) {
			return teamsdao.updateCaptainByTeam(teamName, teamCaptain);
		}
		else {
			throw new IplException();
		}
		}catch(IplException e) {
			e.printStackTrace();			
		}

		return "Failed";
	}

	@Override
	public List<TeamsDTO> getAllValues() {
		System.out.println("inside service");
		List<TeamsDTO> dto=teamsdao.getAllTeams();
		return dto; 
	}
	

}
