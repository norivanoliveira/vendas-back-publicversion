package br.com.dssistemas.vendasonline.controller.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class DadosPagamento  {

		private static final long serialVersionUID = 5720717308263157996L;
 
	    private String cartao;
	    
	    private String nome;
	    
	    private String vencimento;
	    
	    private String codigoSeguranca;

	    public DadosPagamento() {

	    }
}