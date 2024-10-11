package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.example.demo.model.Produto;
import com.example.demo.model.Administrador;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    private String cnpj;
    private Double valor;
    private List<Produto> produto;
    private Administrador administrador;


  @OneToMany
    private Produto produto; //private List<Produto> produtos;
  
}
