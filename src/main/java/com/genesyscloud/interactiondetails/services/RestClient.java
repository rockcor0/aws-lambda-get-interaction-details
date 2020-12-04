package com.genesyscloud.interactiondetails.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.genesyscloud.interactiondetails.services.vo.VOGetUser;
import com.genesyscloud.interactiondetails.services.vo.VOInteractionDetailsResponse200;

@Component
public class RestClient {



	public static VOInteractionDetailsResponse200 conversationDetailsQuery(String conversationId, String accessToken, String urlPattern) {
		//String accessToken = "ZEQWtQuM72F3fIG5r7GAIDwb1f0ChRasO9nxCX6UTe5UcbADmELdq48E075DsNnynANpdcHDb4x4ZpblUH1hOQ";
		String url = "https://api."+urlPattern+"/api/v2/analytics/conversations/"+conversationId+"/details";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "+accessToken);
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<VOInteractionDetailsResponse200> voInDetailsResponse200 = restTemplate.exchange(url, HttpMethod.GET, entity, VOInteractionDetailsResponse200.class);

		//VOInteractionDetailsResponse200 voInDetailsResponse200 = restTemplate.getForObject(url, VOInteractionDetailsResponse200.class, entity);

		System.out.println("ConversationId: "+voInDetailsResponse200.getBody().getConversationId());

		return voInDetailsResponse200.getBody();
	}

	public VOGetUser getUser(String agentId, String accessToken, String urlPattern) {
		String url = "https://api."+urlPattern+"/api/v2/users/"+agentId;

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "+accessToken);
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<VOGetUser> voGetUser = restTemplate.exchange(url, HttpMethod.GET, entity, VOGetUser.class);

		//VOInteractionDetailsResponse200 voInDetailsResponse200 = restTemplate.getForObject(url, VOInteractionDetailsResponse200.class, entity);

		System.out.println("UserId: "+voGetUser.getBody().getId());

		return voGetUser.getBody();
	}


}
