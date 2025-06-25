package com.CadastroDeProdutos.CadastroDeProdutos.Controller;

import com.CadastroDeProdutos.CadastroDeProdutos.Model.ProdutosModel;
import com.CadastroDeProdutos.CadastroDeProdutos.Service.ProdutosService;
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
    public ProdutosModel newProduct(@RequestBody ProdutosModel produtosModel){
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
