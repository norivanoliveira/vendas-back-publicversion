package br.com.dssistemas.vendasonline.controller.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class PedidoResponse{

		private static final long serialVersionUID = 5720717308263157996L;
   
	    private String mensagem;

	    private String situacao;
	    
	    private String urlBoleto;
	    

	    public PedidoResponse() {

	    }
}