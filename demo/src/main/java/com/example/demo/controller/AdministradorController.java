package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Administrador;
import com.example.demo.service.AdministradorService;
import org.springframework.web.bind.annotation.RestController;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/api/adm/")
public class  AdministradorController {

    
    @Autowired
    private AdministradorService administradorService;

    @GetMapping("all/")
    public List<Administrador> getDeputado(){
        return administradorService.findAll();
    }

    @GetMapping("id/{id}/")
    public Administrador getUserById (@PathVariable ("id") Long id){
        try {
            return  administradorService.findById(id);
        } catch (ResourceNotFoundException e) {
            return null;
        }
    }

    @GetMapping("nome/{nome}/")
    public Administrador getUserByName (@PathVariable ("nome") String nome){
        try {
            return  administradorService.findByNome(nome);
        } catch (ResourceNotFoundException e) {
            return null;
        }
    }

    @PostMapping(value = "add/")
    public void insiraAdministrador(@RequestBody Administrador administrador ){
        administradorService.insertUser(administrador);
    }

    @PutMapping("update/{id}/")
    public void updateNome (@PathVariable ("id") Long id, @RequestBody String nome){
        try {
            administradorService.updateNome(id, nome);
        } catch (ResourceNotFoundException e) {

        }
    }

    @DeleteMapping("{id}/")
    public void deleteAdministrador(@PathVariable Long id){
        try {
            administradorService.deleteById(id);
        } catch (ResourceNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @DeleteMapping("nome/{nome}")
    public void deleteUserByNome(@PathVariable String nome){
        try {
            administradorService.deleteByNome(nome);
        } catch (ResourceNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}