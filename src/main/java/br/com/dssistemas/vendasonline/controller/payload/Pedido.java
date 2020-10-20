package br.com.dssistemas.vendasonline.controller.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Pedido  {

		private static final long serialVersionUID = 5720717308263157996L;


	    private Long id;

	    private Cliente cliente;
	    
	    private PlanoValor planoValor;
	    
	    private DadosPagamento dadosCartao;
	    
	    private String formaPagamento;
	    
	    private String situacao;

	    

	    public Pedido() {

	    }
}