


import java.util.Scanner;


public class Persona {
    Scanner in = new Scanner(System.in);
    Lista lista = new Lista();
    
 
    public static void main(String[] args) {
        
        Persona list = new Persona();
        list.menu();
    }
        public void menu(){
        boolean  exit = false;
        int opcion;        
        
        while(!exit) {
            System.out.println("------------Bienvenido a Univerdidad San Pablo Guatemala-------------");
            System.out.println("Que desea realizar: \n"
                    + "1.Add stundent\n"
                    + "2.Print stundent\n"
                    + "3.Add last student\n"
                    + "4.Delete First student\n"
                    + "5.Delete Last student\n"
                    + "6.Find student San pablo´university\n"
                    + "7.Delete Specific Student\n"
                    + "8.Exit\n"); 
            
            
            System.out.println("Please select an option");

            opcion = in.nextInt();
            switch(opcion) {

                case 1:   
                    ingresardato();
                    break;   

                case 2: 
                    System.out.println("El carnet es: \n");
                    lista.mostrarLista();
                    
                    break;  
                    
                case 3: 
                    addLast();
                    break;  
                    
                case 4: 
                    lista.eliminarAlInicio();                  
                    System.out.println("El estudiante con carné No." + lista.eliminarAlInicio()+ " ha sido eliminado");
                    break;  
                case 5:                    
                    System.out.println("El estudiante con carné No." + lista.eliminarAlFinal()+ "ha sido eliminado");
                    break;  
                   
                case 6:
                    find();
                    System.out.println("El Alumno ha sido encontrado ");
                    break;
                    
                case 7:                  
                    Eliminar();
                    break;
                            
                case 8:
                    System.out.println("It was a plasure to be with you");
                    exit= true;
                    break;
                default: 
                    System.out.println("----------------Please select the correct option----------------");
                break;        
            } 
          }
    }
        
    public void ingresardato(){
        Alumnoss alumnintos= new Alumnoss();
              
        System.out.println("Ingrese su nombre");
        alumnintos.setNombre(in.next());
        System.out.println("Ingrese su apellido");
        alumnintos.setNombre(in.next());
        System.out.println("ingrese su carnet");
        alumnintos.setCarné(in.nextInt());
        System.out.println("ingrese su email");
        alumnintos.setNombre(in.next());
        lista.agregarAlInicio(alumnintos);
        System.out.println("Se ha gurdado exitosamente su informacion"); 
    }
  
    public void  addLast(){
        Alumnoss alumnintos= new Alumnoss();
              
        System.out.println("Ingrese su nombre :");
        alumnintos.setNombre(in.next());
        System.out.println("Ingrese su apellido :");
        alumnintos.setNombre(in.next());
        System.out.println("ingrese su carnet :");
        alumnintos.setCarné(in.nextInt());
        System.out.println("ingrese su email :");
        alumnintos.setNombre(in.next());
        lista.agregarAlInicio(alumnintos);
        System.out.println("Se ha gurdado exitosamente su informacion");
      
    }
    public void find(){
        System.out.println("Ingrese carné a buscar :");
        lista.buscarElemento(in.nextInt());
    }
    
    public void Eliminar(){
        System.out.println("Ingrese carné a eliminar");
        lista.buscarElemento(in.nextInt());
        System.out.println("El Alumno ha sido eliminado exitosamente");
    
    }
    
    
 }   

  

