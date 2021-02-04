import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class MaquinaRepository implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public Maquina salvar(Maquina maquina) {
		return manager.merge(maquina);
	}
	
	public Maquina porId(Long id) {
		return manager.find(Maquina.class, id);
	}
	
	public List<Maquina> todas() {
		return manager.createQuery("from Tenis order by maquinas ASC", Maquina.class).getResultList();
	}
	
	public void remover(Maquina maquina) {
		maquina = porId(maquina.getId());
		manager.remove(maquina);
		manager.flush();
	}

	
}
