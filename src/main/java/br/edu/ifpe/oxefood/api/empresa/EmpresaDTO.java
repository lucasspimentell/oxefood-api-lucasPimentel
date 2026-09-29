package br.edu.ifpe.oxefood.api.empresa;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data// outra forma do Getter e Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaDTO {

   @Column
   private String site;
    
   @Column
   private String cnpj;

   @Column
   private String inscricaoEstadual;

   @Column
   private String nomeEmpresarial;

   @Column
   private String nomeFantasia;

   @Column
   private String fone;

   @Column
   private String foneAlternativo;
    
}
