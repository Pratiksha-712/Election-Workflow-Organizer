package com.tka.eciclient;

import java.util.List;

import com.tka.ECIcontroller.ECIController;
import com.tka.entity.Candidate;

public class ECIClient {
	
	public static void main(String[] args) throws Exception {
		
		ECIController controller = new ECIController();
		//List<Candidate> allCandidates = controller.getAllCandidates();
		
		//List<Candidate> updateAllCandidates = controller.updateAllCandidates();
		
		//List<Candidate> deleteAllCandidates = controller.deleteAllCandidates();
		
//		List<Candidate> allBJPCandidates = controller.getAllBJPCandidates();
//		System.out.println(allBJPCandidates);
		
//		List<Candidate> allNCPCandidates = controller.getAllNCPCandidates();
//		System.out.println(allNCPCandidates);
		
		List<Candidate> allIndependentCandidates = controller.getAllIndependentCandidates();
		System.out.println(allIndependentCandidates);
		
		
	}

}
