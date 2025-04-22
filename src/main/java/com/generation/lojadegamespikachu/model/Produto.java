package com.generation.lojadegamespikachu.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Informação sobre o Nome é obrigatório")
	@Size(min = 3, max = 200, message = "A informação deve conter no mínimo 3 caracteres")
	private String nome;
	
	@NotBlank(message = "Informação sobre descrição é obrigatório")
	@Size(min = 3, max = 200, message = "A informação deve conter no mínimo 3 caracteres")
	private String descricao;
	
	@NotNull(message = "O Preço é obrigatório")
	@Positive(message = "O preço deve ser maior do que zero!")
	private BigDecimal preco;
	
	@NotNull(message = "O Frete é obrigatório")
	@Positive(message = "O frete deve ser maior do que zero!")
	private BigDecimal frete;
	
	@NotBlank(message = "Informação sobre o Fornecedor é obrigatório")
	@Size(min = 3, max = 200, message = "A informação deve conter no mínimo 3 caracteres")
	private String fornecedor;
	
	@NotBlank(message = "Informação sobre o Origem é obrigatório")
	@Size(min = 3, max = 200, message = "A informação deve conter no mínimo 3 caracteres")
	private String origem;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public BigDecimal getFrete() {
		return frete;
	}

	public void setFrete(BigDecimal frete) {
		this.frete = frete;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
