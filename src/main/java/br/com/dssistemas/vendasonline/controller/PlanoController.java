package br.com.dssistemas.vendasonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dssistemas.vendasonline.model.PlanoValor;
import br.com.dssistemas.vendasonline.repository.PlanoValorRepository;

@RestController
@RequestMapping("/planos")
public class PlanoController {

	@Autowired
	PlanoValorRepository planoValorRepo;
    
    @GetMapping("/{idCidade}/{tipoPlano}")
    public ResponseEntity<?> listAllUfs(@PathVariable("idCidade") Integer idCidade, @PathVariable("tipoPlano") String tipoPlano) {
    	List<PlanoValor> listPlanoValor =  planoValorRepo.findAllWithCity(idCidade, tipoPlano);
    	
    	if(listPlanoValor == null || listPlanoValor.isEmpty()) {
    		listPlanoValor =  planoValorRepo.findAllWithoutCity(tipoPlano);
    	}
    	
        return ResponseEntity.ok(listPlanoValor);
    }
    
    @GetMapping("/{idPlanoValor}")
    public ResponseEntity<?> listAllUfs(@PathVariable("idPlanoValor") Integer idPlanoValor) {
        return ResponseEntity.ok(planoValorRepo.findByKeyWithDetail(idPlanoValor));
    }

}