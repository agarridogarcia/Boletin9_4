
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Tablas {
    
   
    
    public Tablas(){
        
    }
    public void calcularTablas(){
     
     int num;
     int i=1;
 
    do{
        num=Integer.parseInt(JOptionPane.showInputDialog("introduzca número"));
        if(num!=0)
        for(i=1;i<10;i++){
        System.out.println(num + "*" + i + "="+ num*i );}
        
   }while(num!=0);
        System.out.println("Adios!" );
    
        
    
   
    }
}
