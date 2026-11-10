package br.edu.ifpe.oxefood.api.produto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // outra forma do Getter e Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private Long id;

     private Long idCategoria;

    @NotBlank(message = "O codigo é de preenchimento obrigatório")
    private String codigo;

    @NotNull(message = "O titulo é de preenchimento obrigatório")
    @NotEmpty(message = "O titulo é de preenchimento obrigatório")
    @Length(max = 100, message = "O titulo deverá ter no máximo {max} caracteres")
    private String titulo;

    @Length(min = 8, max = 100, message = "O campo descrição tem que ter entre {min} e {max} caracteres")
    private String descricao;

    private Double valorUnitario;

    private Integer tempoEntregaMinimo;

    private Integer tempoEntregaMaximo;

}
