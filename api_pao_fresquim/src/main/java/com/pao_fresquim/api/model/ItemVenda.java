package com.pao_fresquim.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ItensVendas")
public class ItemVenda {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantidade;
    private Double preco_unitario;
    private Double subtotal;

}
