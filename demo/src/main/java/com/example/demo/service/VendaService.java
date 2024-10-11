package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Venda;
import com.example.demo.repository.VendaRepository;

@Service
public class  VendaService {
    private VendaRepository vendaRepository;

     public List<Venda> findAll(){
        return vendaRepository.findAll();
    }
    

     public Optional<Venda> getById(Long Id){
        return vendaRepository.findById(Id);
    }

    public void deleteById(Long Id){
        vendaRepository.deleteById(Id);
    }
    

        public Venda saveVenda(Venda venda) {
        return vendaRepository.save(venda);
    }
}
