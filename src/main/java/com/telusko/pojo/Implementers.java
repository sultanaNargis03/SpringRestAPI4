package com.telusko.pojo;

import java.util.Arrays;
import java.util.List;

public class Implementers 
{
	private Integer Id;
	private String name;
	private String city;
	private String[] teamNames;
	private List<String> studies;
	
//	public Implementers() {
//		System.out.println("Impl pojo obj zero param cons");
//	}
//	public Implementers(Integer id, String name, String city) {
//		super();
//		Id = id;
//		this.name = name;
//		this.city = city;
//	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String[] getTeamNames() {
		return teamNames;
	}
	public void setTeamNames(String[] teamNames) {
		this.teamNames = teamNames;
	}
	public List<String> getStudies() {
		return studies;
	}
	public void setStudies(List<String> studies) {
		this.studies = studies;
	}
	@Override
	public String toString() {
		return "Implementers [Id=" + Id + ", name=" + name + ", city=" + city + ", teamNames="
				+ Arrays.toString(teamNames) + ", studies=" + studies + "]";
	}
	
	
}
