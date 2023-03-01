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
public class FornecedorProduto {

    
        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
	private long id;

	private Produto produto;

	private Forncedor fornecedor;

	private double precoFornecedor;

}
