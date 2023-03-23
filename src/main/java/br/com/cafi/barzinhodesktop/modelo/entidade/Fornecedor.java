package br.com.cafi.barzinhodesktop.modelo.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)  
    private long id;
    private String nome;
    private String cnpj;
    private String contato;

}
