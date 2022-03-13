


public class Lista {  
    protected Nodo inicio, fin;
   
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
    
    public void agregarAlInicio(Alumnoss alumno){
        inicio = new Nodo(alumno,this.inicio);
        if(this.fin == null){
            this.fin = inicio;
        }
    }
   
    
    public void mostrarLista(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print("[" + aux.alumno.getCarné() + "]->");
            aux=aux.siguiente;
        }
    }
    
    public boolean estaVacia(){
        return this.inicio == null;
    } 
    public void agregarAlFinal(Alumnoss alumno){
        if(!estaVacia()){
            this.fin.siguiente = new Nodo(alumno);
            this.fin = this.fin.siguiente;
        }else{
            this.inicio=this.fin = new Nodo(alumno);
        }
    }
    
    public Alumnoss eliminarAlInicio(){
        Alumnoss alumno = inicio.alumno;
        if(inicio == fin){
            inicio=null;
            fin=null;
        }else{
            inicio = inicio.siguiente;
        }
        return alumno;
    }
    public Alumnoss eliminarAlFinal(){
        Alumnoss alumno = this.fin.alumno;
        if(this.inicio == this.fin){
            this.inicio=this.fin=null;
        }else{
            Nodo aux=this.inicio;
            while(aux.siguiente!=this.fin){
                aux=aux.siguiente;
            }
            this.fin=aux;
            this.fin.siguiente = null;
        }
        return alumno;
    } 
    public void buscarElemento(int carné){
        Nodo aux = this.inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.alumno.getCarné() == carné){
                System.out.println("[" + aux.alumno.getCarné() + "]");
                encontrado = true;
                break;
            }
            aux = aux.siguiente;
        }
        if(encontrado == false){
            System.out.println("Alumno no ha sido encontrado");
        }
    }
    public boolean existeElemento(int carné){
        Nodo aux = this.inicio;
        while(aux != null && aux.alumno.getCarné() != carné){
            aux = aux.siguiente;
        }
        return aux!=null;
    }
    
     public void eliminar (int carné){
	if (!estaVacia()){

		if(inicio==fin && carné ==inicio.alumno.getCarné()){
		      inicio=fin=null;
                }else if (carné==inicio.alumno.getCarné()){
                      inicio=inicio.siguiente;                  
                }else{
                    Nodo anterior,temporal;
                    anterior = inicio;
                    temporal=inicio.siguiente;
                    while(temporal!=null && temporal.alumno.getCarné()!=carné){
                    anterior=anterior.siguiente;
                    temporal=temporal.siguiente;
                    
                    }if (temporal!=null){
                          anterior.siguiente = temporal.siguiente;
                          if (temporal==fin){
                               fin=anterior;
            }
         }
      }
   }
}
  
     
}