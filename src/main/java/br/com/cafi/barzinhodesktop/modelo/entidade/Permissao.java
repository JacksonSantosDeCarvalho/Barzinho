package br.com.cafi.barzinhodesktop.modelo.entidade;

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
public class Permissao {
    
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String descricao;

}
