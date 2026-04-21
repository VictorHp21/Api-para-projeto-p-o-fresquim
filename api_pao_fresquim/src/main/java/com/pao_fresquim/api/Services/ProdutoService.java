package com.pao_fresquim.api.Services;

import com.pao_fresquim.api.Repositories.ProdutoRepository;
import com.pao_fresquim.api.model.Funcionario;
import com.pao_fresquim.api.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public class ProdutoService {

    private final ProdutoRepository repository;


    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarProdutos(){
        return repository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id){
        return repository.findById(id);
    }

    public Produto cadastrarCliente(Produto produto){
        return  repository.save(produto);
    }

    // metodo atualizar preço

    public Produto atualizarPreco(Long id, Double novoPreco){
        Produto p = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado"));

        if (novoPreco == null || novoPreco <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Preço inválido");
        }

        p.setPreco(novoPreco);

         return  repository.save(p);
    }
}
