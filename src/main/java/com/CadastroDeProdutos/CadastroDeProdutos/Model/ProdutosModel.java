package com.CadastroDeProdutos.CadastroDeProdutos.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_Produtos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdutosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Long quantidade;
    private Double valor;
    private Double total;

    public Double getTotal() {
        return quantidade * valor;
    }
}
