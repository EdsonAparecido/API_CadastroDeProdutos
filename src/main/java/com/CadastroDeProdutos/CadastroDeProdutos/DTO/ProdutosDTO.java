package com.CadastroDeProdutos.CadastroDeProdutos.DTO;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class ProdutosDTO {

    @NotNull(message = "Nome é obrigatório.")
    @Size(min=1, max=100, message = "Nome precisa conter de 1 a 100 caracteres.")
    private String nome;

    @Size(max = 300, message = "Tamanho máximo de 300 caracteres.")
    private String descricao;

    @NotNull(message = "Quantidade é obrigatório.")
    @PositiveOrZero(message = "Quantidade precisa ser positivo ou zero.")
    private BigDecimal quantidade;

    @NotNull(message = "Valor é obrigatório.")
    @PositiveOrZero(message = "Valor precisa ser positivo ou zero.")
    private BigDecimal valor;

    private BigDecimal total;
}
