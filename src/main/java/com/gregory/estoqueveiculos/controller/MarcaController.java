package com.gregory.estoqueveiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gregory.estoqueveiculos.model.Marca;
import com.gregory.estoqueveiculos.repository.MarcaRepository;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping
    public List<Marca> listar() {
        return marcaRepository.findAll();
    }

    @PostMapping
    public Marca salvar(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }
}