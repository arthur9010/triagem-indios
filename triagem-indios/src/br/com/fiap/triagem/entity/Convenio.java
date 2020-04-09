package br.com.fiap.triagem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CONVENIO")
@SequenceGenerator(name="convenio", sequenceName="SQ_TB_CONVENIO", allocationSize=1)
public class Convenio {
	
	public Convenio() {
		super();
	}

	public Convenio(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Id
	@Column(name="cd_convenio")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="convenio")
	private int codigo;
	
	@Column(name="nm_razao_social", nullable=false, length=50)
	private String razaoSocial;
	
	@Column(name="nr_cnpj", nullable=false, length=14)
	private String cnpj;

}