package br.com.dssistemas.vendasonline.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dssistemas.vendasonline.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	public List<Cidade> findByIdEstadoOrderByNome(Integer idEstado);
}