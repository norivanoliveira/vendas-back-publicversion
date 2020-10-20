package br.com.dssistemas.vendasonline.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.dssistemas.vendasonline.model.audit.DateAudit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Table(name = "MOVALORT")
@NamedQueries({@NamedQuery(name = "PlanoValor.findAllWithCity", query = "select new PlanoValor(e.id, p.nome, p.descricao, p.id, e.valorTitular, e.valorDependente, e.idCidade) from PlanoValor e, Plano p where p.id=e.idPlano and e.idCidade=?1 and p.tipoPlano=?2 order by p.nome ")
, @NamedQuery(name = "PlanoValor.findAllWithoutCity", query = "select new PlanoValor(e.id, p.nome, p.descricao, p.id, e.valorTitular, e.valorDependente, e.idCidade) from PlanoValor e, Plano p where p.id=e.idPlano and e.idCidade is null and p.tipoPlano=?1 order by p.nome ")
, @NamedQuery(name = "PlanoValor.findByKeyWithDetail", query = "select new PlanoValor(e.id, p.nome, p.descricao, p.id, e.valorTitular, e.valorDependente, e.idCidade) from PlanoValor e, Plano p where p.id=e.idPlano and e.id=?1 order by p.nome ")})
public class PlanoValor{

		private static final long serialVersionUID = 5720717308263157996L;

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "MOVIDPLV", nullable = false)
	    private Integer id;

		@Column(name = "MOVIDPLA", nullable = false)
	    private Integer idPlano;

		@Column(name = "MOVVALOR", nullable = false)
	    private BigDecimal valorTitular;
		

		@Column(name = "MOVVALOD", nullable = false)
	    private BigDecimal valorDependente;

		@Column(name = "MOVIDCIT", nullable = true)
	    private Integer idCidade;
	    
	    @Transient
	    private String nomePlano;
	    
	    @Transient
	    private String descricaoPlano;

	    
	    public PlanoValor() {

	    }
	    
	    public PlanoValor(Integer id, String nomePlano, String descricaoPlano, Integer idPlano, BigDecimal valor, BigDecimal valorD, Integer idCidade) {
	    	this.id = id;
	    	this.nomePlano = nomePlano;
	    	this.descricaoPlano = descricaoPlano;
	    	this.idPlano = idPlano;
	    	this.valorTitular = valor;
	    	this.valorDependente = valorD;
	    	this.idCidade = idCidade;

	    }
}
