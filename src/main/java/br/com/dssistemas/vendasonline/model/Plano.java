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
@Table(name = "MODPLANT")
public class Plano  {

		private static final long serialVersionUID = 5720717308263157996L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "MODIDPLA", nullable = false)
	    private Integer id;

		@Column(name = "MODNMPLA", nullable = false)
	    private String nome;

		@Column(name = "MODDSCOR", nullable = true)
	    private String descricao;

		@Column(name = "MODTPVEN", nullable = false)
	    private String tipoPlano;

	    
	    public Plano() {

	    }
}
