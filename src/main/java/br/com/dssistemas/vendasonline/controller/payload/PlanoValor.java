package br.com.dssistemas.vendasonline.controller.payload;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.dssistemas.vendasonline.model.audit.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class PlanoValor {
	    

		private static final long serialVersionUID = 5720717308263157996L;


	    private Integer id;

	    private Integer qtdPessoa;
		
		
	    private String periodicidade;
		
	    
	    public PlanoValor() {

	    }
}
