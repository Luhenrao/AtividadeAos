package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Produto;
import com.example.demo.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

    public void RemoverProdutoEstoque(Produto produto);
}
