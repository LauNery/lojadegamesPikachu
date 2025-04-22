package com.generation.lojadegamespikachu.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojadegamespikachu.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	public List<Produto> findAllBydescricaoContainingIgnoreCase(@Param("descricao") String descricao);
	
	public List<Produto> findAllByPreco(@Param("preco") BigDecimal preco);
	
	public List<Produto> findAllByFrete(@Param("frete") BigDecimal frete);
	
	public List<Produto> findAllByFornecedorContainingIgnoreCase(@Param("fornecedor") String fornecedor);
	
	public List<Produto> findAllByOrigemContainingIgnoreCase(@Param("origem") String origem);
}
