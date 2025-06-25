package com.CadastroDeProdutos.CadastroDeProdutos.Repository;

import com.CadastroDeProdutos.CadastroDeProdutos.Model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {
}
