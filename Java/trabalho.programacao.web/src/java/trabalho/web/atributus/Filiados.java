
package trabalho.web.atributus;

import java.util.Date;
import java.util.Objects;


public class Filiados {
    private Integer id;
    private String nome;
    private String Sobrenome;
    private Integer idade;
    private String observacao;
    private String data;
    private Double contribuicao;

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

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Double getContribuicao() {
        return contribuicao;
    }

    public void setContribuicao(Double contribuicao) {
        this.contribuicao = contribuicao;
    }

   
    public Integer getIdade() {
        return idade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filiados other = (Filiados) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    
    
}
