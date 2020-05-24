/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import  java.util.ArrayList ;
import java.util.Scanner;
/**
 *
 * @author Ana Karen
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    ArrayList < String >  Principal ;
    public static void main(String[] args) {
        // TODO code application logic here
          Principal Emp = new Principal ();
       Emp.Principal =new ArrayList();
       Emp.Opc1();
    }    
    
    public void Opc1(){
        Scanner elije= new Scanner (System.in);
        int opc1 = 0;
        do{
            System.out.println("1.- Agregar empleado");
            System.out.println("2.- Modificar empleado");
            System.out.println("3.- Mostrar usuario");
            System.out.println("4.- Salir");
            System.out.println("Elije que opcion hacer: ");
            opc1 = elije.nextInt();
            switch(opc1){
                case 1:
                    agregarempleado();
                    break;
                case 2:
                    modificarempleado();
                    break;
                case 3:
                    mostrarempleado();
                break;
                case 4:
                    System.out.println("precione cualquier tecla para salir");
                    break;
                default: 
                    System.out.println("Error esa opcion no existe");
                    
            }
        }while(opc1 != 4);        
    }
    public void  agregarempleado(){
        Scanner lista = new Scanner(System.in);
        String name;
        String fistname;
        
        System.out.println("Empleado");
        System.out.print("Ingresa el nombre del  empleado: " );
    name = lista.nextLine();
        System.out.print("Ingresa el apellido del empleado: ");
     fistname = lista.nextLine();
        System.out.print("Ingrea la edad que tiene el empleado: ");
String old = lista.nextLine ();    
    Principal.add(name);
    Principal.add(fistname);
    Principal.add(old);
        System.out.println("Se agrego el empleado: " +name+ "  " +fistname+ " " +old+ " \n ");
    }
public void modificarempleado(){
    Scanner lista = new Scanner(System.in);
    String name, fistname, old;
    String newname, newfistname, newold;
    int incio; 
    System.out.println(Principal);
    System.out.println("Ingrese el nombre del empleado: ");
    name = lista.nextLine();
    System.out.println("Ingrese el apellido del empleado: ");
    fistname =lista.nextLine();
    System.out.println("Ingrese la edad del empleado: ");
    old = lista.nextLine();
    incio = Principal.indexOf(name);
    incio = Principal.indexOf(fistname); 
    incio = Principal.indexOf(old);
    if(incio != -1 )
{System.out.println("Nuevo nombre: ");
    newname = lista.nextLine();
    System.out.println("Nuevo apellido: ");
    newfistname =lista.nextLine();
    System.out.println("Nueva edad: ");
    newold =lista.nextLine();
            
Principal.set(incio, newname);
Principal.set(incio, newfistname);
Principal.set(incio, newold);
    System.out.println("Se modifico el(la)empleado/a:  " +newname+" " +newfistname+ " " +newold+"   \n" );
}else{
        System.out.println("El dato que dijito no se encuentra");
    }
            }

public void mostrarempleados(){
    if(!Principal.isEmpty()){
        System.out.println("Muestra los elementos ");
        for(int i=0; i < Principal.size(); i++){
            
            System.out.print( Principal.get(i) );
            System.out.println( );
            System.out.println( );
        }
    }
    else{
        System.out.println("no  existe");
    }
}
}

