package br.com.cafi.barzinhodesktop.modelo.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Forncedor {

    @Id
    @GeneratedValue
       
    private int id;
    private String nome;
    private String cnpj;

}
