
package trabalho.web.facid.beans;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import trabalho.web.DAO.ConexaoDao;
import trabalho.web.atributus.Filiados;

@SessionScoped
@ManagedBean
public class FiliadosBeans {
    private Filiados sindicalista= new Filiados();
    private List<Filiados> listaFiliados = new ArrayList<>();
    private ConexaoDao conexaoDao = new ConexaoDao();
    
    public void adicionar(){
        listaFiliados.add(sindicalista);
        conexaoDao.salva(sindicalista);
        sindicalista= new Filiados();
    }
    public void lista(){
        listaFiliados = conexaoDao.buscar();
    }

    public Filiados getSindicalista() {
        return sindicalista;
    }

    public void setSindicalista(Filiados sindicalista) {
        this.sindicalista = sindicalista;
    }

    public List<Filiados> getListaFiliados() {
        return listaFiliados;
    }

    public void setListaFiliados(List<Filiados> listaFiliados) {
        this.listaFiliados = listaFiliados;
    }
    
}
