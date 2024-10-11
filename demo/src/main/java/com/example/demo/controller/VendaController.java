package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Venda;
import com.example.demo.service.VendaService;

@RestController
@RequestMapping("api/v1/venda")
public class VendaController {
    @Autowired
    private VendaService vendaService;
   
    
    @GetMapping("/{id}")
    public java.util.Optional<Venda> findById(Long id){
        return vendaService.getById(id);
    }

    @GetMapping 
    public List<Venda> findAll(){
        return vendaService.findAll();
    }

    @PostMapping(value ="/add")
    public Venda createVenda(@RequestBody Venda venda) {
        return vendaService.saveVenda(venda);
    }

    @DeleteMapping("id/{id}")
    public void deleteVendaById(@PathVariable Long id){
        vendaService.deleteById(id);
    }
}
