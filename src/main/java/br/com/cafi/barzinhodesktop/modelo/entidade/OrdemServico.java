package br.com.cafi.barzinhodesktop.modelo.entidade;

import javax.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@EqualsAndHashCode
public class OrdemServico {

	private long id;

	private Date data;

	private Usuario operador;

}
