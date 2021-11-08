package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.apirest.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}