package Principal;

import Logica.CrudMenu;
import javax.swing.JOptionPane;
public class  Main extends CrudMenu  {
    private  static String respuesta;
    private  static int  op;
    public static void main(String args[]){
        CrudMenu g=new CrudMenu();
        
      
        
        
       
          do{
      try{
         
        op = Integer.parseInt(JOptionPane.showInputDialog("==============BIENVENIDO A CRUD MENU=================="+"\n"
                  
                  + "INGRESE EL TIPO DE OPCION DE (1 al 5) "+"\n"
                  + "1.INSERTAR DATOS"+"\n"
                  + "2.LEER LISTA"+"\n"
                  + "3. ACTUALIZAR"+"\n"
                  + "4. BORRAR"+"\n"
                  + "5. SALIR"));
    
            
 
    
  } catch(NumberFormatException a){
          System.out.println("VALOR FUERA DE RANGO"+a.getMessage());
       
       }
         
            if (op==1) {
                System.out.println("LOS DATOS:="+g.getIngresarDtosNuevos());
        }else if(op==2){
            System.out.println("LECTURA:="+g.getLeerLista());
       
        }else if(op==3){
            
                System.out.println("ACTUALIZADA:="+g.Actualizar());
        }else if(op==4){
          
                System.out.println("BORRADO:="+g.Borrar());
        }else if(op==5){
                JOptionPane.showMessageDialog(null,"Saliendo" );
        }else if(op<0&&op>5){
                System.out.println("error");
       } respuesta = JOptionPane.showInputDialog("ESCRIBE SI PARA IR AL MENU PRINCIPAL***"
               + " NO **PARA SALIR DEFINITIVO  ");
              
       respuesta=respuesta.toUpperCase();
     
     }while(!respuesta.equals("NO"));
                   
   }
                
}
             
