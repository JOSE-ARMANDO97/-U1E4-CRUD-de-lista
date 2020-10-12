package Logica;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudMenu {
    Scanner lectura =new Scanner(System.in);
    List  Lista =new ArrayList ();
   protected String nombre;
   protected int Edad;
   private String sexo;
   protected int indentificacion;
   protected String respuesta,palabra,Op;
   private int posicion;
 
   
   public  List getIngresarDtosNuevos (){
       try {
           
      
     do{
  Lista.add(indentificacion= Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE IDENTIFICACION")));
  Lista.add(nombre= JOptionPane.showInputDialog(null,"INGRESE NOMBRE"));
  Lista.add(Edad= Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EDAD")));
  Lista.add(sexo= JOptionPane.showInputDialog(null,"INGRESE SEXO"));
       System.out.println();
     
         respuesta=JOptionPane.showInputDialog("DESEAS INGRESAR MAS DATOS SI/NO");
       respuesta=respuesta.toUpperCase();
       }while(!respuesta.equals("NO"));
   
    } catch (HeadlessException | NumberFormatException e) {
           System.out.println(e.getMessage()+" Error ingreso un tipo de tados equivocado");
         
       }
       return null;
      }
       

public    List  getLeerLista (){
 
    System.out.println("");
    return Lista;   
 }

public List Actualizar(){
    System.out.println();
  if(Lista.isEmpty()){
            System.out.println("ESTA VACIA  PRIMERO INGRESE DATOS ");
           
  }else{
      System.out.println("**********************ACTUALIZAR***************");
for( int i=0;i<Lista.size();i++){
     System.out.print(Lista.get(i));
     System.out.println("");
    }
  
 do{
    System.out.println("**************QUE POSICION DE SEAS ACTUALIZAR ***********");
       posicion=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE  POSICION"));
      palabra=JOptionPane.showInputDialog(null,"INGRESE PALABRA O NUMERO");
    Lista.set(posicion, palabra);
 
    
            respuesta= JOptionPane.showInputDialog("DESEAS ACTUALIZAR OTRA POSICION? SI /NO");
      respuesta=respuesta.toUpperCase();
      
 }while(!respuesta.equals("NO"));
  } return Lista;
 }



public List Borrar(){
 
System.out.println();
  if(Lista.isEmpty()){
            System.out.println(" NO SE PUEDE BORRAR NINGUN DATO YA QUE LA LISTA ESTA VACIA");
           
  }else{
      System.out.println("**********************BORRAR***************");
for( int i=0;i<Lista.size();i++){
     System.out.print(Lista.get(i));
     System.out.println("");
    }
  
 do{
    
    System.out.println("************** BIENVENIDO AL BORRADOR DE ELEMENTOS ***********");
     System.out.println("QUIERES BORRAR TODA LA LISTA ESCRIBA !SI! \n  QUIERES BORRAR ALGUNA POSICION ESCRIBA !NO! ");
       
    Op=lectura.next();
    Op=Op.toUpperCase();
    
    if(Op.equals("SI")){
         System.out.println("***************BORRANDO LISTA COMPLETA*****************");
        for( int i=0;i<Lista.size();i++){
     System.out.print(Lista.get(i));
     System.out.println("");
    }
        
    Lista.clear();
    for( int i=0;i<Lista.size();i++){
     System.out.print(Lista.get(i));
     System.out.println("");
    }
    
    }else if(Op.equals("NO")){
        System.out.println("*****************BORRANDO POSICIONES*****************");
        for( int i=0;i<Lista.size();i++){
     System.out.print(Lista.get(i));
     System.out.println("");
    }
        
        System.out.println("INGRESE LA  POSICION QUE DESEA BORRAR");
        posicion=lectura.nextInt();
    Lista.remove(posicion);
    }
            respuesta= JOptionPane.showInputDialog("DESEAS SEGUIR BORRANDO? SI /NO");
      respuesta=respuesta.toUpperCase();
      
 }while(!respuesta.equals("NO"));
    } return Lista;
  }
}
