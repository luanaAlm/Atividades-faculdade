package Pessoa;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class PessoaBean {
	private PessoaDTO pessoa = new PessoaDTO(); //objeto
	private List<PessoaDTO>pessoas = new ArrayList<>();
        private final PessoaDAO pessoaDAO =  new PessoaDAO();

        
    public void adicionar(){
        pessoas.add(pessoa);
        new PessoaDAO().salva(pessoa);
         pessoa= new PessoaDTO();
    }
public void lista(){
        pessoas = pessoaDAO.buscar();
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaDTO pessoa) {
        this.pessoa = pessoa;
    }

    public List<PessoaDTO> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<PessoaDTO> pessoas) {
        this.pessoas = pessoas;
    }

  
}
