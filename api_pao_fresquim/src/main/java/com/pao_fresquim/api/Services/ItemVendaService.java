package com.pao_fresquim.api.Services;

import com.pao_fresquim.api.Repositories.ItemVendaRepository;
import com.pao_fresquim.api.model.Funcionario;
import com.pao_fresquim.api.model.ItemVenda;
import com.pao_fresquim.api.model.Venda;

import java.util.List;

public class ItemVendaService {

    private final ItemVendaRepository repository;

    public ItemVendaService (ItemVendaRepository repository){
        this.repository = repository;
    }

    public List<ItemVenda> listarItens(){
        return repository.findAll();
    }
}
