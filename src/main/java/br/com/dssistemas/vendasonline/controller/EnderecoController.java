package br.com.dssistemas.vendasonline.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dssistemas.vendasonline.controller.payload.DomainNumberKeyResponse;
import br.com.dssistemas.vendasonline.model.Cidade;
import br.com.dssistemas.vendasonline.model.Estado;
import br.com.dssistemas.vendasonline.repository.CidadeRepository;
import br.com.dssistemas.vendasonline.repository.EstadoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

	@Autowired
	CidadeRepository cidade;
	
	@Autowired
	EstadoRepository estado;

    @GetMapping("/ufs")
    public ResponseEntity<?> listAllUfs() {
    	
    	List<Estado> listaEstados = estado.findAll();
    	List<DomainNumberKeyResponse> listaResult =  new ArrayList<>();
    	
    	for(Estado estado: listaEstados) {
    		DomainNumberKeyResponse item = new DomainNumberKeyResponse();
    		item.setValue(estado.getId());
    		item.setText(estado.getNome());
    		listaResult.add(item);
    	}

        return ResponseEntity.ok(listaResult);
    }
    
    @GetMapping("/ufs/{idUf}/cidades")
    public ResponseEntity<?> listCidadesPorUfs(@PathVariable("idUf") Integer idUf) {

    	List<Cidade> listaCidades = cidade.findByIdEstadoOrderByNome(idUf);
    	List<DomainNumberKeyResponse> listaResult =  new ArrayList<>();
    	
    	for(Cidade cidade: listaCidades) {
    		DomainNumberKeyResponse item = new DomainNumberKeyResponse();
    		item.setValue(cidade.getId());
    		item.setText(cidade.getNome());
    		listaResult.add(item);
    	}

        return ResponseEntity.ok(listaResult);
    }

}