package compositeexemplo;

public class Principal2 {

    public static void main (String args[]){
    //instanciar folha
        
        //referencioado por elementos e nao pelas classes
    Elemento E1 = new Folha ("Folha 1");
    Elemento E2 = new Composto ("Composto 1");
    Elemento E3 = new Folha ("Folha 2");
    Elemento E4 = new Composto ("Composto 2");
    Elemento E5 = new Composto ("Folha 3");
    Elemento E6 = new Composto ("Folha 4");
   
    ((Composto)E2).add(E1);
    ((Composto)E2).add(E3);
    
     
    ((Composto)E4).add(E5);
    ((Composto)E4).add(E6);
      
    ((Composto)E2).add(E4);
    E2.getTexto();
         ((Composto)E4).remover(E5);
      System.out.println("-------------------------");
   E2.getTexto();
 
}
}