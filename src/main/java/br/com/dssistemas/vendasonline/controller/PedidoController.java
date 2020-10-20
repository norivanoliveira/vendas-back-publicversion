package br.com.dssistemas.vendasonline.controller;

import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dssistemas.vendasonline.controller.payload.Pedido;
import br.com.dssistemas.vendasonline.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	private static final String TOKEN="HIPLDdnfkdld1234@33&%###%322334";
	
	@Autowired
	PedidoService service;

    @PostMapping
    public ResponseEntity<?> salvarPedido(@Valid @RequestBody Pedido pedido) throws URISyntaxException {

    	return ResponseEntity.ok(service.processarPedido(pedido));
    	
    
    }
}