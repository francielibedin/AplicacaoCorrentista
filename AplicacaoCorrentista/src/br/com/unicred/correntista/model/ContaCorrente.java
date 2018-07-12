package br.com.unicred.correntista.model;

import java.util.Date;

public class ContaCorrente {

	private String numero;
	private Date dataAbertura;
	private double saldo;
	private Cliente cliente;

	public ContaCorrente() {

	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDataAbertura() {
		return this.dataAbertura;
	}

	public void setdataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
