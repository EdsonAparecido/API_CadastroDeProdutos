package com.CadastroDeProdutos.CadastroDeProdutos.Mapper;

import com.CadastroDeProdutos.CadastroDeProdutos.DTO.ProdutosDTO;
import com.CadastroDeProdutos.CadastroDeProdutos.Model.ProdutosModel;

public class ProdutosMapper {

    public static ProdutosModel toModel(ProdutosDTO produtosDTO){
        ProdutosModel produtosModel = new ProdutosModel();
        produtosModel.setNome(produtosDTO.getNome());
        produtosModel.setDescricao(produtosDTO.getDescricao());
        produtosModel.setQuantidade(produtosDTO.getQuantidade());
        produtosModel.setValor(produtosDTO.getValor());
        produtosModel.setTotal(produtosDTO.getTotal());

        return produtosModel;
    }
}
