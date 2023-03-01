package br.com.cafi.barzinhodesktop.modelo.entidade;

import javax.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Servico {

	private long id;

	private String preco;

	private String descricao;

	private int tempo;

}
