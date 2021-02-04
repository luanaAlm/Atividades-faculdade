package com.adailsilva.drogaria.bean;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
// import javax.faces.model.ListDataModel;

import com.adailsilva.drogaria.dao.FabricanteDAO;
import com.adailsilva.drogaria.domain.FabricanteDTO;
import com.adailsilva.drogaria.util.JSFUtil;

// Configurando a classe como um Bean
// Configurando a sessão da tela - Scopos:
// 1- request scoped = a cada clique é gerado o managed bean, a cada clique é instanciado.  
// 2- view scoped = só existem enquanto manipulada a tela (recomendado para o JSF).
// 3- session scoped = criado e finalizado com o servidor de aplicação.
@ManagedBean(name = "MBFabricante") // pode ser qualquer nome para o Bean
@ViewScoped
public class FabricanteBean {

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

	// variável do tipo ListDataModel de Fabricantes.
	// private ListDataModel<FabricanteDTO> fabricantes;

	// para trabalhar com dataTable poderia usar ListDataModel e ArrayList
	// CORREÇÃO de Erro após filtragem (não mostrava dados)
	// Para trabalhar com dataTable terá que trabalhar com dois ArrayList(s)
	// um para dados completos e outro para dados filtrados
	private FabricanteDTO fabricante; // servir para gravar um novo, excluir e editar um fabricante.
	private ArrayList<FabricanteDTO> fabricantes; // variável do tipo ArrayList de Fabricantes.
	// variável do tipo ArrayList de Fabricantes Filtrados na Pesquisa.
	private ArrayList<FabricanteDTO> fabricantesFiltrados;

	// métodos acessores Getters e Setters
	public FabricanteDTO getFabricante() {
		return fabricante;
	}

	public void setFabricante(FabricanteDTO fabricante) {
		this.fabricante = fabricante;
	}

	public ArrayList<FabricanteDTO> getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(ArrayList<FabricanteDTO> fabricantes) {
		this.fabricantes = fabricantes;
	}

	public ArrayList<FabricanteDTO> getFabricantesFiltrados() {
		return fabricantesFiltrados;
	}

	public void setFabricantesFiltrados(ArrayList<FabricanteDTO> fabricantesFiltrados) {
		this.fabricantesFiltrados = fabricantesFiltrados;
	}

	// AÇÕES [ACTIONS]
	// LISTAR
	// uma ação em JSF é um método público e será chamado pela tela
	// o retorno pode ser void ou pode retornar um tipo qualquer
	// ações normalmente são chamadas com cliques
	@PostConstruct // essa ação será chamada antes da página ser renderizada
	public void prepararPesquisa() { // prepararPesquisa pois a ação é executada antes da exibição
		try {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricantes = fabricanteDAO.listar(); // preenchenado o ArrayList<>
			// ArrayList<FabricanteDTO> lista = fabricanteDAO.listar();
			// convertendo ArrayList em ListDataModel
			// o ListDataModel já tem um construtor padrão que recebe o tipo ArrayList
			// fabricantes = new ListDataModel<FabricanteDTO>(lista);
		} catch (SQLException e) {
			System.out.println("Erro ao listar os fabricantes na tela");
			e.printStackTrace();
			JSFUtil.adicionarMensagemErro("Erro ao listar os fabricantes - Erro no Banco de Dados: " + e.getMessage());
		}
	}

	// PREPARO DO OBJETO PARA SALVÁ-LO
	// pois não posso invocar um método de um objeto sem instanciá-lo
	// também zera o objeto
	public void prepararNovo() {
		fabricante = new FabricanteDTO();
	}

	// NOVO
	// será chamado por um botão e não por uma ação automática [@PostConstruct]
	public void novo() {
		try {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricanteDAO.salvar(fabricante);
			// após salvar atualizar sem precisar recarregar a página pois a listagem está
			// com o [@PostConstruct]
			// ArrayList<FabricanteDTO> novaLista = fabricanteDAO.listar();
			// fabricantes = new ListDataModel<FabricanteDTO>(novaLista);
			fabricantes = fabricanteDAO.listar();

			JSFUtil.adicionarMensagemSucesso("Fabricante salvo com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar um Fabricante");
			e.printStackTrace();
			JSFUtil.adicionarMensagemErro(
					"Erro ao adicionar um fabricante - Erro no Banco de Dados: " + e.getMessage());
		}

	}

	// PREPARO DO OBJETO PARA EXCLUÍ-LO
	// vai preencher o fabricante com dados da tabela
	// public void prepararExcluir() {
	// fabricante recebe a linha clicada
	// getRowData() só funciona para ListDataModel
	// fabricante = fabricantes.getRowData();

	// }

	// EXCLUIR
	public void excluir() {
		try {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricanteDAO.excluir(fabricante);

			// após excluir atualizar sem precisar recarregar a página pois a listagem está
			// com o [@PostConstruct]
			// ArrayList<FabricanteDTO> novaLista = fabricanteDAO.listar();
			// fabricantes = new ListDataModel<FabricanteDTO>(novaLista);
			fabricantes = fabricanteDAO.listar();

			JSFUtil.adicionarMensagemSucesso("Fabricante removido com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao remover um Fabricante!" + e.getMessage());
			e.printStackTrace();

			JSFUtil.adicionarMensagemErro("Erro ao remover um Fabricante!");
		}
	}

	// PREPARO DO OBJETO PARA EDITÁ-LO
	// vai preencher o fabricante com dados da tabela
	// public void prepararEditar() {
	// fabricante recebe a linha clicada
	// getRowData() só funciona para ListDataModel
	// fabricante = fabricantes.getRowData();
	// }

	// EDITAR
	public void editar() {
		try {
			FabricanteDAO fabricanteDAO = new FabricanteDAO();
			fabricanteDAO.editar(fabricante);

			// após editar atualizar sem precisar recarregar a página pois a listagem está
			// com o [@PostConstruct]
			// ArrayList<FabricanteDTO> novaLista = fabricanteDAO.listar();
			// fabricantes = new ListDataModel<FabricanteDTO>(novaLista);
			fabricantes = fabricanteDAO.listar();

			JSFUtil.adicionarMensagemSucesso("Fabricante editado com Sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao editar um Fabricante!");
			e.printStackTrace();

			JSFUtil.adicionarMensagemErro("Erro ao editar um Fabricante!" + e.getMessage());
		}
	}
}
