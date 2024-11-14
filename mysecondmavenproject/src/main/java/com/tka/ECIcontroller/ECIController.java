package com.tka.ECIcontroller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tka.dao.Dao;
//import com.tka.dao.Dao;
import com.tka.entity.Candidate;
import com.tka.service.Service;

public class ECIController {
	Service service = null;
	public List<Candidate> getAllCandidates(){
		System.out.println("we are inside ECIController");
		
		service = new Service();
		List<Candidate> allCandidates = service.getAllCandidates();
		
		
		return allCandidates;
	}
	
	public List<Candidate> updateAllCandidates() throws SQLException{
		service = new Service();
		List <Candidate>allCandidates = service.updateAllCandidates();
		return allCandidates ;
		
	}
	
	public List<Candidate> deleteAllCandidates() throws Exception{
		service = new Service();
		List<Candidate>allCandidates = service.deleteAllCandidates();
		return allCandidates;
		
	}
	public List<Candidate> getAllBJPCandidates(){
		service = new Service();
		List<Candidate> bjpcandidate = service.getAllBJPCandidates();
		return  bjpcandidate;
		
		
	}
	
	public List<Candidate> getAllNCPCandidates(){
		service = new Service();
		List<Candidate> ncpcandidate = service.getAllNCPCandidates();
		return  ncpcandidate;
		
		
	}
	
	public List<Candidate> getAllIndependentCandidates(){
		service = new Service();
		List<Candidate> allIndependentCandidates = service.getAllIndependentCandidates();
		return  allIndependentCandidates;
		
		
	}
	
	

}
