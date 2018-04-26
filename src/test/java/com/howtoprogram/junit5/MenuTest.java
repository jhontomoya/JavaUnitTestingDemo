package com.howtoprogram.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import Services.Election;
import Services.ElectionMock;
import Services.IElection;

class MenuTest {

	@Test
	void getNameByPartyTest() {
		IElection election = new ElectionMock();
		String candidateName = election.getCandidateNameByParty("Axity");
		int numOfVotes = election.getNumberOfVotesByParty("Axity");
		
		assertEquals("Prueba", candidateName);
		assertEquals(10, numOfVotes);
	}
	
	@Test
	void getNameByPartyTestMockito() {
		IElection election = mock(Election.class);
		
		when(election.getCandidateNameByParty("Otra Cosa")).thenReturn("Arturo");
		when(election.getNumberOfVotesByParty("")).thenReturn(0);
		
		String candidateName = election.getCandidateNameByParty("Otra Cosa");
		int numOfVotes = election.getNumberOfVotesByParty("Axity");
		
		assertEquals("Arturo", candidateName);
		assertEquals(0, numOfVotes);
	}

}
