
public class Nodo {
    public Alumnoss alumno;
    public Nodo siguiente;
   
    public Nodo(Alumnoss alumno){
        this.alumno = alumno;
    }
   
    public Nodo(Alumnoss alumno, Nodo siguiente){
        this.alumno = alumno;
        this.siguiente = siguiente;
    }
    
    
}
