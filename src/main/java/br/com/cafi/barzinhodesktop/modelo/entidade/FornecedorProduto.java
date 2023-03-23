package br.com.cafi.barzinhodesktop.modelo.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@EqualsAndHashCode
public class FornecedorProduto implements Serializable {

    
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
        @ManyToOne
	private Produto produto;
        @ManyToOne
	private Fornecedor fornecedor;

}
