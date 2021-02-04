import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class MaquinaBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private MaquinaRepository maquinaRepository;
	
	private List<Maquina> listaMaquina;
	
	private Maquina tenis;
	private Maquina maquinaEdicao;
	
	@Transactional
	public void salvar() {
			this.maquinaRepository.salvar(tenis);
			this.limpar();
	}
	
	//@PostConstruct
		public void consultar() {
			listaMaquina = maquinaRepository.todas();
		}
		
		@PostConstruct
		public void init() {
			this.limpar();
}
		public void limpar() {
			this.maquina = new Maquina();
			listaMaquina = maquinaRepository.todas();
		}
		
		public void excluir(Maquina maquina) {
			maquinaRepository.remover(maquina);
			tenis=null;
			limpar();
		}
		
		public Maquina getTenis() {
			return maquina;
		}
		
		public void setMaquina(Maquina maquina) {
			this.maquina = maquina;
		}
		
		public List<Maquina> getListaMaquina() {
			return listaMaquina;
		}

		public Maquina getMaquinaEdicao() {
			return maquinaEdicao;
		}
		
		public void setMaqunaEdicao(Maquina maquinaEdicao) {
			this.maquinaEdicao = maquinaEdicao;
		}
}