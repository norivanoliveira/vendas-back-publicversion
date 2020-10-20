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
@Table(name = "MS7ESTAT")
public class Estado {

		private static final long serialVersionUID = 5720717308263157996L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "MS7IDEST", nullable = true)
	    private Integer id;

		@Column(name = "MS7NMEST", nullable = false)
	    private String nome;

		@Column(name = "MS7DSEST", nullable = false)
	    private String sigla;

	    
	    public Estado() {

	    }
}
