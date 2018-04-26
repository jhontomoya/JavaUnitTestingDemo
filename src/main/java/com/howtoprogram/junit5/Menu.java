package com.howtoprogram.junit5;

import Services.Election;
import Services.IElection;

public class Menu {

	public static void main(String[] args) {
		IElection election = new Election();
		String candidateNme = election.getCandidateNameByParty("Axity");
		int numOfVotes =  election.getNumberOfVotesByParty("Axity");
		
		System.out.println(String.format("Names %s - Votes %d", candidateNme, numOfVotes));
	}

}
