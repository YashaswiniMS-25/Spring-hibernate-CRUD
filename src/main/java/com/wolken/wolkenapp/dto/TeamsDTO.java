package com.wolken.wolkenapp.dto;



import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Getter
@Setter
@Component
@Entity
@ToString
@EqualsAndHashCode
@Table(name="ipl_teams")
@NamedQueries({
@NamedQuery(name = "delete", query ="delete from TeamsDTO td where td.teamName= :team"),
@NamedQuery(name = "selectAll", query = "from TeamsDTO td")})

public class TeamsDTO {
	@Id
	@Column(name="team_id")
	private int teamId;
	@Column(name="team_name")
	private String teamName;
	@Column(name="home_ground")
	private String homeGround;
	@Column(name="team_captain")
	private String teamCaptain;
	
	
	
}
