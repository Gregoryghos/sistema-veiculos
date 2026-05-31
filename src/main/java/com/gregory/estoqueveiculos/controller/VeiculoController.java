package com.gregory.estoqueveiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gregory.estoqueveiculos.model.Veiculo;
import com.gregory.estoqueveiculos.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @SuppressWarnings("rawtypes")
    @GetMapping
    public List<Veiculo> listar() {
        return veiculoRepository.findAll();
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/status/{status}")
    public List<Veiculo> buscarPorStatus(@PathVariable String status) {
        return veiculoRepository.findByStatus(status);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/ano/{ano}")
    public List<Veiculo> buscarPorAno(@PathVariable Integer ano) {
        return veiculoRepository.findByAno(ano);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/modelo/{modelo}")
    public List<Veiculo> buscarPorModelo(@PathVariable String modelo) {
        return veiculoRepository.findByModeloContainingIgnoreCase(modelo);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/marca/{nome}")
    public List<Veiculo> buscarPorMarca(@PathVariable String nome) {
        return veiculoRepository.findByMarcaNomeContainingIgnoreCase(nome);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping("/preco/{preco}")
    public List<Veiculo> buscarPorPreco(@PathVariable Double preco) {
        return veiculoRepository.findByPrecoLessThanEqual(preco);
    }

    @SuppressWarnings("rawtypes")
    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {

        Veiculo veiculo = veiculoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Veículo não encontrado"));

        veiculo.setModelo(veiculoAtualizado.getModelo());
        veiculo.setAno(veiculoAtualizado.getAno());
        veiculo.setCor(veiculoAtualizado.getCor());
        veiculo.setPreco(veiculoAtualizado.getPreco());
        veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
        veiculo.setStatus(veiculoAtualizado.getStatus());
        veiculo.setMarca(veiculoAtualizado.getMarca());

        return veiculoRepository.save(veiculo);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        veiculoRepository.deleteById(id);
    }

    public VeiculoRepository getVeiculoRepository() {
        return veiculoRepository;
    }

    public void setVeiculoRepository(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }
}