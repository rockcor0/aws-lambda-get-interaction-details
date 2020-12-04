package com.genesyscloud.interactiondetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.genesyscloud.interactiondetails.model.Participant;
import com.genesyscloud.interactiondetails.model.Segment;
import com.genesyscloud.interactiondetails.model.Session;
import com.genesyscloud.interactiondetails.services.RestClient;
import com.genesyscloud.interactiondetails.services.vo.VOGetUser;
import com.genesyscloud.interactiondetails.services.vo.VOInteractionDetailsResponse200;
import com.genesyscloud.interactiondetails.services.vo.VOInteractionRequest;
import com.genesyscloud.interactiondetails.services.vo.VOQueueAgentResponse;
import com.genesyscloud.interactiondetails.util.ResponseMessage;

@SpringBootApplication
public class LambdaGcInteractionsDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaGcInteractionsDetailsApplication.class, args);

//		VOInteractionRequest voInt = new VOInteractionRequest();
//		
//		voInt.setInteractionId("f935cbb6-1b6f-4e69-bdaf-2e66d671b83b");
//		voInt.setPurecloudUrl("mypurecloud.com");
//		voInt.setToken("iD7FNWPmsoyze-_q5-ehTrz1BWjWPzaZ3WPUSRsTpc5Fe8DpXEB7-ol9cKMkfcwBxp6bp36sgq6G58PbutVSuA");
//		
//		getQueueIdAndAgentId(voInt);
	}

	/**
	 * 
	 * @param conversationId
	 * @return
	 */
	public static ResponseEntity<?> getQueueIdAndAgentId(VOInteractionRequest interactionRequest) {

		RestClient rc = new RestClient();

		VOInteractionDetailsResponse200 voIDetailsResponse200 = rc.conversationDetailsQuery(interactionRequest.getInteractionId(), interactionRequest.getToken(), interactionRequest.getPurecloudUrl());
		
		//VOInteractionDetailsResponse200 voIDetailsResponse200 = rc.conversationDetailsQuery("f935cbb6-1b6f-4e69-bdaf-2e66d671b83b", "iD7FNWPmsoyze-_q5-ehTrz1BWjWPzaZ3WPUSRsTpc5Fe8DpXEB7-ol9cKMkfcwBxp6bp36sgq6G58PbutVSuA", "mypurecloud.com");

		String queueId = getQueueId(voIDetailsResponse200);
		String agentId = getAgentId(voIDetailsResponse200);
		
		System.out.println("queueId = " + queueId);
		System.out.println("agentId = " + agentId);
		
		if(agentId == null)
			return new ResponseEntity<String>("Error", HttpStatus.BAD_REQUEST);

		VOGetUser voGetUser = rc.getUser(agentId, interactionRequest.getToken(), interactionRequest.getPurecloudUrl());
		
		String agentName = voGetUser.getName();
		
		
		System.out.println("agentName = " + agentName);
		
		
		if(queueId == null)
			return new ResponseEntity<String>("Error", HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<VOQueueAgentResponse>(new VOQueueAgentResponse(queueId, agentId, agentName), HttpStatus.OK); 
		
		//String toReturn = queueId + " ||| " + agentId;
		
		//return toReturn;
	}
	
//	public static ResponseEntity<?> getQueueIdAndAgentId(String conversationId) {
//
//		RestClient rc = new RestClient();
//
//		VOInteractionDetailsResponse200 voIDetailsResponse200 = rc.conversationDetailsQuery("8322e1dd-3d79-4038-b210-c661adf41fbe");
//
//		String queueId = getQueueId(voIDetailsResponse200);
//		String agentId = getAgentId(voIDetailsResponse200);
//
//		System.out.println("queueId = " + queueId);
//		System.out.println("agentId = " + agentId);
//		
//		return new ResponseEntity<VOQueueAgentResponse>(new VOQueueAgentResponse(queueId, agentId), HttpStatus.OK); 
//		
//		//return queueId + " ||| " + agentId;
//	}

	private static String getQueueId(VOInteractionDetailsResponse200 voIDetailsResponse200) {

		String queueId = "";

		List<Participant> participants = voIDetailsResponse200.getParticipants();

		for (Participant participant : participants) {

			if(participant.getPurpose().equals("agent")) {
				System.out.println("Porpose " + participant.getPurpose());
				
				List<Session> sessions = participant.getSessions();
				
				for (Session session : sessions) {
					
					List<Segment> segments = session.getSegments();
					
					for (Segment segment : segments) {
						
						if( segment.getQueueId() != null || !(segment.getQueueId().equals(""))) {
							queueId = segment.getQueueId();
						}
					}
				}
			}
		}

		return queueId;

	}

	/**
	 * 
	 * @param voIDetailsResponse200
	 * @return
	 */
	private static String getAgentId(VOInteractionDetailsResponse200 voIDetailsResponse200) {
		String agentId = "";
		
		List<Participant> participants = voIDetailsResponse200.getParticipants();

		for (Participant participant : participants) {

			if(participant.getPurpose().equals("agent")) {
				System.out.println("Porpose " + participant.getPurpose());
				agentId = participant.getUserId();
			}
		}
		
		return agentId;
	}

}
