package com.wolken.wolkenapp.Service;

import java.util.List;

import com.wolken.wolkenapp.dto.TeamsDTO;

public interface IplService {
	public String ValidateAndSave(TeamsDTO teamsdto);
	public String ValidateAndDelete(String teamName);
	public String ValidateAndUpdate(String teamName,String teamCaptain);
	public List<TeamsDTO> getAllValues();

}
