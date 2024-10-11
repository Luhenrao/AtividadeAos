package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Venda {
    
    
    @Id
    @GeneratedValue
    private Long id;
    
    private Double valor;

    private Double desconto;
    
    @OneToMany
    private Produto produto; //private List<Produto> produtos;
    

}
