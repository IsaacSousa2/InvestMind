package br.claude;
import java.time.LocalDate;

public class Ativo {

	private String codigoAtivo;
	private String nomeAtivo;
	private double valorCompra;
	private double valorAtual;
	private LocalDate dataDeAquisição;
	private NivelDeRisco riscoAtivo;
	
	public Ativo() {
		
	}
	public Ativo(String codigoAtivo, String nomeAtivo, double valorCompra, double valorAtual, LocalDate dataDeAquisicao, NivelDeRisco riscoAtivo) {
		
		this.codigoAtivo = codigoAtivo;
		this.nomeAtivo = nomeAtivo;
		this.valorCompra = valorCompra;
		this.valorAtual = valorAtual;
		this.dataDeAquisição = dataDeAquisicao;
		this.riscoAtivo = riscoAtivo;
		
	}
	
	//Getters
	public String getCodigoAtivo() {
		return this.codigoAtivo;
	}
	public String getNomeAtivo() {
		return this.nomeAtivo;
	}
	public double getValorCompra() {
		return this.valorCompra;
	}
	public double getValorAtual() {
		return this.valorAtual;
	}
	public LocalDate getDataDeAquisicao() {
		return this.dataDeAquisição;
	}
	public NivelDeRisco getRiscoAtivo() {
		return this.riscoAtivo;
	}
	
	//Setters
	
	public void setCodigoAtivo(String codigoAtivo) {
		this.codigoAtivo = codigoAtivo;
	}
	public void setNomeAtivo(String nomeAtivo) {
		this.nomeAtivo = nomeAtivo;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public void setValorAtual(double valorAtual) {
		this.valorAtual = valorAtual;
	}
	public void setDataDeAquisicao(LocalDate dataDeAquisicao) {
		this.dataDeAquisição = dataDeAquisicao;
	}
	public void setRiscoAtivo(NivelDeRisco riscoAtivo) {
		this.riscoAtivo = riscoAtivo;
	}
	
}
