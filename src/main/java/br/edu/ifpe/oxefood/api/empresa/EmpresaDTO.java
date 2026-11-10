package br.edu.ifpe.oxefood.api.empresa;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// outra forma do Getter e Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaDTO {
   
   
   private Long id;

   
   private String site;
    
   @NotBlank(message = "O CNPJ é de preenchimento obrigatório")
   private String cnpj;

   
   private String inscricaoEstadual;

   @NotNull (message = "O Nome é de preenchimento obrigatório")
   @NotEmpty(message = "O Nome é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome deverá ter no máximo {max} caracteres")
   private String nomeEmpresarial;

   
   private String nomeFantasia;

   
   private String fone;

   
   private String foneAlternativo;
    
}
