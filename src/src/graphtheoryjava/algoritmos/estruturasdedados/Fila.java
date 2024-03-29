package src.graphtheoryjava.algoritmos.estruturasdedados;

import java.util.LinkedList;
import java.util.List;

public class Fila {
    private List<Object> objs = new LinkedList<>();
    
    public void Enfilera(Object object){
        this.objs.add(object);
    }
    
    public Object Desenfilera(){
        return this.objs.remove(0);
    }
    
    public boolean isEmpty(){
        return this.objs.isEmpty();
    }
}
