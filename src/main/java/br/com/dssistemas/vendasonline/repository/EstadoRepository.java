package br.com.dssistemas.vendasonline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dssistemas.vendasonline.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}