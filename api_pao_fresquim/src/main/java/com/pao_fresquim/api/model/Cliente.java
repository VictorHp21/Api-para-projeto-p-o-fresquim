package com.pao_fresquim.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private String email;
    private String endereco;

    private Boolean status_serasa;
    private Float saldo_devedor;

    // teste

    //relacionamentos:


    public Cliente(){}

    public Cliente(String nome, String telefone, String email, String endereco, boolean status_serasa, Float saldo_devedor) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.status_serasa = status_serasa;
        this.saldo_devedor = saldo_devedor;
    }




    // getters


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean isStatus_serasa() {
        return status_serasa;
    }

    public Float getSaldo_devedor() {
        return saldo_devedor;
    }

   // setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setStatus_serasa(boolean status_serasa) {
        this.status_serasa = status_serasa;
    }

    public void setSaldo_devedor(Float saldo_devedor) {
        this.saldo_devedor = saldo_devedor;
    }
}
