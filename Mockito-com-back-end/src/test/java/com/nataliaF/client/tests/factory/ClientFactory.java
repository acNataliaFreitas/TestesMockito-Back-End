package com.nataliaF.client.tests.factory;

import java.time.Instant;

import com.nataliaF.client.dto.ClientDTO;
import com.nataliaF.client.entities.Client;


public class ClientFactory {
	
	public static Client createClient() {
		return new Client(1L, "Pablo Alberto", "10510824592", 2000.0, Instant.parse("1958-09-20T08:00:00Z"), 1);
	}
	
	public static ClientDTO createClientDTO() {
		return new ClientDTO(createClient());
	}
	
}
