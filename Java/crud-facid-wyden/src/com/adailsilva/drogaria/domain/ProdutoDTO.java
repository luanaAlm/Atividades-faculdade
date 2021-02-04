package com.adailsilva.drogaria.domain;

import java.util.Arrays;
import java.util.Date;

public class ProdutoDTO {

	// atributos
	private Long idproduto;
	private String descricao;
	private Long quantidade;
	private Integer codigodebarras;
	private Double custo;
	private Double preco;
	private Date fabricacao;
	private Date vencimento;
	private Date ultimoregistro;
	private byte[] imagem;
	private Boolean ativo;
	private String similar;
	private String observacao;

	// chave estrangeira por COMPOSIÇÃO (1 Produto pertence a 1 Fabricante)
	private FabricanteDTO fabricante;

	// métodos acessores Getters e Setters
	public Long getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Long idproduto) {
		this.idproduto = idproduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getCodigodebarras() {
		return codigodebarras;
	}

	public void setCodigodebarras(Integer codigodebarras) {
		this.codigodebarras = codigodebarras;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getUltimoregistro() {
		return ultimoregistro;
	}

	public void setUltimoregistro(Date ultimoregistro) {
		this.ultimoregistro = ultimoregistro;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getSimilar() {
		return similar;
	}

	public void setSimilar(String similar) {
		this.similar = similar;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public FabricanteDTO getFabricante() {
		return fabricante;
	}

	public void setFabricante(FabricanteDTO fabricante) {
		this.fabricante = fabricante;
	}

	// método toString para formatar a saída dos objetos do tipo da classe
	@Override
	public String toString() {
		return "ProdutoDTO [idproduto=" + idproduto + ", descricao=" + descricao + ", quantidade=" + quantidade
				+ ", codigodebarras=" + codigodebarras + ", custo=" + custo + ", preco=" + preco + ", fabricacao="
				+ fabricacao + ", vencimento=" + vencimento + ", ultimoregistro=" + ultimoregistro + ", imagem="
				+ Arrays.toString(imagem) + ", ativo=" + ativo + ", similar=" + similar + ", observacao=" + observacao
				+ ", fabricante=" + fabricante + "]";
	}

}
