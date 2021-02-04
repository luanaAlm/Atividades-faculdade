package Pessoa;

//classe que contem todos os teributos com seus gueters e setters

//import java.sql.Date;

public class PessoaDTO {
        private Integer id;
	private String nome;
        private String endereco;
	private int numCasa;
	private String telefone;
	private double contVol; 
	private String observacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
	
        
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
   
        
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumCasa() {
		return numCasa;
	}
	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getContVol() {
		return contVol;
	}
	public void setContVol(double contVol) {
		this.contVol = contVol;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

    
   
}
