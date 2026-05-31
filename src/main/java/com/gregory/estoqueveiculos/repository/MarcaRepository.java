package com.gregory.estoqueveiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gregory.estoqueveiculos.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}