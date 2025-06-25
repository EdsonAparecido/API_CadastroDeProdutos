package com.CadastroDeProdutos.CadastroDeProdutos.Service;

import com.CadastroDeProdutos.CadastroDeProdutos.Model.ProdutosModel;
import com.CadastroDeProdutos.CadastroDeProdutos.Repository.ProdutosRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ProdutosService {

    private ProdutosRepository produtosRepository;
    public ProdutosService(ProdutosRepository produtosRepository) {
        this.produtosRepository = produtosRepository;
    }

    //SALVAR
    public ProdutosModel save(ProdutosModel produtosModel){
        return produtosRepository.save(produtosModel);
    }
    //LISTAR
    public List<ProdutosModel> getAll(){
        return produtosRepository.findAll();
    }
    //DELETAR
    public void delet(Long id){
        produtosRepository.deleteById(id);
    }
}
