package br.com.dssistemas.vendasonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name="MS5PARAT")
public class Parametro {

	private static final long serialVersionUID = 5720717308263157996L;

	@Id
	 @Column(name = "MS5IDPAR", nullable = false) 
	private String id;

	@Column(name = "MS5VAPAR", nullable = true)
	private String valor;

	public Parametro() {

	}
}
