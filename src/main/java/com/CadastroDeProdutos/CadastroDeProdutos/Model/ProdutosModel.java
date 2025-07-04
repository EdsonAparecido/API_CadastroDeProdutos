package com.CadastroDeProdutos.CadastroDeProdutos.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_Produtos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdutosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 100)
    private String nome;

    @Column(length = 300)
    private String descricao;

    @Column(nullable = false, precision = 7)
    private BigDecimal quantidade;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal valor;

    private BigDecimal total;
}
