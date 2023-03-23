/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class FluxoFinanceiro implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String tipo; // entrada ou saida
    private String situacao; // vencido, em aberto, pago
    private String recorrente; // unica, mensal ou parcelado
    private int parcelas;
    @ManyToOne
    private FluxoFinanceiro fluxoInicial;
    
}
