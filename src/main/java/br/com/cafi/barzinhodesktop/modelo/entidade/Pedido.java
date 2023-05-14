package br.com.cafi.barzinhodesktop.modelo.entidade;

import java.io.Serializable;
import java.util.Date;
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
public class Pedido implements Serializable {
    
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
        private String tipo;//balcão, delivery e mesa
        private String observacao;
        private Date dataDoPedido;
        private String status;
        @ManyToOne
        private Comanda comanda;
        private Cliente cliente;

}
