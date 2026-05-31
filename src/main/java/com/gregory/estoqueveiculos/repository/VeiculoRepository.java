package com.gregory.estoqueveiculos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gregory.estoqueveiculos.model.Veiculo;

@SuppressWarnings("rawtypes")
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByStatus(String status);

    List<Veiculo> findByAno(Integer ano);

    List<Veiculo> findByModeloContainingIgnoreCase(String modelo);

    List<Veiculo> findByMarcaNomeContainingIgnoreCase(String nome);

    List<Veiculo> findByPrecoLessThanEqual(Double preco);

}