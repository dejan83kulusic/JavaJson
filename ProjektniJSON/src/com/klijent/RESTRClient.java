package com.klijent;


import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import com.server.KnjigaDAO;
import com.server.KnjigaDAOS;







public class RESTRClient {

	public static void main(String[] args) {
		ClientConfig clientConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfig);
		WebTarget webTarget = client.target(getBaseURI()).path("rest").path("knjige");
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.get();
		KnjigaDAOS knjigas = response.readEntity(KnjigaDAOS.class);
		for(KnjigaDAO knjiga: knjigas.getKnjigaList()) {
			System.out.println(knjiga);
		}
	}


	private static URI getBaseURI() {
		return UriBuilder.fromUri(
				"http://localhost:8080/KnjigaJSON/").build();
	}
}
