package com.adailsilva.drogaria.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
// import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.adailsilva.drogaria.dao.ProdutoDAO;
import com.adailsilva.drogaria.domain.FabricanteDTO;
import com.adailsilva.drogaria.domain.ProdutoDTO;
import com.adailsilva.drogaria.util.JSFUtil;

// Configurando a classe como um Bean
// Configurando a sessão da tela - Scopos:
// 1- request scoped = a cada clique é gerado o managed bean, a cada clique é instanciado.  
// 2- view scoped = só existem enquanto manipulada a tela (recomendado para o JSF).
// 3- session scoped = criado e finalizado com o servidor de aplicação.
@ManagedBean(name = "MBProduto") // pode ser qualquer nome para o Bean
@ViewScoped
public class ProdutoBean {

	// LISTAR
	// necessário uma variável para listar os dados na tela
	// usando datamodel para guardar variáveis de consulta
	// nos domínios temos variáveis de banco de dados
	// nos beans temos variáveis de tela
	// variável de tela ListDataModel
	// no diamente temos uma trava (tipo do domínio)
	// dataTable usará o DataModel
	// atributos

	// SALVAR
	// para salvar dados é necessário uma variável para salvar os dados

	// variável do tipo ListDataModel de Produtos.
	// private ListDataModel<ProdutoDTO> produtos;

	// para trabalhar com dataTable poderia usar ListDataModel e ArrayList
	// CORREÇÃO de Erro após filtragem (não mostrava dados)
	// Para trabalhar com dataTable terá que trabalhar com dois ArrayList(s)
	// um para dados completos e outro para dados filtrados
	private ProdutoDTO produto; // servir para gravar um novo, excluir e editar um produto.
	private ArrayList<ProdutoDTO> produtos; // variável do tipo ArrayList de Produtos.
	// variável do tipo ArrayList de Fabricantes Filtrados na Pesquisa.
	private ArrayList<ProdutoDTO> produtosFiltrados;

	// atributo para Composição
	// atributo para o ComboBox [selectOneMenu] no jsf
	private ArrayList<FabricanteDTO> comboFabricantes;

	// métodos acessores Getters e Setters
	public ProdutoDTO getProduto() {
		return produto;
	}

	public void setProduto(ProdutoDTO produto) {
		this.produto = produto;
	}

	public ArrayList<ProdutoDTO> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ProdutoDTO> produtos) {
		this.produtos = produtos;
	}

	public ArrayList<ProdutoDTO> getProdutosFiltrados() {
		return produtosFiltrados;
	}

	public void setProdutosFiltrados(ArrayList<ProdutoDTO> produtosFiltrados) {
		this.produtosFiltrados = produtosFiltrados;
	}

	public ArrayList<FabricanteDTO> getComboFabricantes() {
		return comboFabricantes;
	}

	public void setComboFabricantes(ArrayList<FabricanteDTO> comboFabricantes) {
		this.comboFabricantes = comboFabricantes;
	}

	// AÇÕES [ACTIONS]
	// LISTAR
	// uma ação em JSF é um método público e será chamado pela tela
	// o retorno pode ser void ou pode retornar um tipo qualquer
	// ações normalmente são chamadas com cliques
	// não usarei aqui o @PostConstruct (usando de outro modo)
	// @PostConstruct essa ação com será chamada antes da página ser renderizada
	// Se não usar o [@PosConstruct] pode usar o [f:event] com o [preRenderView]
	@PostConstruct
	public void carregarListagem() {
		try {
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produtos = produtoDAO.listar(); // preenchenado o ArrayList<>
		} catch (SQLException e) {
			System.out.println("Erro ao listar os produto na tela");
			e.printStackTrace();
			JSFUtil.adicionarMensagemErro("Erro ao listar os produtos - Erro no Banco de Dados: " + e.getMessage());
		}

	}

	// PREPARO DO OBJETO PARA SALVÁ-LO
	// pois não posso invocar um método de um objeto sem instanciá-lo
	// também zera o objeto
	public void prepararNovo() {
		produto = new ProdutoDTO();
	}

	// NOVO
	// será chamado por um botão e não por uma ação automática [@PostConstruct]
	public void novo() {
		try {
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produtoDAO.salvar(produto);
			// após salvar atualizar sem precisar recarregar a página pois a listagem está
			// com o [@PostConstruct]
			// ArrayList<ProdutoDTO> novaLista = produtoDAO.listar();
			// produtos = new ListDataModel<ProdutoDTO>(novaLista);
			produtos = produtoDAO.listar();

			JSFUtil.adicionarMensagemSucesso("Produto salvo com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar um Produto");
			e.printStackTrace();
			JSFUtil.adicionarMensagemErro("Erro ao adicionar um produto - Erro no Banco de Dados: " + e.getMessage());
		}

	}

}
