/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperatorio;
import recuperatorio.negocio.*;
import recuperatorio.entidades.*;

public class Recuperatorio {
    //probando hit
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aula a1=new Aula(1,20,"rojo");
        Materia m1=new Materia("ingles",1,"tds");
        Ficha f1= new Ficha(a1,m1,new Hora(15,0),new Hora(17,0),"lunes");
        
        
        Materia m2=new Materia("bd1",1,"tds");
        Ficha f2= new Ficha(a1,m2,new Hora(17,0),new Hora(19,0),"lunes");
        
        Registro r=new Registro();
        r.agregarFicha(f1);
        r.agregarFicha(f2);
        r.listarAulas("lunes");
        
        
        
        
    }
    
}
