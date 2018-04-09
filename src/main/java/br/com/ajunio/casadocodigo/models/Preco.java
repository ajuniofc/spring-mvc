package br.com.ajunio.casadocodigo.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Preco {
	private BigDecimal valor;
	private TipoPreco tipo;
	
	public Preco() {
		
	}
	
	public Preco(BigDecimal valor, TipoPreco tipo) {
		super();
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoPreco getTipo() {
		return tipo;
	}
	public void setTipo(TipoPreco tipo) {
		this.tipo = tipo;
	}

}
