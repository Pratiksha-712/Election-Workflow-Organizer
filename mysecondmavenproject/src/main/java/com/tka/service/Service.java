package com.tka.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.dao.Dao;
import com.tka.entity.Candidate;

public class Service {
	
	public List<Candidate> getAllCandidates(){
		System.out.println("we are inside service");
		Dao dao = new Dao();
		List<Candidate> allCandidates = dao.getAllCandidates();
		return allCandidates;
	}
	
	public List<Candidate> updateAllCandidates() throws SQLException{
		Dao dao = new Dao();
		List <Candidate>allCandidates = dao.updateAllCandidates();
		return allCandidates ;
		
	}
	
	public List<Candidate> deleteAllCandidates() throws Exception{
		Dao dao = new Dao();
		List<Candidate>allCandidates = dao.deleteAllCandidates();
		return allCandidates;
		
	}
	
	public List<Candidate> getAllBJPCandidates(){
		Dao dao = new Dao();
		List<Candidate> allCandidates = dao.getAllCandidates();
		ArrayList<Candidate> allncpcandidates = new ArrayList<Candidate>();
		
		for(Candidate c :allCandidates) {
			if(c.getPartyname().equals("BJP")) {
				allncpcandidates.add(c);
			}
		}
		return allncpcandidates;
		
	}
	
	public List<Candidate> getAllNCPCandidates(){
		Dao dao = new Dao();
		List<Candidate> allCandidates = dao.getAllCandidates();
		ArrayList<Candidate> allncpcandidates = new ArrayList<Candidate>();
		
		for(Candidate c :allCandidates) {
			if(c.getPartyname().equals("NCP")) {
				allncpcandidates.add(c);
			}
		}
		return allncpcandidates;
		
	}
	
	public List<Candidate> getAllIndependentCandidates(){
		Dao dao = new Dao();
		List<Candidate> allCandidates = dao.getAllCandidates();
		ArrayList<Candidate> allindependentcandidates = new ArrayList<Candidate>();
		
		for(Candidate c :allCandidates) {
			if(c.getPartyname().equals("Independent")) {
				allindependentcandidates.add(c);
			}
		}
		return allindependentcandidates ;
		
	}
	
	
}
