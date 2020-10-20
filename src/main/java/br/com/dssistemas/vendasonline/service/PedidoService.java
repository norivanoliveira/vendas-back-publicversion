package br.com.dssistemas.vendasonline.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.dssistemas.vendasonline.controller.payload.Pedido;
import br.com.dssistemas.vendasonline.controller.payload.PedidoResponse;

@Service
public class PedidoService  {
	
	private static final String TOKEN="HIPLDdnfkdld1234@33&%###%322334";
	
	public PedidoResponse processarPedido(Pedido pedido) throws URISyntaxException {
	    
		//Envia pedido dsodonto
		RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:8080/ds-odonto-cloud"+"/rest/pedidos";
	    URI uri = new URI(baseUrl);
	    
	    HttpHeaders headers = new HttpHeaders();
	    headers.set("x-api-token", TOKEN);     
	    HttpEntity<Pedido> request = new HttpEntity<>(pedido, headers);
	    ResponseEntity<PedidoResponse> result = restTemplate.postForEntity(uri, request, PedidoResponse.class);
		return result.getBody();
	}
	
	
}