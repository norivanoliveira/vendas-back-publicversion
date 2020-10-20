package br.com.dssistemas.vendasonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Table(name = "MS8MUNIT")
public class Cidade  {


	private static final long serialVersionUID = 57730898263157996L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MS8IDMUN", nullable = false)
    private Integer id;

	@Column(name = "MS8NMMUN", nullable = true)
    private String nome;

	@Column(name = "MS8IDEST", nullable = true)
    private Integer idEstado;

	    
	    public Cidade() {

	    }
}
