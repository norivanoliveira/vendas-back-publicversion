package br.com.dssistemas.vendasonline.controller.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Cliente  {
	    

		private static final long serialVersionUID = 5720717308263157996L;


	    private String nome;
		
		
	    private String razaoSocial;
		
	    private String cpfCnpj;
	    
	    private String dataNascimento;
	    
	    private String email;
	    
		private String telefone;
		
	   
	    private String logradouro;
	    
	    private String numero;
	    
	    private String complemento;
	    
	    private String bairro;
	    
	    private String cep;
	    
	    private Integer idCidade;
	    
	    public Cliente() {

	    }
}
