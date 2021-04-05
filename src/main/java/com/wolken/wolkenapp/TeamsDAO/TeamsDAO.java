package com.wolken.wolkenapp.TeamsDAO;

import java.util.List;

import com.wolken.wolkenapp.Exception.IplException;
import com.wolken.wolkenapp.dto.TeamsDTO;

public interface TeamsDAO {

	public String save(TeamsDTO teamsdto);
	public String deleteTeam(String teamName);
	public String updateCaptainByTeam(String teamname,String captain) throws IplException;
	public List<TeamsDTO> getAllTeams();

}
