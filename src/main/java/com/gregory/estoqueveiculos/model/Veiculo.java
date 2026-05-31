package com.gregory.estoqueveiculos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "veiculos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    private Integer ano;

    private String cor;

    private Double preco;

    private Double quilometragem;

    private String status;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;
}