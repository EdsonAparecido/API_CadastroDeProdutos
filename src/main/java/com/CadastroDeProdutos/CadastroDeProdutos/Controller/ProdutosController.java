package com.CadastroDeProdutos.CadastroDeProdutos.Controller;

import com.CadastroDeProdutos.CadastroDeProdutos.DTO.ProdutosDTO;
import com.CadastroDeProdutos.CadastroDeProdutos.Mapper.ProdutosMapper;
import com.CadastroDeProdutos.CadastroDeProdutos.Model.ProdutosModel;
import com.CadastroDeProdutos.CadastroDeProdutos.Service.ProdutosService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Home")
public class ProdutosController {

    private ProdutosService produtosService;
    public ProdutosController(ProdutosService produtosService) {
        this.produtosService = produtosService;
    }

    //CRIAR PRODUTO
    @PostMapping
    public ProdutosModel newProduct(@Valid @RequestBody ProdutosDTO produtosDTO){
        produtosDTO.setTotal(produtosDTO.getValor().multiply(produtosDTO.getQuantidade()));
        ProdutosModel produtosModel = ProdutosMapper.toModel(produtosDTO);
        return produtosService.save(produtosModel);
    }
    //LISTAR PRODUTO
    @GetMapping
    @RequestMapping("/Produtos")
    public List<ProdutosModel> listProduct(){
        return produtosService.getAll();
    }
    //DELETAR PRODUTO
    @DeleteMapping("/{id}")
    public void delet(@PathVariable Long id){
        produtosService.delet(id);
    }
}
