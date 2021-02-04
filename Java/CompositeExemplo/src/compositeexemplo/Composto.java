package compositeexemplo;

//sub-clase de elemento
import java.util.ArrayList;

//é composta por elementos em Array
public class Composto extends Elemento {
    
      //arayList galho dentro da classe
    // criação de metodos
    protected ArrayList <Elemento> ListaElementos;
  
    public Composto(String texto){
        this.Texto = texto;
        this.ListaElementos = new ArrayList<Elemento>();
    }
    
    public void add (Elemento e){
        this.ListaElementos.add(e);
    }
    
    //remover
    public void remover( Elemento e){
        this.ListaElementos.remove(e);
    }
    // getTexto é recursivo (chama novamente os metodos)
    public void getTexto(){
        System.out.println(this.Texto);
        for (Elemento e: ListaElementos){
            e.getTexto();
        }
    }
}
