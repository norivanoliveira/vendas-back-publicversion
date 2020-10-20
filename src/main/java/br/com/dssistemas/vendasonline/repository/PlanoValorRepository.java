package br.com.dssistemas.vendasonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dssistemas.vendasonline.model.PlanoValor;

@Repository
public interface PlanoValorRepository extends JpaRepository<PlanoValor, Integer> {
	
	List<PlanoValor> findAllWithCity(Integer idCidade, String tipoPlano);
	
	List<PlanoValor> findAllWithoutCity(String tipoPlano);
	
	PlanoValor findByKeyWithDetail(Integer idPlanoValor);
}